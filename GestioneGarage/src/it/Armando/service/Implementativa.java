package it.Armando.service;

import java.util.ArrayList;
import java.util.Scanner;

import it.Armando.entity.Auto;
import it.Armando.entity.Furgone;
import it.Armando.entity.Moto;
import it.Armando.entity.Veicolo;
import it.Armando.service.Main;

public class Implementativa implements Interfaccia {

	public static Scanner input = new Scanner(System.in);

	public Auto inserisciAuto() {

		System.out.println("Inserisci la marca: ");
		String marca = input.nextLine();
		System.out.println("Inserisci il modello: ");
		String modello = input.nextLine();
		System.out.println("Inserisci la targa: ");
		String targa = input.nextLine();
		System.out.println("Inserisci l'anno: ");
		int anno = input.nextInt();
		input.nextLine();
		System.out.println("Inserisci il tipo di alimentazione: ");
		String alimentazione = input.nextLine();
		System.out.println("Inserisci il numero di porte: ");
		int porte = input.nextInt();
		input.nextLine();
		Auto auto = new Auto(marca, modello, targa, anno, alimentazione, porte);
		return auto;
	}

	public Moto inserisciMoto() {
		System.out.println("Inserisci la marca: ");
		String marca = input.nextLine();
		System.out.println("Inserisci il modello: ");
		String modello = input.nextLine();
		System.out.println("Inserisci la targa: ");
		String targa = input.nextLine();
		System.out.println("Inserisci l'anno: ");
		int anno = input.nextInt();
		System.out.println("Inserisci i tempi: ");
		int tempi = input.nextInt();
		Moto moto = new Moto(marca, modello, targa, anno, tempi);
		return moto;
	}

	public Furgone inserisciFurgone() {
		System.out.println("Inserisci la marca: ");
		String marca = input.nextLine();
		System.out.println("Inserisci il modello: ");
		String modello = input.nextLine();
		System.out.println("Inserisci la targa: ");
		String targa = input.nextLine();
		System.out.println("Inserisci l'anno: ");
		int anno = input.nextInt();
		System.out.println("Inserisci la capacità: ");
		double capacita = input.nextInt();
		Furgone furgone = new Furgone(marca, modello, targa, anno, capacita);
		return furgone;
	}

	public void stampaRiepilogo(ArrayList<Veicolo> listaVeicoli) {
		System.out.println("Numero di posti occupati: " + listaVeicoli.size());
	}
	public void liberaPosto() {
		
	}		
}
