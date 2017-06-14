package it.Armando.entity;

public class Auto extends Veicolo {

	private String alimentazione;
	private int porte;

	public Auto(String marca, String modello, String targa, int anno, String alimentazione, int porte) {
		super(marca, modello, targa, anno);
		this.alimentazione = alimentazione;
		this.porte = porte;
	}

	public String getAlimentazione() {
		return alimentazione;
	}

	public int getPorte() {
		return porte;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

}
