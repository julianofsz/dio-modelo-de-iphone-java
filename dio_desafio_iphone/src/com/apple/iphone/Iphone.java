package com.apple.iphone;

import com.apple.apps.AparelhoTelefonico;
import com.apple.apps.NavegadorDeInternet;
import com.apple.apps.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {
	
	 // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocar() {
    	System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
    	System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
    	System.out.println("Selecione uma música.");
    }

    // Implementação dos métodos de NavegadorDeInternet
    @Override
    public void exibirPagina() {
    	System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
    	System.out.println("Nova aba adicionada com sucesso.");
    }

    @Override
    public void atualizarPagina() {
    	System.out.println("Página atualizada.");
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar() {
    	System.out.println("Ligando...");
    }

    @Override
    public void atender() {
    	System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
    	System.out.println("Correio de voz iniciado.");
    }
	
}
