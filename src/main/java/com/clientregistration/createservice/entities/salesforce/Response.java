package com.clientregistration.createservice.entities.salesforce;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {

	private String statusCode;
	private String status;
	private String message;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
