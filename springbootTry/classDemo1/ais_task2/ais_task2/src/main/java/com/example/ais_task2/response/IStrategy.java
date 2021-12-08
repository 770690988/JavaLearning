package com.example.ais_task2.response;

import org.springframework.http.ResponseEntity;

public interface IStrategy<T> {
    ResponseEntity<BaseResponse<T>> produce(T obj);
}
