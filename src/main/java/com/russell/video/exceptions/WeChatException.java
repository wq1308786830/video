//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.russell.video.exceptions;

import java.io.Serializable;

public class WeChatException extends RuntimeException implements Serializable {
    private Integer errorcode;
    private String message;

    public WeChatException(Integer errorcode, String message) {
        this.errorcode = errorcode;
        this.message = message;
    }

    public Integer getErrorcode() {
        return this.errorcode;
    }

    public void setErrorcode(Integer errorcode) {
        this.errorcode = errorcode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
