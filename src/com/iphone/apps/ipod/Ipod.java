package com.iphone.apps.ipod;

import com.iphone.Dispositivo;

public abstract class Ipod implements Dispositivo{

	public abstract void iniciar();
	public abstract void parar();
	public abstract void adiantar();
	public abstract void retroceder();

}
