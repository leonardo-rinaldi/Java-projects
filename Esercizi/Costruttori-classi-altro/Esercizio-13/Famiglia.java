/*
 * 	13-	Scrivere un programma in una classe ContaPoveri che conti il numero di famiglie
 * 		che vengono considerate povere. Scrivere e utilizzare una classe Famiglia che ha
 * 		i seguenti attributi:
 * 
 * 		- reddito: un valore double che è il reddito della famiglia;
 * 		- dimensione: il numero di componenti della famiglia;
 * 
 * 		e i seguenti metodi:
 * 
 * 		- Famiglia(reddito, dmensione): il costruttore cje inizializza gli attributi;
 * 		- povera(costoCasa, costoCibo): un metodo che restituisce vero se costoCasa +
 * 										costoCibo * dimensione è maggiore della metà
 * 										del reddito della famiglia(costoCibo è il costo
 * 										medio del cibo per ogni individuo, mentre costoCasa
 * 										è unico per la famiglia);
 * 		- toString: un metodo che restiutisce una stringa contenete le informazioni della famiglia;
 * 		
 * 		Il programma deve leggere da tastiera un intero k e, successivamente, creare un array di
 * 		dimensione k il cui tipo base è Famiglia. Deve inoltre creare k oggetti di tipo Famiglia e
 * 		inserirli nell'array, leggendo da tastiera il reddito e la dimensione di ogni famiglia. Dopo
 * 		aver letto da tastiera un costo medio familiare e un costo medio del cibo, visualizzare le famiglie
 * 		che sono povere.
 */

public class Famiglia {

	private double reddito;
	private int dimensione;
	
	public Famiglia(double reddito, int dimensione) {
		this.reddito = reddito;
		this.dimensione = dimensione;
	}
	
	public boolean povera(double costoCasa, double costoCibo) {
		double metàReddito = reddito / 2;
		boolean risultato;
		
		if( (costoCasa + costoCibo * dimensione) > metàReddito) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
	
	public String toString() {
		return "Reddito: " + reddito + " dimensione: " + dimensione;
	}
}
