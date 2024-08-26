package com.dkay229.msql.domain;

import lombok.Data;

@Data
public class ColumnMetadata {
    public enum CoumnTypeEnum {
        STRING,
        FLOAT,
        DATE,
        INTEGER,
        BOOLEAN,
        VECTOR}
    String name;
    CoumnTypeEnum type ;
    int size;

    public ColumnMetadata(String name, CoumnTypeEnum type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }
}