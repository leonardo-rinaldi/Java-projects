package metodi;

/*
 * 	12-	Si realizzi un programma che definisce:
 * 
 * 		a. il metodo shift che accetta in ingresso una stringa daShiftare e un numero
 * 		   intero n e restituisce una stringa ottenuta "riavvolgendo" i caratteri della
 * 		   stringa di tante posizioni pari al numero passato come parametro. Per esempio,
 * 		   se daShiftare = "programmazione" e n = 3, il metodo restituisce "grammazionepro");
 * 
 * 		b. il metodo main che continua a chiedere in input una stringa e un numero, invoca il 
 * 		   metodo shift utilizzando nell'invocazione la stringa e il numero inseriti dall'utente
 * 		   ed esce dal ciclo quando il primo e l'ultimo carattere della stringa restituita dal
 * 		   metodo sono entrambi uguali ad 'a'.
 * 
 * 
 */

public class Shiftare {

	public static String shift(String daShiftare, int n) {
		
		char carattere;
		String stringa = "";
		
		for(int i = n; i <= daShiftare.length() - 1; i++) {
			
			carattere = daShiftare.charAt(i);
			
			stringa = stringa + carattere;
		}
		
		for(int x = 0; x < n; x++) {
			
			carattere = daShiftare.charAt(x);
			
			stringa = stringa + carattere;
		}
		return stringa;
	}
	
}
