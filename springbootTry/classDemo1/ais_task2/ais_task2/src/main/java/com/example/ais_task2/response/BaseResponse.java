package com.example.ais_task2.response;

public class BaseResponse<T> {
    public Integer error;
    public String msg;
    public T data;

    public BaseResponse(Integer error, String msg, T data) {
        this.error = error;
        this.msg = msg;
        this.data = data;
    }
}
