package com.dkay229.msql.common;

import lombok.Getter;

public class MsqlException extends RuntimeException {
    @Getter
    private final MsqlErrorCode errorCode;
    private final String message ;
    public MsqlException(MsqlErrorCode errorCode) {
        this(errorCode,null);
    }
    public MsqlException(MsqlErrorCode errorCode, String message) {
        super(message==null?errorCode.getMessage():errorCode.getMessage()+" : "+message);
        this.errorCode = errorCode;
        this.message =message==null?errorCode.getMessage():errorCode.getMessage()+" : "+message;
    }

    public String getReason() {
        return String.format("MULS-%07d %s",errorCode.getCode(),message);
    }

    @Override
    public String toString() {
        return "MultiException{" +
                "errorCode=" + errorCode +
                ", message='" + message + '\'' +
                '}';
    }
}
