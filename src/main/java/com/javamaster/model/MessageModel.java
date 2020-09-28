package com.javamaster.model;

public class MessageModel {

    private String message;
    private String fromLogin;

    public String getMessage() {
        return message;
    }

    public void setMessage(String mesasge) {
        this.message = mesasge;
    }

    public String getFromLogin() {
        return fromLogin;
    }

    public void setFromLogin(String fromLogin) {
        this.fromLogin = fromLogin;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "message='" + message + '\'' +
                ", fromLogin='" + fromLogin + '\'' +
                '}';
    }
}
