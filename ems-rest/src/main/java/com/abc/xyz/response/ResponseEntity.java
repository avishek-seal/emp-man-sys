package com.abc.xyz.response;

import java.io.Serializable;

public class ResponseEntity<T> implements Serializable{

	private static final long serialVersionUID = -1665241223740987518L;

	private boolean success;
	
	private int code;
	
	private String message;
	
	private T data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
