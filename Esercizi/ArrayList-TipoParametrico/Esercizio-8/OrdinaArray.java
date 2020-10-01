public class OrdinaArray {

	/*
	 * Precondizione: Ogni elemento nell'array ha un valore.
	 * Azione: Ordina l'array in senso crescente.
	 */
	
	public static void selectionSort(int[] unArray) {
		for(int indice = 0; indice < unArray.length - 1; indice++) {
			//	Posiziona il valore corretto in unArray[indice]
			int indiceDelSuccessivoPiùPiccolo = getIndiceDelPiùPiccolo(indice, unArray);
			scambio(indice, indiceDelSuccessivoPiùPiccolo, unArray);
			/*
			 * Asserzione: unArray[0] <= unArray[1] <= ... <= unArray[indice]
			 * e questi sono i più piccoli dell'array originale di elementi.
			 * Le posizioni rimanenti contengono i rimanenti elementi dell'array.
			 */
		}
	}
	
	/*
	 * Restituisce l'indice del più piccolo valore nella porzione di
	 * array che inizia dall'elemento il cui indice è indiceInizio e
	 * termina all'ultimo elemento.
	 */
	
	public static int getIndiceDelPiùPiccolo(int indiceInizio, int[] a) {
		int minimo = a[indiceInizio];
		int indiceDelMinimo = indiceInizio;
		
		for(int indice = indiceInizio + 1; indice < a.length; indice++) {
			if(a[indice] < minimo) {
				minimo = a[indice];
				indiceDelMinimo = indice;
				//minimo è il più piccolo
				//da a[indiceInizio] fino a[indice]
			}
		}
		return indiceDelMinimo;
	}
	
	/*
	 * Precondizione: i e j sono indici validi per l'array a.
	 * Postcondizione: i valori di a[i] e a[j] sono stati scambiati.
	 */
	
	public static void scambio(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp; //valore originale di a[i]
	}
}
