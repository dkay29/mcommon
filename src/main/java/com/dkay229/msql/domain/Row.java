package com.dkay229.msql.domain;

import lombok.Data;

import java.util.List;

@Data
public class Row {
    private List<String>values;

    public Row(List<String> values) {
        this.values = values;
    }
}
