package com.cyber.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class PagingEntity extends OperateEntity {

    @JsonIgnore
    private Integer offset;

    @JsonIgnore
    private Integer limit;

    @JsonIgnore
    private String sortBy;

    @JsonIgnore
    private String sortType;

    public static Integer getOffset(Integer offset) {
        return Objects.isNull(offset) ? 1 : offset;
    }


    public static Integer getLimit(Integer limit) {
        return Objects.isNull(limit) ? 15 : limit;
    }


    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }


    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }


    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }


    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }
}
