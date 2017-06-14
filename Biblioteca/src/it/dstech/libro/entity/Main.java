package it.dstech.libro.entity;

public class Main {

	public static void main(String[] args) {

		Libro libro = new Libro(1500);
		System.out.println("*********\n* LIBRO *\n*********");
		libro.pageMessage();

		Libro vocabolario = new Vocabolario(4500, 52100);
		System.out.println("***************\n* VOCABOLARIO *\n***************");
		((Vocabolario) vocabolario).definitionMessage();

	}

}
