package org.geration.italy.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		String continua, nome, indirizzo;
		
		do {
			System.out.print("Aggiungi elemento alla tua lista dei desideri: ");
			lista.add(scan.nextLine());
			System.out.println("La tua lista contiene " + lista.size() + " elementi");
			do {
				System.out.print("Continuare? (s/n) ");
				continua = scan.nextLine();
				if (!continua.equals("s") && !continua.equals("n")) {
					System.out.println("Input non valido");
				}
			} while (!continua.equals("s") && !continua.equals("n"));
		} while (continua.equals("s"));
		
		System.out.print("Inserisci il tuo nome: ");
		nome = scan.nextLine();
		System.out.print("Iserisci il tuo indirizzo: ");
		indirizzo = scan.nextLine();
		
		try {
			LetteraBabboNatale lettera = new LetteraBabboNatale(nome, indirizzo, lista);
			lettera.invio();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		scan.close();
	}

}
