package com.iphone.aplic;

import com.iphone.model.IPhone;

public class Acesso {
	public static void main(String[] args) {
		IPhone celNovo = new IPhone();
		
		//Reprodutor
		celNovo.selecionarMusica("Before I forget");
		celNovo.tocar();
		celNovo.pausar();
		
		//Telefone
		celNovo.ligar("1599100-5385");
		celNovo.atender();
		celNovo.iniciarCorreioVoz();
		
		//Navegador
		celNovo.adicionarNovaAba();
		celNovo.exibirPaginas("https://github.com/CaioSilva584");
		celNovo.atualizarPagina();
	}
}
