import java.util.ArrayList;

/* 
 * 	8- Si riveda il metodo selectionSort definito nella classe OrdinaArray, così da
 * 	   ordinare stringhe di un'istanza della classe ArrayList<String> in ordine
 * 	   lessicografico invece di ordinare gli interi in un array in senso crescente.
 * 	   Per le parole, l'ordine lessicografico riconduce all'ordine afabetico se tutte
 * 	   le parole sono in lettere minuscole o maiscole. Si possono comparare due stringhe
 * 	   per vedere qual è la prima in senso lessicografico utilizzando il metodo compareTo
 * 	   della classe String.
 * 
 */

public class OrdinaArrayList {

	/*
	 * Precondizione: Ogni elemento nell'ArrayList ha un valore.
	 * Azione: Ordina l'ArrayList in senso crescente.
	 */
	
	public static void selectionSort(ArrayList<String> unArray) {
		for(int indice = 0; indice < unArray.size() - 1; indice++) {
			int indiceDelSuccessivoPiùPiccolo = getIndiceDelPiùPiccolo(indice, unArray);
				scambio(indice, indiceDelSuccessivoPiùPiccolo, unArray);
		}
	}
	
	/*
	 * Restituisce l'indice del più piccolo valore nella porzione di
	 * array che inizia dall'elemento il cui indice è indiceInizio e
	 * termina all'ultimo elemento.
	 */
	
	public static int getIndiceDelPiùPiccolo(int indiceInizio, ArrayList<String> a) {
		String minimo = a.get(indiceInizio);
		int indiceDelMinimo = indiceInizio;
		
		for(int indice = indiceInizio + 1; indice < a.size(); indice++) {
			if((a.get(indice).compareTo(minimo)) < 0 ) {
				minimo = a.get(indice);
				indiceDelMinimo = indice;
			}
		}
		return indiceDelMinimo;
	}
	
	/*
	 * Precondizione: i e j sono indici validi per l'ArrayList a.
	 * Postcondizione: i valori di a.get(i) e a.get(j) sono stati scambiati.
	 */
	
	public static void scambio(int i, int j, ArrayList<String> a) {
		String temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);  //valore originale di a.get(i)
	}
}
