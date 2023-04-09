package com.cyber.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DataResponse<T> extends Response {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public DataResponse() {
    }

    public DataResponse(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DataResponse(int code, String message) {
        super(code, message);
    }

    public static <T> DataResponse<T> success(T data) {
        DataResponse<T> responseData = new DataResponse<>(0, null);
        responseData.setData(data);
        return responseData;
    }
}
