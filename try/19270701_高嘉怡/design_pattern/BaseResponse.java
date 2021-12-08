package com.lesson.design_pattern;

public class BaseResponse<T> implements Response{

    public int error;
    public String msg;
    public T data;
    public BaseResponse(T data){
        this.error=0;
        this.msg="success";
        this.data=data;
    }

    public BaseResponse(int error,String msg){
        this.error=error;
        this.msg=msg;
    }

    @Override
    public void doPrint(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "error=" + error +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
