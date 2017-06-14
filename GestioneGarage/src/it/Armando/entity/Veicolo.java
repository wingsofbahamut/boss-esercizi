package it.Armando.entity;

public class Veicolo {

	private String marca;
	private String modello;
	private String targa;
	private int anno;

	public Veicolo(String marca, String modello, String targa, int anno) {
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.anno = anno;
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public String getTarga() {
		return targa;
	}

	public int getAnno() {
		return anno;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

}
