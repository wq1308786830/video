package com.russell.video.services;

import com.russell.video.domain.WeChatUser;

public interface UserService {

    WeChatUser login(String code);

}
