package com.cyber.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class PagingResponse<T> extends Response {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<T> data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int row;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
