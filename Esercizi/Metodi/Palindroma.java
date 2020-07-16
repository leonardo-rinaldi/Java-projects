package metodi;

import java.util.Scanner;

/*
 * 	CAPITOLO 5
 * 
 * 	   Si scriva un programma che individua se una parola è palindroma, cioè se scritta 
 * 	   nel verso opposto è uguale alla parola di partenza. Anna, per esempio, è una parola
 * 	   palindroma.
 * 
 * 	4- Si ripeta il programma precedente ma realizzando un metodo che determina se due stringhe
 * 	   sono palindrome. Scrivere quindi un programma driver per collaudare il metodo.
 * 
 */

public class Palindroma {

	public static void palindroma(String parola) {
		
		String parolaInvertita = "";
		
		for(int i = parola.length() - 1; i >= 0; i--) {
			
			char carattere = parola.charAt(i);
			
			
			parolaInvertita = parolaInvertita + carattere;
			
		}
		
		if(parola.equalsIgnoreCase(parolaInvertita)) {
			System.out.println("La parola è palindroma");
		} else {
			System.out.println("La parola non è palindroma");
		}
		
	}
	
}
