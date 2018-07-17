package com.russell.video.services.Imp;

import com.russell.video.exceptions.DaoException;
import com.russell.video.services.WeChatService;
import com.russell.video.utils.CommonUtil;
import com.russell.video.utils.MyProps;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WeChatServiceImp implements WeChatService {


    @Autowired
    private MyProps myProps;

    /**
     * 通过code获取微信openid和sessionKey
     *
     * @param code
     * @return
     */
    @Override
    public Map<String, Object> getOpenIdByCode(String code) throws JSONException {

        Map<String, Object> map = new HashMap<>();
        String WX_URL = myProps.getWeChatLoginUrl();
        JSONObject jsonObject;
        String requestUrl = WX_URL.replace("APPID", myProps.getAppId()).
                replace("SECRET", myProps.getAppSecret()).replace("JSCODE", code);
        try {
            jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);
            if (jsonObject != null) {
                map.put("openid", jsonObject.getString("openid"));
                map.put("session_key", jsonObject.getString("session_key"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DaoException();
        }
        return map;
    }
}
