package com.dkay229.msql.domain;

import lombok.Data;

@Data
public class ExecuteQueryResponse {

    int statusCode;
    String errorMessage;
    RowMetadata rowMetadata;

    public ExecuteQueryResponse(int statusCode, String errorMessage, RowMetadata rowMetadata) {
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
        this.rowMetadata = rowMetadata;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public RowMetadata getRowMetadata() {
        return rowMetadata;
    }
}