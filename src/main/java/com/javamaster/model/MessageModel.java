package com.javamaster.model;

public class MessageModel {

    private String mesasge;
    private String fromLogin;

    public String getMesasge() {
        return mesasge;
    }

    public void setMessage(String mesasge) {
        this.mesasge = mesasge;
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
                "mesasge='" + mesasge + '\'' +
                ", fromLogin='" + fromLogin + '\'' +
                '}';
    }
}
