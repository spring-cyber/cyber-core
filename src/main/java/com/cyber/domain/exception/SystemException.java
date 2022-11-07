package com.cyber.domain.exception;

public class SystemException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private int code;
	private int status;
	private String message;

	public SystemException(String message) {
		super(message);
		this.message = message;
	}

	public SystemException(String message, Throwable e) {
		super(message, e);
		this.message = message;
	}

	public SystemException(String message, int code) {
		super(message);
		this.message = message;
		this.code = code;
	}

	public SystemException(int code, String message,  Throwable e) {
		super(message, e);

		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
