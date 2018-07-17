package com.russell.video.mapper;

import com.russell.video.domain.User;

public interface UserMapper {

    User findByOpenId(String openId);

    int saveUser(User user);
}
