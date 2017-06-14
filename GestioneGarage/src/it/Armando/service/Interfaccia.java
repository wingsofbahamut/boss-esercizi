package it.Armando.service;

import it.Armando.entity.Auto;
import it.Armando.entity.Furgone;
import it.Armando.entity.Moto;

public interface Interfaccia {

	Auto inserisciAuto();

	Moto inserisciMoto();

	Furgone inserisciFurgone();

	void stampaRiepilogo();

	void liberaPosto();

}
