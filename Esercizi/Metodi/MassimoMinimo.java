package metodi;

/*
 *	4- Si realizzi una classe Java che abbia definito un metodo che accetta in ingresso 3 
 *	   interi min, max e valore. tale metodo deve verificare se valore è all'interno
 *	   dell'intervallo min - max estremi inclusi. Se è all'interno, il metodo restituisce
 *	   true, false in caso contrario.
 * 
 */

public class MassimoMinimo {

	public static boolean maxMin(int max, int min, int valore) {
		
		boolean risultato;
		
		if(valore >= min && valore <= max) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
}
