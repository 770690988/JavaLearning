package com.example.ais_task2.response;

public class BaseException extends RuntimeException{
    public int errorCode;
    public BaseException(int errorCode,String msg){
        super(msg);
        this.errorCode=errorCode;
    }
}
