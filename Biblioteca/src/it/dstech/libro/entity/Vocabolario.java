package it.dstech.libro.entity;

public class Vocabolario extends Libro {

	private int numDefinizioni;

	public Vocabolario(int numPagine, int numDefinizioni) {
		super(numPagine);
		this.numDefinizioni = numDefinizioni;
	}

	public void definitionMessage() {
		super.pageMessage();
		System.out.println("Sono presenti " + numDefinizioni + " definizioni.");
		System.out.println("Media definizioni per pagina: " + (numDefinizioni / getNumPagine()) + ".");
	}

}
