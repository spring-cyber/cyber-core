package com.cyber.domain.entity;

import javax.validation.constraints.NotBlank;

public class IdRequest extends Entity {

    @NotBlank
    private String id;

    private String tenantCode;

    private int version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
