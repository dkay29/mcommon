package com.dkay229.msql.common;

import org.junit.jupiter.api.Test;

import static com.dkay229.msql.common.MsqlErrorCode.MALFORMED_JDBC_URL;
import static org.junit.jupiter.api.Assertions.*;


class MsqlErrorCodeTest {
    @Test
    public void testException() {
            assertEquals("ErrorCode{code=1001, message='Bad JDBC URL'}",MALFORMED_JDBC_URL.toString());

    }
}