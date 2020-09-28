import java.util.ArrayList;
import java.util.Scanner;

/* 
 * 	1- Scrivere un programma in una classe ContaFamiglie che conti il numero di
 * 	   famiglie il cui reddito è al di sotto di un certo valore. Leggere un intero
 * 	   k da tastiera e, in seguito, creare un array di valori double di dimensione k.
 * 	   Leggere dalla tastiera k valori che rappresentano i redditi delle famiglie e 
 * 	   memorizzarli nell'array. Trovare il più elevato tra questi redditi. Poi contare
 * 	   le famiglie il cui reddito è inferiore fino al 10% rispetto al reddito massimo. 
 * 	   Visualizzare questo conteggio e i redditi di queste famiglie.
 * 
 * 	   Si ripeta l'esercizio precedente ma usando un'istanza di ArrayList invece di un
 * 	   array. Non si legga il numero dei valori, ma si continui a leggere i valori finchè
 * 	   l'utente non inserisce un valore negativo.
 * 
 */

public class ContaFamiglie {

	public static void main(String[] args) {
		ArrayList<Double> famiglie = new ArrayList<Double>();
		
		double redditoMassimo;
		int numeroFamiglie = 0;
		
		inserisciReddito(famiglie);
		int dimensione = famiglie.size();
		visualizza(dimensione, famiglie);
		System.out.println();
		redditoMassimo = getRedditoMassimo(dimensione, famiglie);
		System.out.println();
		System.out.println("Il reddito massimo è di: " + redditoMassimo);
		System.out.println();
		redditiMinori(dimensione, redditoMassimo, famiglie);

	}
	
	public static void inserisciReddito(ArrayList<Double> famiglie) {
		Scanner tastiera = new Scanner(System.in);
		double valore;
		boolean stop = false;
		
		do {
			System.out.println("Inserire il reddito di una famiglia:");
			valore = tastiera.nextDouble();
			
			if(valore < 0) {
				stop = true;
			} else {
				famiglie.add(valore);
			}
		} while(stop == false);
	}
	
	/*
	 * Visualizza array
	 */
	
	public static void visualizza(int dimensione, ArrayList<Double> famiglie) {
		
		System.out.print("[ ");
		for(int i = 0; i < dimensione; i++) {
			System.out.print(famiglie.get(i) + " ");
		}
		System.out.print("]");
	}
	
	/*
	 * Trovare maggiore
	 */
	
	public static double getRedditoMassimo(int dimensione, ArrayList<Double> famiglie) {
		double redditoMassimo = 0;
		
		for(int i = 0; i < dimensione; i++) {
			if(redditoMassimo < famiglie.get(i)) {
				redditoMassimo = famiglie.get(i);
			}
		}
		return redditoMassimo;
	}
	
	/*
	 * Trovare famiglie con reddito inferiore del
	 * 10% rispetto al reddito massimo
	 */
	
	public static void redditiMinori(int dimensione, double redditoMassimo, ArrayList<Double> famiglie) {
		int numeroFamiglie = 0;
		
		for(int i = 0; i < dimensione; i++) {
			if(famiglie.get(i) < (redditoMassimo - (redditoMassimo * 0.10)) ) {
				System.out.println("Il reddito della famiglia " + i + " è " + famiglie.get(i));
				numeroFamiglie++;
			} else {
				continue;
			}
		}
		System.out.println();
		System.out.println("Ci sono " + numeroFamiglie + " famiglie con un reddito");
		System.out.println("inferiore del 10% rispetto al reddito massimo.");
	}
}
