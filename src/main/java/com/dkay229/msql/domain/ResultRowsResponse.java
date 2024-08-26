package com.dkay229.msql.domain;

import lombok.Data;

import java.util.List;

@Data
public class ResultRowsResponse {
    private List<Row> rows;

    public ResultRowsResponse(List<Row> rows) {
        this.rows = rows;
    }
}
