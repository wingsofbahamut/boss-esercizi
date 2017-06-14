package it.Armando.entity;

public class Furgone extends Veicolo {

	private double capacita;

	public Furgone(String marca, String modello, String targa, int anno, double capacita) {
		super(marca, modello, targa, anno);
		this.capacita = capacita;
	}

	public double getCapacita() {
		return capacita;
	}

	public void setCapacita(double capacita) {
		this.capacita = capacita;
	}

}
