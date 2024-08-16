package com.dkay229.msql.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.dkay229.msql.common.MsqlErrorCode.COULD_NOT_CONNECT;
import static org.junit.jupiter.api.Assertions.*;
class MsqlExceptionTest {
    MsqlException ex = new MsqlException(COULD_NOT_CONNECT,"reason");

    @Test
    void getErrorCode() {
        assertEquals(COULD_NOT_CONNECT,ex.getErrorCode());
    }

    @Test
    void getReason() {
        assertEquals("MULS-0001001 Could not connect to specified server : reason",ex.getReason());
    }

    @Test
    void testToString() {
        assertEquals("MultiException{errorCode=ErrorCode{code=1001, message='Could not connect to specified server'}, message='Could not connect to specified server : reason'}",ex.toString());

    }
}