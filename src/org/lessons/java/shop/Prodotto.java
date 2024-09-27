package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	double prezzo;
	int iva;
	
	int codiceRandom() {
		
        Random random = new Random();
        // genera numero casuale tra 0 e decide l'utente
        int numero = random.nextInt(10000);
        System.out.println(numero);
		return numero;
	}
}
