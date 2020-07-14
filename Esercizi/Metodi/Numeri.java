package metodi;

/* 
 * 	8- Si realizzi una classe che definisce:
 * 
 * 	   a. il metodo primo che accetta in ingresso un numero intero e restituisce true se il
 * 		  numero è primo oppre restituisce false;
 * 
 * 	   b. il metodo divisore che prende in ingresso un numero intero e restituisce il suo 
 * 		  minimo divisore (escluso 1);
 * 
 * 	   c. il metodo main che legge in input un numero intero diverso da 0 e, utilizzando i
 * 		  metodi primo e divisore, stampa a video il messaggio "il numero inserito è un 
 * 		  numero primo" se il numero inserito è primo, altrimenti stampa il messaggio "il
 * 		  più piccolo divisore di N è D", dove N e D devono essere il numero inserito 
 * 		  dall'utente e il suo divisore.
 * 
 */

public class Numeri {

	public static boolean primo(int x) {
		
		boolean risultato = false;
		boolean flag = false;
		
		
			for(int i = 2; i < x/2; i++) {
				
				if(x % i == 0) {
					flag = true;
					break;
				} 
			}
			
			if(!flag) {
				risultato = true;
			} else {
				risultato = false;
			}
			
			
			return risultato;
		
	}
	
	public static void divisore(int x) {
		
		int i;
		
		for(i = 2; i < x; i++) {
			
			if(x % 2 == 0) {
				System.out.println(i);
				return;
			}
		}
		
		
	}
	
}
