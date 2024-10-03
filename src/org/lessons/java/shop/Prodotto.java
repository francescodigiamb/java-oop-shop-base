package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	Prodotto () {
		setCodice ();
		iva = 0.22;
		}
	Prodotto (String nome, String descrizione) {
		this();
		this.nome = nome;
		this.descrizione = descrizione;
	}
	
	Prodotto (String nome, String descrizione, double prezzo){
		this(nome, descrizione);
		if (prezzo >=0) {
			this.prezzo = prezzo;
		} else {
			this.prezzo = 50;
		}
		
	}
	
	public void setCodice() {
        Random random = new Random();
        // genera numero casuale tra 0 e decide l'utente
        codice = random.nextInt(10000);
	}
	
	public void setDescrizione (String descrizione) {
		this.descrizione = descrizione;
	}
	
	public void setPrezzoBase(double prezzo) {
		if (prezzo >=0) {
			this.prezzo = prezzo;
		}
	}
	
	public double getPrezzoIva() {
		// calcoliamo l'iva
		return this.prezzo = prezzo + (prezzo * iva);
//		System.out.println(prezzoIva);
	}
	
	String getNomeEsteso () {		
		return this.codice + "-" + this.nome;		
	}

	
}
