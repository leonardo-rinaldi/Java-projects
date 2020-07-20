/* 
 * 	10- Riscrivere il metodo selectionShort così che ordini un array il cui
 * 		intervallo di indici vada da inizio a fine, dove 0 <= inizio <= fine
 * 		e fine è minore della lunghezza dell'array, Il nuovo metodo dovrà chiamarsi
 * 		selectionSortParziale.
 * 
 */

public class SelectionSortModifica {

	public static void selectionSortParziale(int[] unArray, int inizio, int fine) {
		for(int indice = inizio; indice < unArray.length- 1; indice++) {
			int indiceDelSuccessivoPiùPiccolo = getIndiceDelPiùPiccolo(indice, fine, unArray);
			scambio(indice, indiceDelSuccessivoPiùPiccolo, unArray);
		}
	}
	
	
	public static int getIndiceDelPiùPiccolo(int indiceInizio, int indiceFine, int[] a) {
		int minimo = a[indiceInizio];
		int indiceDelMinimo = indiceInizio;
		
		for(int indice = indiceInizio + 1; indice < indiceFine; indice++) {
			if(a[indice] < minimo) {
				minimo = a[indice];
				indiceDelMinimo = indice;
			}
		}
		return indiceDelMinimo;
	}
	
	public static void scambio(int i, int j, int[] a ) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
