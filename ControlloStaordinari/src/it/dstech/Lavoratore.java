package it.dstech;

public class Lavoratore {

	private String nome;
	private int livello;
	private int stipendio;

	public Lavoratore(String nome, int livello, int stipendio) {
		this.nome = nome;
		this.livello = livello;
		this.stipendio = stipendio;
	}

	public void stampaStipendio() {
		System.out.println("Stipendio mensile: " + getStipendio());
	}
	
	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
	public int getLivello() {
		return livello;
	}
	
	public void setLivello(int livello) {
		this.livello = livello;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}

