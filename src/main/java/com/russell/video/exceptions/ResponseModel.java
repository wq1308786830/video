package com.russell.video.exceptions;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:saas-account
 * PackageName: com.biosan.saasaccount.common
 * Date: 2018/4/18 14:08
 */
public class ResponseModel {
    public enum ResultEnum{
        success("success","成功"),
        fail("fail","失败");
        private String result;
        private String message;

        ResultEnum(String result, String message) {
            this.result = result;
            this.message = message;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public ResponseModel(String result, String message) {
        this.result = result;
        this.message = message;
    }

    private String result;

    private String message;

    private Object data;


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static String success() throws JsonProcessingException {
        ResponseModel responseModel = new ResponseModel(ResultEnum.success.getResult(), ResultEnum.success.getMessage());
        return new ObjectMapper().writeValueAsString(responseModel);
    }
    public static String success(Object data) throws JsonProcessingException {
        ResponseModel responseModel = new ResponseModel(ResultEnum.success.getResult(), ResultEnum.success.getMessage());
        responseModel.setData(data);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return new ObjectMapper().setDateFormat(formatter).writeValueAsString(responseModel);
    }

    public static String fail() throws JsonProcessingException {
        ResponseModel responseModel = new ResponseModel(ResultEnum.fail.getResult(), ResultEnum.fail.getMessage());
        return new ObjectMapper().writeValueAsString(responseModel);
    }

    public static String fail(String message) throws JsonProcessingException {
        ResponseModel responseModel = new ResponseModel(ResultEnum.fail.getResult(),message);
        return new ObjectMapper().writeValueAsString(responseModel);
    }

    public static ResponseModel successModel(){
        ResponseModel responseModel = new ResponseModel(ResultEnum.success.getResult(), ResultEnum.success.getMessage());
        return responseModel;
    }


    public static ResponseModel successModel(Object data){
        ResponseModel responseModel = new ResponseModel(ResultEnum.success.getResult(), ResultEnum.success.getMessage());
        responseModel.setData(data);
        return responseModel;
    }

    public static ResponseModel failModel(String message){
        return new ResponseModel(ResultEnum.fail.getResult(),message);
    }
}
