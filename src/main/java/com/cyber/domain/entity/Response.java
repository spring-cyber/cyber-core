package com.cyber.domain.entity;

import com.cyber.domain.constant.HttpResultCode;
import com.cyber.domain.constant.ResultCode;

import java.time.Instant;
import java.time.ZonedDateTime;

public class Response extends Entity {
    private Integer code = 200;

    private String message = "Success";

    private final Instant time;

    public Response() {
        this.time = ZonedDateTime.now().toInstant();
    }

    public Response(Integer code) {
        this.code = code;
        this.time = ZonedDateTime.now().toInstant();
    }

    public Response(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.time = ZonedDateTime.now().toInstant();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return HttpResultCode.SUCCESS.getCode().equals(code);
    }

    public static Response success() {
        return new Response(HttpResultCode.SUCCESS.getCode());
    }

    public static Response fail(Integer code,String message) {
        return new Response(code, message);
    }

    public static Response fail(ResultCode resultCode) {
        return new Response(resultCode.getCode(), resultCode.getMessage());
    }

}
