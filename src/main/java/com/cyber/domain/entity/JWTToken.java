package com.cyber.domain.entity;

import java.util.HashSet;

public class JWTToken<T> extends IdEntity {

    private String sessionId;
    private String sessionName;
    private String deviceId;
    private String token;

    private HashSet<String> roles;
    private String jwtToken;
    private T user;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public HashSet<String> getRoles() {
        return roles;
    }

    public void setRoles(HashSet<String> roles) {
        this.roles = roles;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }
}
