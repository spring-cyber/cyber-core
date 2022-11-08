package com.cyber.domain.entity;

import java.util.List;

public class PagingData<T> extends Entity {

    private int row;

    private List<T> data;

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
