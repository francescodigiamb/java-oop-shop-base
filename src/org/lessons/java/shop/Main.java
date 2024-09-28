package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto prodotto1 = new Prodotto ();
		
		prodotto1.nome = "Shampoo";
		prodotto1.codiceRandom();
		prodotto1.descrizione = "Per capelli lisci";
		prodotto1.prezzo = 2;
		prodotto1.prezzoIva();
		
		System.out.println("Il codice del prodotto è " + prodotto1.codice);
		System.out.println("Il nome del prodotto è " + prodotto1.nome);
		System.out.println("Descrizione prodotto " + prodotto1.descrizione);
		System.out.println("Il prezzo del prodotto è " + prodotto1.prezzoIva());
		System.out.println(prodotto1.nomeEsteso());
	}
	
}
