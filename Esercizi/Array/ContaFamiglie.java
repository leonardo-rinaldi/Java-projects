import java.util.Scanner;

/* 
 * 	2- Scrivere un programma in una classe contaFamiglie che conti il numero
 * 	   di famiglie il cui reddito è al di sotto di un certo valore. Leggere un 
 * 	   intero k da tastiera e, in seguito, creare un array di valori double di
 * 	   dimensione k. Leggere dalla tastiera k valori che rappresentano i redditi 
 * 	   delle famiglie e memorizzarli nell'array. Trovare il più elevato tra questi
 * 	   redditi, Poi contare le famiglie il cui reddito è inferiore fino al 10%
 * 	   rispetto al reddito massimo. Visualizzare questo conteggio e i redditi di 
 * 	   queste famiglie.
 *
 */

public class ContaFamiglie {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
	
		double redditoMassimo = 0;
		
		System.out.println("Inserisci il numero di famiglie:");
		int k = tastiera.nextInt();
		
		double[] reddito = new double[k];
		System.out.println("Inserisci il reddito delle famiglie:");
		
		for(int i = 0; i < reddito.length; i++ ) {
			
			reddito[i] = tastiera.nextDouble();
			
			if(redditoMassimo < reddito[i]) {	//Trovo il valore massimo tra quelli inseriti
				redditoMassimo = reddito[i]; 
			}
		}
		
		System.out.println();
		System.out.println("Il reddito massimo è: " + redditoMassimo);
		redditoMinore(reddito, redditoMassimo);
		
	}
	
	/*
	 * Trova il numero di famiglie con un reddito inferiore del 10% rispetto
	 * al reddito massimo.
	 * 
	 */
	
	public static void redditoMinore(double[] reddito, double redditoMassimo) {
		
		int numeroFamiglie = 0;
		
		
		for(int i = 0; i < reddito.length; i++) {
			
			if( reddito[i] <  (redditoMassimo - (redditoMassimo * 0.10)) ) {
				numeroFamiglie++;
				System.out.println("Il reddito della famiglia " + i + " è " + reddito[i]);
			} else {
				continue;
			}
		}
		
		System.out.println();
		System.out.println("Ci sono " + numeroFamiglie + " famiglie");
		System.out.println("con un reddito inferiore al 10% del reddito massimo.");
		
		
	}
	
}


