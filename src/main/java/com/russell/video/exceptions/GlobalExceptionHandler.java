package com.russell.video.exceptions;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:saas-account
 * PackageName: com.biosan.saasaccount.exceptions
 * Date: 2018/4/24 09:36
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ParamsException.class)
    @ResponseBody
    public String handleParamsException(ParamsException e) throws JsonProcessingException {
        e.printStackTrace();
        return ResponseModel.fail(ExceptionConts.PARAMS_REQUIRE_ERROR.getMessage());
    }

    @ExceptionHandler(WeChatException.class)
    @ResponseBody
    public String handleWeChatException(WeChatException e) throws JsonProcessingException {
        e.printStackTrace();
        return ResponseModel.fail(e.getMessage());
    }

    @ExceptionHandler(DaoException.class)
    @ResponseBody
    public String handleDaoException(DaoException e) throws JsonProcessingException {
        e.printStackTrace();
        return ResponseModel.fail(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleException(Exception e) {
        e.printStackTrace();
        try {
            return ResponseModel.fail();
        } catch (JsonProcessingException e1) {
            return "{\"result\":\"fail\",\"message\":\"失败\"}";
        }
    }
}
