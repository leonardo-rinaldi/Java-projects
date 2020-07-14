/* 
 * 	10- Si realizzi una classe che definisce il metodo main che continua a chiedere 
 * 	    ingresso una stringa finchè l'utente inserisce la parola "fine". Per ogni stringa
 * 		inserita, verifica se la stringa contiene più di 5 vocali (utilizzando il metodo
 * 		contaVocali definito nell'esercizio 5). Memorizza in una variabile di appoggio
 * 		piùLunga la stringa inserita con più di 5 vocali e che è al momento la più lunga
 * 		inserita. Al'uscita dal ciclo stampa il valore della variabile piùLunga.
 * 
 */

public class VocaliStringa {

	
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
