package it.Armando.entity;

public class Moto extends Veicolo {

	private int tempi;

	public Moto(String marca, String modello, String targa, int anno, int tempi) {
		super(marca, modello, targa, anno);
		this.tempi = tempi;
	}

	public int getTempi() {
		return tempi;
	}

	public void setTempi(int tempi) {
		this.tempi = tempi;
	}

}
