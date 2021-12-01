package org.geration.italy.christmas;

import java.util.ArrayList;

public class LetteraBabboNatale {
	
	private String nome, indirizzo;
	private ArrayList<String> lista = new ArrayList<String>();
	
	public LetteraBabboNatale(String nome, String indirizzo, ArrayList<String> lista) throws Exception {
		
		if(lista.size() > 5) {
			throw new Exception("La lettera deve contenere al massimo 5 desideri");
		}else {
			this.lista = lista;
		}
			
		if (nome.isEmpty()) {
			this.nome = "Anonimo";
		}else {
			this.nome = nome;
		}
		
		if(indirizzo.isEmpty()) {
			throw new Exception("La lettera deve avere un indirizzo");
		}else {
			this.indirizzo = indirizzo;
		}
	}
	
	public void invio() {
		System.out.println(nome);
		System.out.println(indirizzo);
		System.out.println("Desideri :");
		for(String s: lista) {
			System.out.println(s);
		}
		
	}
	
}
