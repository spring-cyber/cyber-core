package com.cyber.domain.exception;

public class SystemException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String code;
	private String status;

    private String msg;

    public SystemException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public SystemException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}

	public SystemException(String msg, String code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}

	public SystemException(String code, String msg,Throwable e) {
		super(msg, e);
		this.code = code;
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
