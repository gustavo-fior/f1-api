package br.com.gx.f1_email.controller.request;

import javax.validation.constraints.Email;

public class RequestEmail {

	@Email
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
