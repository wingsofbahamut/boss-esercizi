package it.dstech;

import java.util.Random;
import java.util.Scanner;

public class Game {

	static char[][] database = { { 'g', 'a', 't', 't', 'o' }, { 'c', 'o', 'r', 's', 'o' },
			{ 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'a' }, { 'g', 'i', 'o', 'c', 'o' },
			{ 'a', 's', 't', 'r', 'o', 'n', 'a', 'v', 'e' }, { 's', 't', 'a', 'd', 'i', 'o' },
			{ 'u', 'm', 'a', 'n', 'o' }, { 'b', 'a', 'r', 'c', 'a' }, { 'r', 'i', 'c', 'o', 'r', 'd', 'o' },
			{ 't', 'e', 'm', 'p', 'o' } };
	static int tentativi = 6;
	static int scelta = 0;
	static boolean fine = false;
	static Scanner input = new Scanner(System.in);
	static char[] nascondi;

	public static void main(String[] args) {

		NewGame();
		while (fine == false) {

			menu();

		}

		System.exit(0);

	}

	private static int RandomNum(int Lunghezza) {

		Random NumeroRandom = new Random();
		return NumeroRandom.nextInt(Lunghezza);

	}

	private static void NewGame() {

		tentativi = 6;
		scelta = RandomNum(database.length);
		char[] nascondi = new char[database[scelta].length];
		for (int i = 0; i <= nascondi.length - 1; i++) {
			nascondi[i] = '_';
		}

		System.out.println("La parola misteriosa è: " + new String(nascondi));

	}

	private static void menu() {

		System.out.println("Digita il numero corrispondente al comando richiesto:");
		System.out.println("1. Inserisci una lettera");
		System.out.println("2. Dai la soluzione");
		System.out.println("3. Ricomincia");
		System.out.println("4. Esci dal gioco");
		int sel = input.nextInt();
		switch (sel) {

		case 1:

			lettera();
			break;

		case 2:

			soluzione();
			break;

		case 3:

			NewGame();
			break;

		case 4:

			fine = true;
			break;

		default:

			System.out.println("Comando non valido. Inserisci un comando valido.");
			break;

		}

	}

	private static void lettera() {
		boolean trova = false;
		System.out.println("Inserisci una lettera: ");
		char leggi = input.next().charAt(0);
		for (int i = 0; i < database[scelta].length - 1; i++) {
			if (leggi == database[scelta][i]) {
				if (nascondi[i] == '_') {
					trova = true;
					nascondi[i] = leggi;
				}
			}
		}

		if (trova == true) {
			System.out.println("Indizi attuali: " + new String(nascondi));
			boolean check = false;
			for (int i = 0; i < nascondi.length - 1; i++) {
				if (nascondi[i] == '_') {
					check = true;
				}
			}
			if (check = false) {
				System.out.println("CONGRATULAZIONI! Hai vinto!");
				System.out.println("Nuova Partita");
				NewGame();
			}
		}

		else {
			tentativi--;
			if (tentativi == 0) {
				System.out.println("Tentativi esauriti. Hai perso! La parola era: " + new String(database[scelta]));
				System.out.println("Nuova Partita!");
				NewGame();

			} else {
				tentativi--;
				System.out.println("La lettera non è presente! Hai ancora " + tentativi + " tentativi/o!");
				System.out.println("Indizi attuali: " + new String(nascondi));
			}
		}
	}

	private static void soluzione() {
		System.out.println("Inserisci una parola: ");
		String leggi = input.next();
		if (leggi == new String(database[scelta])) {
			System.out.println("CONGRATULAZIONI! Hai vinto!");
			System.out.println("Nuova Partita");
			NewGame();
		} else {
			tentativi--;
			if (tentativi == 0) {
				System.out.println("Tentativi esauriti. Hai perso! La parola era: " + new String(database[scelta]));
				System.out.println("Nuova Partita");
				NewGame();

			} else {
				tentativi--;
				System.out.println("Hai sbagliato! Hai ancora " + tentativi + " tentativi/o!");
				System.out.println("Indizi attuali: " + new String(nascondi));
			}
		}
	}
}
