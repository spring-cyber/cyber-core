package com.cyber.constant;

public enum HttpResultCode implements ResultCode {
    SUCCESS(200, "0"),
    VALIDATE_ERROR(400, "000400"),
    BAD_AUTH(401, "000401"),
    NOT_RIGHT(403, "000403"),
    NOT_FOUND(404, "000404"),
    REST_METHOD_NOT_SUPPORT(405, "000405"),
    REQUEST_BODY_NULL(406, "000406"),
    PARAM_ERROR(412, "000412"),
    RECORD_NOT_EXIST(413, "000413"),
    RECORD_EXIST(414, "000414"),
    SERVER_ERROR(500, "000500"),
    BAD_SQL_ERROR(501, "000501"),
    SERVICE_INVOKE_EXCEPTION(502, "000502"),
    FILE_UPLOAD_ERROR(503, "000503"),
    FILE_DOWNLOAD_ERROR(504, "000504");


    private final int code;
    private final String message;

    HttpResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }


    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
