package com.dkay229.msql.domain;

import lombok.Data;

import java.util.List;

@Data
public class RowMetadata {
    List<ColumnMetadata> columnMetadata;

    public RowMetadata(List<ColumnMetadata> columnMetadata) {
        this.columnMetadata = columnMetadata;
    }
}