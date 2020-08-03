/* 
 * 2- Si definisca una classe Contatore. Un oggetto di questa classe viene usato per
 * 	  contare delle cose, quindi registra il conteggio, che è un numero intero positivo.
 * 	  Si includano i metodi per assegnare il valore 0 al contatore, per incrementare il
 * 	  contatore di 1 e per decrementarlo di 1. Ci si assicuri che nessun metodo permetta
 * 	  al contatore di diventare negativo. Si includa, inoltre un metodo get che restituisca
 * 	  il valore corrente del conteggio e un metodo che mostri il conteggio a schermo. Non
 * 	  si definisca un metodo di input. L'unico metodo che può assegnare valori al contatore
 * 	  è quello che pone il suo valore a 0. Si scriva un programma per collaudare questa classe.
 * 	  Suggerimento: è necessaria una sola variabile di istanza.
 * 
 * 
 */

public class Contatore {

	private int conteggio;
	
	public int azzera() {
		return conteggio = 0;
	}
	
	public int incrementaDiUno() {
		return conteggio++;
	}
	
	public int decrementoDiUno() {
		int risultato = 0;
		
		if(conteggio > 0) {
			risultato = conteggio--;
		} else {
			System.out.println("Errore, il conteggio non può assumere valori negativi!");
			azzera();
		}
		return risultato;
	}
	
	public int getContatore() {
		return conteggio;
	}
	
	public void visualizzaConteggio() {
		System.out.println("Il valore del conteggio è: " + conteggio);
	}
}
