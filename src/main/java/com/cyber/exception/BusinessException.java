package com.cyber.exception;

public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String code;
	private String status;

    private String msg;

    public BusinessException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public BusinessException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
	
	public BusinessException(String msg, String code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}
	
	public BusinessException(String code, String msg,  Throwable e) {
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
