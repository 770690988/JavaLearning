package com.example.ais_task2.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseExceptionStrategy implements IStrategy<BaseException>{
    @Override
    public ResponseEntity<BaseResponse<BaseException>> produce(BaseException t) {
        BaseResponse<BaseException> baseResponse=new BaseResponse<>(t.errorCode,t.getMessage(),null);
        String httStatusStr= baseResponse.error.toString().substring(0,3);
        int httpStatusCode=Integer.parseInt(httStatusStr);
        HttpStatus httpStatus= HttpStatus.resolve(httpStatusCode);
        if(httpStatus==null){
            httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return ResponseEntity.status(httpStatus).body(baseResponse);
    }
}
