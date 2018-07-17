package com.russell.video.exceptions;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:saas-account
 * PackageName: com.biosan.saasaccount.Exception
 * Date: 2018/4/18 15:14
 */
public enum ExceptionConts {

    PARAMS_REQUIRE_ERROR(30001, "缺少必要参数"),
    WECHAT_TOKEN_ERROR(50001,"token失效"),
    WECHAT_MOBILECODE_ERROR(50002,"验证码错误"),
    WECHAT_USER_NOT_REGISTER(50003,"未注册用户"),
    ;


    private Integer code;

    private String message;


     ExceptionConts(int code,String message){
        this.code = code;
        this.message = message;

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
