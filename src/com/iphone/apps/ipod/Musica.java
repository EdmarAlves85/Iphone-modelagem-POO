package com.iphone.apps.ipod;

import com.iphone.model.Artistas;

public class Musica extends Ipod {

	Artistas artista;
	
	public Musica() {
	}
	
	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		System.out.println("Música iniciada!");
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("Música parada!");
		
	}

	@Override
	public void adiantar() {
		// TODO Auto-generated method stub
		System.out.println("Música Adiantada!");
		
	}

	@Override
	public void retroceder() {
		// TODO Auto-generated method stub
		System.out.println("Música retrocedida!");
		
	}
	
	public void informacoesArtista(Artistas artista) {
		System.out.println(artista);
	}

	public void favoritar(Artistas artista) {
		System.out.println("Adicionado aos favoritos!");
	}
	
}
