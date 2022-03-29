package br.com.gx.f1.controller.request;

import javax.validation.constraints.Email;

public class RequestUser {

	@Email
	private String email;

	private String nome;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
