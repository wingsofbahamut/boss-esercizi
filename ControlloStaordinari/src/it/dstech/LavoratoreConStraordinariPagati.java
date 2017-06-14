package it.dstech;

public class LavoratoreConStraordinariPagati extends Lavoratore {

	int oreStraordinario;
	double retribuzioneOraria = 10.0;

	public LavoratoreConStraordinariPagati(String nome, int livello, int stipendio, int oreStraordinario) {
		super(nome, livello, stipendio);
		this.oreStraordinario = oreStraordinario;
	}

	public int getOreStraordinario() {
		return oreStraordinario;
	}
	
	public double getRetribuzioneOraria(){
		return retribuzioneOraria;
	}

	public void setOreStraordinario(int oreStraordinario) {
		this.oreStraordinario = oreStraordinario;
	}

	public void stampaStraordinari() {
		System.out.println("Ore di straordinario: " + getOreStraordinario());
	}

	public void stampaStipendio(int stipendio, int oreStaordinario, double retribuzioneOraria) {
		super.stampaStipendio();
		System.out.println("Lo stipendio con gli straordinari è: "
				+ (getStipendio() + (getOreStraordinario() * retribuzioneOraria)));
	}

}
