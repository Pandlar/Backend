package com.pandlar.finalpush.model;

public class PushNotification {

    String message;

    public PushNotification(){

    }

    public PushNotification(String message){
       this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message=message;
    }
}
