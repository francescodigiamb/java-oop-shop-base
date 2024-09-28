package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

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
	
	double prezzoBase() {
		// l'utente inserisce il prezzo base
		Scanner scan = new Scanner (System.in);
		System.out.println("Inserisci il prezzo base del prodotto.");
		double prezzo = scan.nextDouble();
		System.out.println(prezzo);
		return prezzo;
	}
	
	double prezzoIva() {
		// calcoliamo l'iva
		double iva = 0.22;
		double prezzoIva = prezzo - (prezzo * iva);
		System.out.println(prezzoIva);
		return prezzoIva;
	}
	String nomeProdotto() {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Inserisci il nome del prodotto.");
		String nomeArticolo = scan.next();
		return nomeArticolo;
				
	}
	
	String concatenazione () {
		
		String conc = nomeProdotto() + "-" + codiceRandom ();
		System.out.println(conc);
		return conc;
		
	}

	
}
