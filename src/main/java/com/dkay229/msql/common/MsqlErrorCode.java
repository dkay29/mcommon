package com.dkay229.msql.common;

import lombok.Getter;

@Getter
public enum MsqlErrorCode {
    COULD_NOT_CONNECT(1001, "Could not connect to specified server"),
    MALFORMED_JDBC_URL(1001, "Bad JDBC URL"),

    LAST_ERROR_CODE(9999,"LAST CODE");

    private final int code;
    private final String message;

    MsqlErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("ErrorCode{code=%d, message='%s'}", code, message);
    }
}
