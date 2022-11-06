package com.cyber.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

public class PagingResponse<T> extends DataResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int row;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
