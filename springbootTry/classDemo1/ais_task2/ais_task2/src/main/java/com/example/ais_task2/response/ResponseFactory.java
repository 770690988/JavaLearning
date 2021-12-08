package com.example.ais_task2.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseFactory {
    private final BaseExceptionStrategy baseExceptionStrategy =new BaseExceptionStrategy();

    @SuppressWarnings({"unchecked", "rawtypes"})
    public <T> ResponseEntity<BaseResponse<?>> produce(T obj){
        if(obj instanceof BaseException){
            return (ResponseEntity) baseExceptionStrategy.produce((BaseException) obj);
        }
        if(obj instanceof Throwable){
            BaseResponse baseResponse=new BaseResponse(50000,((Throwable) obj).getMessage(),null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(baseResponse);
        }
        return (ResponseEntity)ResponseEntity.ok(obj);
    }
}
