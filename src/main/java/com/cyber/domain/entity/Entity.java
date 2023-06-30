package com.cyber.domain.entity;
import java.io.Serializable;

public class Entity implements Serializable {
    private static final long serialVersionUID = 1L;

    private String tenantCode;

    private int version;

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
