package metodi;

/* 
 * 	9-	Si realizzi una classe Java che definisce:
 * 
 * 		a. il metodo conta che accetta in ingresso una stringa e un carattere e
 * 		   restituisce il numero di occorrenze del carattere all'interno della 
 * 		   stringa.
 * 
 * 		b. il metodo main che legge da input una stringa e un numero intero n. 
 * 		   Invoca il metodo conta passandogli la stringa letta da input e il
 * 		   carattere che si trova in posizione n (intero letto precedentemente da
 * 		   input) nlla stringa stessa e stampa a video un messaggio che indichi quante
 * 		   volte il carattere è stato trovato nella stringa.
 * 
 * 		   Esempio: stringa = "Pippo", n = 2, il numero di volte in cui compare il
 * 		   carattere 'p' è 2.
 * 
 */

public class CarattereStringa {

	public static int conta(String stringa, char carattere) {
		
		int occorrenze = 0;
		
		for(int i = 0; i < stringa.length(); i++) {
			
			char carattereTrovato = stringa.charAt(i);
			
			if(carattere == carattereTrovato) {
				occorrenze++;
			} else {
				continue;
			}
			
		}
		
		return occorrenze;
	}
	
}
