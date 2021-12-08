package com.lesson.design_pattern;

public class ResponseFactory {
    private static ResponseFactory instance = new ResponseFactory();
    private ResponseFactory(){}

    public static ResponseFactory getInstance(){
        return instance;
    }

    public BaseResponse make(Throwable t){
        BaseResponse br = new BaseResponse(t);
        return br;
    }

    public HeaderResponse make(String des){
        HeaderResponse hr = new HeaderResponse(des);
        return hr;
    }

}
