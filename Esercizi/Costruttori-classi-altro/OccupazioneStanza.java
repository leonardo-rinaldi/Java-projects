/*
 *	 6-	Si crei la classe OccupazioneStanza che può essere usata per memorizzare
 *		il numero di persone presenti in una stanzadi un edificio. Questa classe
 *		presenta i seguenti attributi:
 *
 *		- numeroNellaStanza: numero di persone nella stanza;
 *		- numeroTotale: variabile statica che indica il numero totale di persone
 *						in tutte le stanze.
 *
 * 		La classe deve presentare i seguenti metodi:
 * 
 * 		- aggiungiUnoAllaStanza: aggiunge una persona alla stanza e incrementa il
 * 								 valore di numeroTotale;
 * 		- rimuoviUnoDallaStanza: rimuove una persona dalla stanza, assicurandosi
 * 								 che numeroNellaStanza non diventi minore di 0 e
 * 								 decrementa il valore di numeroTotale come richiesto;
 * 		- getNumero: restituisce il numero di persone nella stanza;
 * 		- getTotale: metodo statico che restituisceil numero di persone totali.
 * 
 * 		Si scrivi un programma che collaudi la classe OccupazioneStanza.
 * 
 */

public class OccupazioneStanza {

	public int numeroNellaStanza;
	public static int numeroTotale;
	
	public void aggiungiUnoAllaStanza() {
		numeroNellaStanza++;
		numeroTotale++;
	}
	
	public void rimuoviUnoDallaStanza() {
		if(numeroNellaStanza - 1 >= 0) {
			numeroNellaStanza--;
			numeroTotale--;
		} else {
			System.out.println("Errore!");
		}
	}
	
	public int getNumero() {
		return numeroNellaStanza;
	}
	
	public int getTotale() {
		return numeroTotale;
	}
	
}
