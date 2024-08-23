package com.dkay229.msql.domain;

public class ColumnMetadata {
    enum TypeEnum {
        STRING,
        FLOAT,
        DATE,
        INTEGER,
        BOOLEAN,
        VECTOR};
    String name;
    TypeEnum type ;
    int size;
}
