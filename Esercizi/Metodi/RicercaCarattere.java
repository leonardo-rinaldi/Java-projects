package metodi;

/*
 * 	13-	Si realizzi una classe Java che definisce:
 * 
 * 		a- il metodo cercaCarattere che accetta in ingresso due stringhe, confronta a uno
 * 		   a uno i caratteri delle due stringhe e restituisce il primo carattere uguale
 * 		   trovato oppure restituisce il carattere '*' se le due stringhe non hanno nemmeno
 * 		   un carattere uguale;
 * 
 * 		b- il metodo main che continua aleggere in input due stringhe e invoca il metodo
 * 		   cercaCarattere passandogli le stringhe inserite dall'utente, finchè il carattere
 * 		   restituito dal metodo è diverso dall'ultimo carattere della prima stringa.
 * 	
 */

public class RicercaCarattere {

	
	public static char cercaCarattere(String primaStringa, String secondaStringa) {
		
		char caratterePrimaStringa = ' ';
		char carattereSecondaStringa = ' ';
		char carattereUguale = ' ';
		int numeroCaratteriUguali = 0;
		
	
		
		for(int i = 0; i <= primaStringa.length() - 1; i++) {
			
			caratterePrimaStringa = primaStringa.charAt(i);
			
			for(int x = 0; x <= secondaStringa.length() - 1; x++) {	
				
				carattereSecondaStringa = secondaStringa.charAt(x);
				
				if(caratterePrimaStringa == carattereSecondaStringa) { // Provvede a fermare il secondo ciclo in caso di carattere uguale
					
					carattereUguale = caratterePrimaStringa;
					numeroCaratteriUguali++;
					break; 
				
				} else {
					continue;
				}
				
			}
			
			if(carattereUguale == caratterePrimaStringa) {	// provvede a fermare il primo ciclo in caso di carattere uguale
				break;
			} else
				if(numeroCaratteriUguali < 1) {	// caso in cui nessun carattere sia uguale ad un altro
					carattereUguale = '*';

				} else {
					continue;
				}
			
		}
		
		
		
		return carattereUguale;
		
	}
	
}
