import java.util.ArrayList;

/* 
 * 	9- Si ripeta l'esercizio 8, ma scrivendo un metodo bubbleSort che realizzi
 * 	   un bubble sort.
 * 
 */

public class BubbleSortArrayList {
	
	/*
	 * Riordinamento delll'array in ordine crescente con il metodo bubbleSort
	 */
	
	public static ArrayList<String> bubbleSort(ArrayList<String> a) { 
		
		for(int j = 0; j < a.size() - 1; j++) {	//Ripeto ciò che segue finchè l'array non è ordinato
			for(int indice = 0; indice < a.size() - 1; indice++) {
				if(a.get(indice).compareTo(a.get(indice + 1)) > 0) {
					scambio(indice, indice + 1, a);
				}
			}
		}
		return a;
	}
	
	public static int getIndiceDelPiùPiccolo(int indiceInizio, ArrayList<String> a) {
		String minimo = a.get(indiceInizio);
		int indiceDelMinimo = indiceInizio;
		
		for(int indice = indiceInizio + 1; indice < a.size(); indice++) {
			if(a.get(indice).compareTo(minimo) < 0 ) {
				minimo = a.get(indice);
				indiceDelMinimo = indice;
			}
		}
		return indiceDelMinimo;
	}
	
	public static void scambio(int i, int j, ArrayList<String> a) {
		String temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
	}
}
