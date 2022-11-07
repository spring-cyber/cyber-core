package com.cyber.domain.entity;

import com.cyber.domain.constant.ResultCode;

import java.time.Instant;
import java.time.ZonedDateTime;

public class Response extends Entity {
    private int code = 0;
    private String message = "Success";

    private final Instant time;


    public Response() {
        this.time = ZonedDateTime.now().toInstant();
    }

    public Response(int code) {
        this.code = code;
        this.time = ZonedDateTime.now().toInstant();
    }

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
        this.time = ZonedDateTime.now().toInstant();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return "0".equals(code);
    }

    public static Response success() {
        return new Response(0);
    }

    public static Response fail(int code,String message) {
        return new Response(code,message);
    }


    public static Response fail(ResultCode resultCode) {
        return new Response(resultCode.getCode(), resultCode.getMessage());
    }

}
