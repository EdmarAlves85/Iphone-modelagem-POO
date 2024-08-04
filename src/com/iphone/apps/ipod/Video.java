package com.iphone.apps.ipod;

import com.iphone.Acelerometro;

public class Video extends Ipod{

	public Video() {
	}
	
	private void modoPaisagem(Enum modoTela) {
		rotacionarTela(modoTela);
	}
	
	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		modoPaisagem(Acelerometro.PAISAGEM);
		System.out.println("Vídeo iniciado!");
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("Vídeo parado!");
		
	}

	@Override
	public void adiantar() {
		// TODO Auto-generated method stub
		System.out.println("Vídeo Adiantado!");
		
	}

	@Override
	public void retroceder() {
		// TODO Auto-generated method stub
		System.out.println("Vídeo retrocedido!");
		
	}
}
