package com.iphone.model;

import com.iphone.interfaces.AparelhoTelefonico;
import com.iphone.interfaces.NavegadorInternet;
import com.iphone.interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando música");
	}
	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Música pausada");
	}
	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Faixa " + musica + " selecionada");
	}
	
	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ligando para " + numero);
	}
	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Alô?");
	}
	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Correio de voz iniciado");
	}
	
	@Override
	public void exibirPaginas(String url) {
		// TODO Auto-generated method stub
		System.out.println("Acessando " + url);
	}
	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Abrindo nova página");
	}
	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando página");
	}
}
