package metodi;

/*
 * 	3- Si realizzi un classe in Java che abbia definito un metodo chiamato divisibile
 * 	   che accetta in ingresso due interi e restituisce true se il primo intero è divisibile
 * 	   per il secondo, false in caso contrario.
 * 
 */

public class Divisibilità {

	public static boolean divisibile(int a, int b) {
		
		boolean risultato;
		
		if(a % b == 0) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
	
}
