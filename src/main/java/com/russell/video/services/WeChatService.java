package com.russell.video.services;

import com.russell.video.domain.WeChatUser;

import java.io.IOException;

public interface WeChatService {

    /**
     * 获取用户openid登陆
     *
     * @param appid
     * @param js_code
     * @param grant_type
     * @param component_appid
     * @return
     * @throws IOException
     */
    WeChatUser getUserOpenId(String appid, String js_code, String grant_type, String component_appid) throws IOException;
}
