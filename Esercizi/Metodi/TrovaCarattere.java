package metodi;

/* 
 * 	6- Si realizzi una classe Java che definisce:
 * 
 * 	   a- il metodo con nome trova che accetta in ingresso una stringa e un carattere e
 * 		  restituisce true se il carattere è presente almeno una volta nella stringa.
 * 
 * 	   b- il metodo main che legge in input due stringhe inserite dall'utente. Se le due
 * 		  stringhe hanno la stessa lunghezza, invoca il metodo trova passandogli la prima
 * 		  stringa e il primo carattere della seconda; se hanno lunghezza diversa, invoca il
 * 		  metodo trova passando la seconda stringa e l'ultimo carattere della prima stringa.
 * 		  Stampa a video il risultato dell'invocazione del metodo.
 * 
 * 
 */

public class TrovaCarattere {

	public static boolean trova(String stringa, char carattere) {
		
		boolean risultato = false;
		char ricercaCarattere;
		int ripetizioneCarattere = 0;
		
		for(int i = 0; i < stringa.length(); i++) {
			
			ricercaCarattere = stringa.charAt(i);
			
			if(ricercaCarattere == carattere) {
				ripetizioneCarattere++;
			} else {
				continue;
			}
			
			if(ripetizioneCarattere >= 1) {
				risultato = true;
			} else {
				risultato = false;
			}
			
		}
		
		return risultato;
		
	}
	
}
