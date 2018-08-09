package com.davidrock.picpay.picpay.models;

public class DefaultResponse {
    private String Message;
    private Boolean Success;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Boolean getSuccess() {
        return Success;
    }

    public void setSuccess(Boolean success) {
        Success = success;
    }

    public DefaultResponse() {
    }

    public DefaultResponse(String message, Boolean success) {
        Message = message;
        Success = success;
    }


}
