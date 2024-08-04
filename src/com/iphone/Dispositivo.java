/**
 * 
 */
package com.iphone;

/**
 * 
 */
public interface Dispositivo {

	public Boolean ligarDesligar = false;
	public Boolean btnHome = null;
	public int volume = 5;
	public Boolean sensorProximidade = false;
	public int sensorClaridade = 5;
	public Enum modoTela = Acelerometro.RETRATO;
	
	static void ligarDesligar(Boolean estado) {
		if (ligarDesligar != true) {
			System.out.println("Dispositivo ligado!");
		} else {
			System.out.println("Dispositivo Desligado!");
		}
	}
	
	static void aumentarVolume(int quantidade) {
		System.out.println("Aumentou o volume para: " + (volume + quantidade));
	}
	
	static void diminuirVolume(int quantidade) {
		System.out.println("Diminuiu o volume paar: " + (volume - quantidade));
	}
	
	static void sensorProximidade(Boolean estado) {
		if (sensorProximidade != false) {
			System.out.println("Tela Inativa!");
		} else {
			System.out.println("Tela Ativa!");
		}
	}
	
	static void sensorClaridade(int claridade) {
		if (sensorClaridade < claridade) {
			System.out.println("Claridade aumentada para: " + claridade);
		} else {
			System.out.println("Claridade diminuida para: " + claridade);
		}
	}
	
	default void rotacionarTela (Enum modoTela) {
		if (modoTela == Acelerometro.PAISAGEM) {
			System.out.println("Tela no modo: " + modoTela);
		} else {
			System.out.println("Tela no modo: " + Dispositivo.modoTela);
		}
		
	}
	
	default void ampliarTela() {
		System.out.println("Tela ampliada!");
	}
	
	default void reduzirTela() {
		System.out.println("Tela reduzida!");
	}
}
