package com.russell.video.services;

import com.russell.video.domain.User;

public interface UserService {

    User login(String code);

}
