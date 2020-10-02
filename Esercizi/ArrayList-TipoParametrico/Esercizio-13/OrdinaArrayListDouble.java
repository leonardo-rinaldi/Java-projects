import java.util.ArrayList;

/*
 * Selection sort di valori double
 */

public class OrdinaArrayListDouble {
	

	/*
	 * Precondizione: Ogni elemento nell'ArrayList ha un valore.
	 * Azione: Ordina l'ArrayList in senso crescente.
	 */
	
	public static void selectionSort(ArrayList<Double> unArray) {
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
	
	public static int getIndiceDelPiùPiccolo(int indiceInizio, ArrayList<Double> a) {
		double minimo = a.get(indiceInizio);
		int indiceDelMinimo = indiceInizio;
		
		for(int indice = indiceInizio + 1; indice < a.size(); indice++) {
			if(a.get(indice) < minimo ) {
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
	
	public static void scambio(int i, int j, ArrayList<Double> a) {
		double temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);  //valore originale di a.get(i)
	}
}
