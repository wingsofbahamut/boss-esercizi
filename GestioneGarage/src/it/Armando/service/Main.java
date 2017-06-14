package it.Armando.service;

import java.util.ArrayList;
import java.util.Scanner;

import it.Armando.entity.Auto;
import it.Armando.entity.Furgone;
import it.Armando.entity.Moto;
import it.Armando.entity.Veicolo;

public class Main {

	private static Auto auto;
	private static Moto moto;
	private static Furgone furgone;
	private static ArrayList<Veicolo> listaVeicoli = new ArrayList<Veicolo>();
	private static boolean esegui = true;
	private static Implementativa implementato = new Implementativa();
	private static Scanner in = new Scanner(System.in);
	private static String sel;

	public static void main(String[] args) {
		mainmenu();
	}

	public static void mainmenu() {
		try {
			leggi();
			do {
				switch (sel) {
				case "1":
					implementato.inserisciAuto();
					listaVeicoli.add(auto);
					System.out.println("Posto N°: " + (listaVeicoli.indexOf(auto)) + 1);
					break;
				case "2":
					implementato.inserisciMoto();
					listaVeicoli.add(moto);
					System.out.println("Posto N°: " + (listaVeicoli.indexOf(moto)) + 1);
					break;
				case "3":
					implementato.inserisciFurgone();
					listaVeicoli.add(furgone);
					System.out.println("Posto N°: " + (listaVeicoli.indexOf(furgone)) + 1);
					break;
				case "4":
					implementato.stampaRiepilogo(listaVeicoli);
					break;
				case "5":
					implementato.liberaPosto();
					break;
				case "0":
					System.exit(0);
					break;
				default:
					System.out.println("ERRORE: Digita un comando valido.\n");
					mainmenu();
					break;
				}
			} while (esegui == true);
		} catch (Exception e) {
			System.out.println("ERRORE: Digita un comando valido.\n");
			mainmenu();
		}
	}
	
	public static String leggi(){
		System.out.println("Digita il tasto corrispondente al comando richiesto e premi INVIO: "
				+ "\n---------------------------\n" + "| 1. Inserisci un auto    |\n"
				+ "| 2. Inserisci una moto   |\n" + "| 3. Inserisci un furgone |\n"
				+ "| 4. Riepilogo            |\n" + "| 5. Libera un posto      |\n"
				+ "| 0. Esci dal programma   |\n" + "---------------------------\n");
		String sel = in.nextLine();
		return sel;
	}
}
