package com.iphone.programa;

import com.iphone.Dispositivo;
import com.iphone.apps.ipod.Musica;
import com.iphone.apps.ipod.Video;

public class Iphone {

	public static void main(String[] args) {
		Dispositivo.ligarDesligar(true);
		Musica musica = new Musica();
		musica.iniciar();
		Video video = new Video();
		video.iniciar();
	}

}
