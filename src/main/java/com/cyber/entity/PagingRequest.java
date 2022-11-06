package com.cyber.entity;

import java.util.Date;

public class PagingRequest extends Entity {

    private Integer page = 1;
    private Integer pageSize = 15;

    private String sortBy = "";
    private String sortType = "desc";

    private Date startDate;
    private Date endDate;


    public Integer getLimit() {
        return getPageSize();
    }

    public Integer getOffset() {
        Integer page = getPage();
        Integer pageSize = getPageSize();
        return (page - 1) * pageSize;
    }

    public Integer getPage() {
        return page <= 0 ? 1 : page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        if (this.pageSize > 1000) {
            return 999;
        }
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
