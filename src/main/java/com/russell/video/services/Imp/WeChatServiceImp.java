package com.russell.video.services.Imp;

import com.russell.video.domain.WeChatUser;
import com.russell.video.services.WeChatService;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeChatServiceImp implements WeChatService {

    @Override
    public WeChatUser getUserOpenId(String appid, String js_code, String grant_type, String component_appid) throws IOException {
        return null;
    }
}
