package com.dkay229.msql.domain;

import java.util.List;

public class DomainClasses {
    static final long VERSION = 1;
    enum CoumnTypeEnum {
        STRING,
        FLOAT,
        DATE,
        INTEGER,
        BOOLEAN,
        VECTOR}

    public class ColumnMetadata {

        String name;
        CoumnTypeEnum type ;
        int size;
    }
    public class RowMetadata {
        List<ColumnMetadata> columnMetadata;
    }
    public class ExecuteQueryResponse {
        int statusCode;
        String errorMessage;
        RowMetadata rowMetadata;
    }
}
