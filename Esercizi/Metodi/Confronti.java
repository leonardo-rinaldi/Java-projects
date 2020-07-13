package metodi;

/*
 * 	1- Si realizzi una classe Java in cui è definito il metodo confronta che accetta in
 * 	   ingresso due interi e restituisce il primo meno il secondo se il primo è maggiore
 * 	   del secondo, oppure restituisce il secondo meno il primo. Scrivere quindi un 
 * 	   programma driver per collaudare il metodo.
 * 
 */

public class Confronti {

	public static int confronta(int a, int b) {
		
		int risultato;
		
		if(a > b) {
			risultato = a - b;
		} else {
			risultato = b - a;
		}
		return risultato;
		
	}
	
}
