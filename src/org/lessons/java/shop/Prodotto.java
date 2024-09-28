package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	double prezzo;
	double iva = 0.22;
	
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
		double prezzoIva = prezzo - (prezzo * iva);
//		System.out.println(prezzoIva);
		return prezzoIva;
	}
	
	String nomeEsteso () {		
		return codice + "-" + nome;		
	}

	
}
