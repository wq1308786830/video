package com.russell.video.domain;

import java.io.Serializable;

public class WeChatUser implements Serializable {
    private String openid;
    private String sessionkey;
    private String unionid;

    public WeChatUser() {
    }

    public String getUnionid() {
        return this.unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getOpenid() {
        return this.openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSessionkey() {
        return this.sessionkey;
    }

    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey;
    }
}