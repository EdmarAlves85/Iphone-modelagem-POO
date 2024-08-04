package com.iphone.model;

public class Contatos {
	
	private String nome;
	private String numeroTelefone;
	private String email;
	
	public Contatos() {
	}

	public Contatos(String nome, String numeroTelefone, String email) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contatos [nome=" + nome + ", numeroTelefone=" + numeroTelefone + ", email=" + email + "]";
	}
	
}
