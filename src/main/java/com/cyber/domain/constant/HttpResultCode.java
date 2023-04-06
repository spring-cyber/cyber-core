package com.cyber.domain.constant;

public enum HttpResultCode implements ResultCode {
    SUCCESS(200, "Success"),
    VALIDATE_ERROR(400, "Bad Request"),
    BAD_AUTH(401, "Unauthorized"),
    NOT_RIGHT(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    REST_METHOD_NOT_SUPPORT(405, "Method Not Allowed"),
    REQUEST_BODY_NULL(406, "Request Body Null"),
    PARAM_ERROR(412, "Param Error"),
    RECORD_NOT_EXIST(413, "Data Not Exist"),
    RECORD_EXIST(414, "Data Already Exist"),
    SERVER_ERROR(500, "Internal Server Error"),
    BAD_SQL_ERROR(501, "Bad Sql Error"),
    SERVICE_INVOKE_EXCEPTION(502, "Service Invoke Exception"),
    FILE_UPLOAD_ERROR(503, "File Upload Error"),
    FILE_DOWNLOAD_ERROR(504, "File Download Error");

    private final Integer code;
    private final String message;

    HttpResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
