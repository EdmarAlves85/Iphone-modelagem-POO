package com.iphone.apps.telefone;

import com.iphone.Dispositivo;
import com.iphone.model.Contatos;

public class telefone implements Dispositivo{

	private Contatos contato;
	
	public void ligar() {
		System.out.println("Ligando para... " + contato);
	}
	
	public void listarContatos() {
		System.out.println("Listando todos os contatos...");
	}
	
	public void listarRecentes() {
		System.out.println("Listando todos os contatos recentes...");
	}
	
	public void favoritarContato() {
		System.out.println(contato + " adicionado aos favoritos!");
	}
	
	public void informacoesContato() {
		System.out.println(contato);
	}
	
	public void enviarMensagem() {
		System.out.println("Enviando uma mensagem para..." + contato.getNome());
	}
	
	public void monitorarMensagem() {
		System.out.println("Mensagem recebida de... " + contato.getNome());
	}
}
