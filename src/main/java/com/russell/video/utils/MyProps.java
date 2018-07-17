package com.russell.video.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myprops")
public class MyProps {

    private String appId;
    private String appSecret;
    private String appToken;
    private String appKey;
    private String appUrl;
    private String weChatAddress;
    private String weChatLoginUrl;
    private String userSessionTimeout;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getWeChatAddress() {
        return weChatAddress;
    }

    public void setWeChatAddress(String weChatAddress) {
        this.weChatAddress = weChatAddress;
    }

    public String getWeChatLoginUrl() {
        return weChatLoginUrl;
    }

    public void setWeChatLoginUrl(String weChatLoginUrl) {
        this.weChatLoginUrl = weChatLoginUrl;
    }

    public String getUserSessionTimeout() {
        return userSessionTimeout;
    }

    public void setUserSessionTimeout(String userSessionTimeout) {
        this.userSessionTimeout = userSessionTimeout;
    }
}
