/*
 * 	3- L'algoritmo bubble sort esamina tutte le coppie di elementi adiacenti 
 * 	   nell'array, dall'inizio alla fine, e scambia due elementi se non sono
 * 	   ordinati. Ogni scambio renderà l'array più ordinato, finchè non si
 * 	   giungerà all'ordinamento completo. L'algoritmo in pseudocodice è il 
 * 	   seguente:
 * 
 * 	   Ripetere ciò che segue finchè l'array a non è ordinato.
 * 	   
 * 	   for(indice = 0; indice < a.length -1; indice++) {
 * 		  if(a[indice] > a[indice + 1])
 * 			scambia i valori di a[indice] e a[indice +1]
 * 
 * 	   L'algorio bubble sort di norma impiega più tempo degli altri metodi 
 * 	   di ordinamento.
 * 
 */

public class BubbleSort {
		
	public static void selectionSort(int[] unArray) {
		for(int indice = 0; indice < unArray.length - 1; indice++) {
			int indiceDelSuccessivoPiuPiccolo = getIndiceDelPiùPiccolo(indice, unArray);
			scambio(indice, indiceDelSuccessivoPiuPiccolo, unArray);
		}
	}
	
	/*
	 * Riordinamento delll'array in ordine crescente con il metodo bubbleSort
	 */
	
	public static int[] bubbleSort(int[] a) { 
		
		for(int j = 0; j < a.length - 1; j++) {	//Ripeto ciò che segue finchè l'array non è ordinato
			for(int indice = 0; indice < a.length - 1; indice++) {
				if(a[indice] > a[indice + 1]) {
					scambio(indice, indice + 1, a);
				}
			}
		}
		return a;
	}
	
	public static int getIndiceDelPiùPiccolo(int indiceInizio, int[] a) {
		int minimo = a[indiceInizio];
		int indiceDelMinimo = indiceInizio;
		
		for(int indice = indiceInizio + 1; indice < a.length; indice++) {
			if(a[indice] < minimo) {
				minimo = a[indice];
				indiceDelMinimo = indice;
			}
		}
		return indiceDelMinimo;
	}
	
	public static void scambio(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
