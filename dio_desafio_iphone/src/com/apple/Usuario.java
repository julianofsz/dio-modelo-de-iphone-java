package com.apple;

import com.apple.apps.AparelhoTelefonico;
import com.apple.apps.NavegadorDeInternet;
import com.apple.apps.ReprodutorMusical;
import com.apple.iphone.Iphone;

public class Usuario extends Iphone {
	public static void main(String[] args) {
		Iphone i = new Iphone();
		
		AparelhoTelefonico telefone = i;
		NavegadorDeInternet navegador = i;
		ReprodutorMusical musica = i;
		
		System.out.println("Player de música\n");
		musica.selecionarMusica();
		musica.tocar();
		musica.pausar();
		
		System.out.println("\n=======================\n");
		
		System.out.println("Telefone\n");
		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorreioDeVoz();
		
		System.out.println("\n=======================\n");
		
		System.out.println("Navegador de Internet\n");
		navegador.adicionarNovaAba();
		navegador.exibirPagina();
		navegador.atualizarPagina();
	}
}
