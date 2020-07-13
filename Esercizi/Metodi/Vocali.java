package metodi;

/*
 * 	5- Si realizzi una classe Java che definisce:
 * 
 * 	   a. il metodo contaVocali che accetta in ingresso una stringa e restituisce il
 * 		  numero di vocali presenti nella stringa;
 * 
 * 	   b. il metodo main che iterattivamete chiede all'utente di inserire una stringa
 * 		  se la stringa inserita ha un numero di vocali minore od uguale a 5. Stampa
 * 		  quindi il numero di vocali dell'ultima stringa inserita.
 * 
 * 
 */

public class Vocali {
	
	public static int contaVocali(String frase) {
		
		int numeroVocali = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			
			if(Character.toLowerCase(frase.charAt(i)) == 'a') {
				numeroVocali++;
			} else
				if((Character.toLowerCase(frase.charAt(i)) == 'e')) {
					numeroVocali++;
				} else
					if((Character.toLowerCase(frase.charAt(i)) == 'i')) {
						numeroVocali++;
					} else 
						if((Character.toLowerCase(frase.charAt(i)) == 'o')) {
							numeroVocali++;
						} else
							if((Character.toLowerCase(frase.charAt(i)) == 'u')) {
								numeroVocali++;
							} else {
								continue;
							}
			
		}
		return numeroVocali;
	}
	
}
