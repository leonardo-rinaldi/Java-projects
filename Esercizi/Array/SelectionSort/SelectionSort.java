/*
 * 	9- Scrivere un metodo statico per il selection sort che ordini un array di
 * 	   caratteri.
 * 
 */

public class SelectionSort {

	public static char[] selectionSort(char[] arrayCaratteri) {
	
		int[] valoreCarattere = fromCharToInt(arrayCaratteri);
		
		for(int indice = 0; indice < valoreCarattere.length - 1; indice ++ ) {
			
			int indiceDelSuccessivoPiùPiccolo = getIndiceDelPiùPiccolo(indice, valoreCarattere);
			scambio(indice, indiceDelSuccessivoPiùPiccolo, valoreCarattere);
		}
		
		return fromIntToChar(valoreCarattere);
	
	}
	
	/*
	 * Passo da un array di caratteri ad uno di interi
	 */
	public static int[] fromCharToInt(char[] carattere) {
		int[] valoreCarattere = new int[carattere.length];
		
		for(int i = 0; i < carattere.length; i++) {
			valoreCarattere[i] = carattere[i];
		}
		return valoreCarattere;
	}
	
	/*
	 * Passo da un array di int ad uno di caratteri
	 */
	
	public static char[] fromIntToChar(int[] valoreCarattere) {
		
		char[] carattere = new char[valoreCarattere.length];
		
		for(int i = 0; i < valoreCarattere.length; i++) {
			carattere[i] = (char)valoreCarattere[i];
		}
		
		return carattere;
		
	}
	
	/*
	 * Trovo l'indice del numero più piccolo
	 */
	
	
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
	
	/*
	 * Scambio la posizione dei valori in modo da riordinarli
	 */
	
	public static void scambio(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
