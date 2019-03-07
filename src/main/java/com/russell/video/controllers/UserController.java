package com.russell.video.controllers;

import com.russell.video.domain.User;
import com.russell.video.services.UserService;
import com.russell.video.services.WeChatService;
import com.russell.video.utils.Result;
import com.russell.video.utils.ResultCode;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private WeChatService weChatService;

    @PostMapping("/login")
    @Transactional(rollbackFor = RuntimeException.class)
    public Result login(String code) {
        if (StringUtils.isEmpty(code)) {
            return Result.failure(ResultCode.PARAM_IS_BLANK, "微信code为空！");
        }
        JSONObject jsonObject = new JSONObject();
        try {
            User user = userService.login(code);
            Map<String, Object> wxData = weChatService.getOpenIdByCode(code);
            jsonObject.put("user", user);
            jsonObject.put("token", user);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(ResultCode.INTERFACE_INNER_INVOKE_ERROR, "登录失败！");
        }
        return Result.success(jsonObject);
    }
}
