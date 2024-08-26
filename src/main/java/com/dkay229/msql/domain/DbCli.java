package com.dkay229.msql.domain;

import java.util.List;

public class DbCli {
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

        public ColumnMetadata(String name, CoumnTypeEnum type, int size) {
            this.name = name;
            this.type = type;
            this.size = size;
        }
    }
    public class RowMetadata {
        List<ColumnMetadata> columnMetadata;

        public RowMetadata(List<ColumnMetadata> columnMetadata) {
            this.columnMetadata = columnMetadata;
        }
    }
    public class ExecuteQueryResponse {
        int statusCode;
        String errorMessage;
        RowMetadata rowMetadata;

        public ExecuteQueryResponse(int statusCode, String errorMessage, RowMetadata rowMetadata) {
            this.statusCode = statusCode;
            this.errorMessage = errorMessage;
            this.rowMetadata = rowMetadata;
        }
    }
}
