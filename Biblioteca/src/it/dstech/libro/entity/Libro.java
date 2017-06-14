package it.dstech.libro.entity;

public class Libro {

	private int numPagine;

	public Libro(int numPagine) {
		this.numPagine = numPagine;
	}

	public int getNumPagine() {
		return numPagine;
	}

	public void setNumPagine(int numPagine) {
		this.numPagine = numPagine;
	}

	public void pageMessage() {
		System.out.println("Sono presenti " + getNumPagine() + " pagine.");
	}

}
