package com.cyber.entity;

public class PagingData<T> extends Entity {

    private int row;

    private T data;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
