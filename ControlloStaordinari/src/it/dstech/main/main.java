package it.dstech.main;

import java.util.Scanner;

import it.dstech.Lavoratore;
import it.dstech.LavoratoreConStraordinariPagati;

public class main {

	public static String nome;
	public static int stipendio;
	public static int livello;
	public static int oreStraordinario;

	public static void main(String[] args) {

		leggi();
		stanzia();
		System.out.println(lavoratore);
			
		}
	}

	private static void leggi() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il nome del lavoratore: ");
		String nome = input.nextLine();
		System.out.println("Inserisci lo stipendio: ");
		int stipendio = input.nextInt();
		System.out.println("Inserisci il livello: ");
		int livello = input.nextInt();
		System.out.println("Inserisci le ore di straordinari: ");
		int oreStraordinario = input.nextInt();
	}

	private static void stanzia() {
		
		if (oreStraordinario >= 1) {
			LavoratoreConStraordinariPagati lavoratore = new LavoratoreConStraordinariPagati(nome, livello, stipendio, oreStraordinario);

	} else {
		Lavoratore lavoratore = new Lavoratore(nome, livello, stipendio);
	}

}
}	
