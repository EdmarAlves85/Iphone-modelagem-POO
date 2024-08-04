package com.iphone.model;

public class Artistas {

	private String nome;
	private String estilo;
	
	public Artistas() {
	}

	public Artistas(String nome, String estilo) {
		this.nome = nome;
		this.estilo = estilo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Artistas [nome=" + nome + ", estilo=" + estilo + "]";
	}
	
}
