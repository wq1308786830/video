package com.russell.video.controllers;

import com.russell.video.domain.User;
import com.russell.video.services.UserService;
import com.russell.video.utils.Result;
import com.russell.video.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @Transactional(rollbackFor = RuntimeException.class)
    public Result login(String code) throws IllegalAccessException, NoSuchAlgorithmException, IOException {
        if (StringUtils.isEmpty(code)) {
            return Result.failure(ResultCode.PARAM_IS_BLANK, "微信code为空！");
        }

        User user = null;
        try {
            user = userService.login(code);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(ResultCode.PARAM_IS_BLANK, "登录失败！");
        }
        return Result.success(user);
    }
}
