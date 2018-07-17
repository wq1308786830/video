package com.russell.video.exceptions;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:saas-account
 * PackageName: com.biosan.saasaccount
 * Date: 2018/4/18 15:10
 */
public class DaoException extends RuntimeException {
    /**
     * 错误信息
     */
    private String exMessage;
    /**
     * 错误码
     */
    private String exCode;
    /**
     * 错误参数
     */
    private String[] exParams;

    public DaoException() {
        super();
    }

    public DaoException(String exMessage) {
        this.exMessage = exMessage;
    }

    public DaoException(String exMessage, String exCode) {
        this.exMessage = exMessage;
        this.exCode = exCode;
    }

    public DaoException(String exMessage, String exCode, String[] exParams) {
        this.exMessage = exMessage;
        this.exCode = exCode;
        this.exParams = exParams;
    }

    public DaoException(String message, Throwable cause, String exMessage, String exCode, String[] exParams) {
        super(message, cause);
        this.exMessage = exMessage;
        this.exCode = exCode;
        this.exParams = exParams;
    }

    public String getExMessage() {
        return exMessage;
    }

    public void setExMessage(String exMessage) {
        this.exMessage = exMessage;
    }

    public String getExCode() {
        return exCode;
    }

    public void setExCode(String exCode) {
        this.exCode = exCode;
    }

    public String[] getExParams() {
        return exParams;
    }

    public void setExParams(String[] exParams) {
        this.exParams = exParams;
    }

    @Override
    public String getMessage() {
        if (exMessage != null) {
            return getExMessage();
        }
        return super.getMessage();
    }
}
