package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	double prezzo;
	int iva;
	
	void codiceRandom() {
        Random random = new Random();
        // genera numero casuale tra 0 e decide l'utente
        codice = random.nextInt(10000);
	}
	
	double prezzoBase() {
		return prezzo;
	}
	
	double prezzoIva() {
		// calcoliamo l'iva
		double iva = 0.22;
		double prezzoIva = prezzo - (prezzo * iva);
//		System.out.println(prezzoIva);
		return prezzoIva;
	}
	
	String nomeEsteso () {		
		return codice + "-" + nome;		
	}

	
}
