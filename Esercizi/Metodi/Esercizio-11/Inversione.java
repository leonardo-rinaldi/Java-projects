package metodi;

/*
 * 	11- Si realizzi un programma che definisca:
 * 
 * 		a- il metodo inverti che accetta in ingresso una stringa daInvertire e un
 * 		   intero n e restituisce una stringa con i caratteri invertiti a partire 
 * 		   dal carattere di indice n, se l'indice è valido (se, per esempio,
 * 		   daInvertire = "Programmazione" e n = 5, il metodo restituisce "progrenoizamma")
 * 
 * 		b. il metodo main che legge da input standard una stringa e un intero positivo,
 * 		   invoca un metodo inverti utilizzando la stringa e il numero inseriti dall'utente
 * 		   e stampa la stringa restituita oppure un messaggio che avverta l'utente che c'è stato
 * 		   un errore. 
 * 
 * 
 */

public class Inversione {

	public static void inverti(String daInvertire, int n) {
		
		char carattere;
		
		if(n <= daInvertire.length()) {
		
		for(int x = 0; x < n; x++) {
			
			carattere = daInvertire.charAt(x);
			System.out.print(carattere);
			
		}
		
		for(int i = daInvertire.length() - 1; i >= n; i--) {
			
			carattere = daInvertire.charAt(i);
			
			System.out.print(carattere);
			
		}
		} else {
			System.out.println("Errore");
		}
		
	}
	
}
