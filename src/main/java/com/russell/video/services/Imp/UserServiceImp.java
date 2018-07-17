package com.russell.video.services.Imp;

import com.russell.video.domain.User;
import com.russell.video.exceptions.DaoException;
import com.russell.video.mapper.UserMapper;
import com.russell.video.services.UserService;
import com.russell.video.services.WeChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private WeChatService weChatService;

    /**
     * 通过微信code登录
     *
     * @param code
     * @return
     */
    @Override
    public User login(String code) {

        String token = null;
        Map<String, Object> wxData = null;
        User user = null;
        try {
            wxData = weChatService.getOpenIdByCode(code);
        } catch (IOException e) {
            e.printStackTrace();
            throw new DaoException();
        }
        if (wxData.get("openid") != null) {
            user = userMapper.findByOpenId(wxData.get("openid").toString());
            if (user == null) {
                user = new User();
                user.setUserId(java.util.UUID.randomUUID().toString());
                user.setOpenId(wxData.get("openid").toString());
                user.setCreateDateTime(new Date());
                user.setUpdateDateTime(new Date());
                user.setUserState(1);
                userMapper.saveUser(user);
            }
        }
        return user;
    }
}
