package com.russell.video.services;

import java.io.IOException;
import java.util.Map;

public interface WeChatService {

    /**
     * 登陆获取用户openid sessionKey
     * @param code
     * @return
     * @throws IOException
     */
    Map<String, Object> getOpenIdByCode(String code) throws IOException;
}
