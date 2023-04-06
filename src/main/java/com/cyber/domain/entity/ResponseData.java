package com.cyber.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ResponseData<T> extends Response {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public ResponseData() {
    }

    public ResponseData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseData(int code, String message) {
        super(code, message);
    }

    public static <T> ResponseData<T> success(T data) {
        ResponseData<T> responseData = new ResponseData<>(0, null);
        responseData.setData(data);
        return responseData;
    }
}
