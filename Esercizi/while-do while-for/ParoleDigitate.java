import java.util.Scanner;

/*
 * 
 * 	1- Si Scriva un programma che legge le parole digitate sulla tastiera finchè non viene digitata la parola "fine".
 * 	   Per ciascuna parola (tranne la parola "fine") si riporti se il primo carattere è uguale all'ultimo. Per 
 * 	   implementare il ciclo richiesto si utilizzino i seguenti costrutti:
 * 
 * 	   a. l'istruzione while
 * 	   b. l'istruzione do-while
 * 
 */

public class ParoleDigitate {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisci una serie di parole e concludi con la parola: Fine");
		
		String parola;
		int confronto;
		
		do {
			
			parola = tastiera.next();
			
			String primaLettera = parola.substring(0, 1);
			String ultimaLettera = parola.substring(parola.length() - 1, parola.length());
			
			confronto = primaLettera.compareToIgnoreCase(ultimaLettera);
			
			while(!parola.equalsIgnoreCase("Fine")) {
				if(confronto == 0) {
					System.out.println("Le due lettere sono uguali");
				} else {
					System.out.println("Le due lettere sono diverse");
				}
				parola = tastiera.next();
			}
			
			
		} while ( !parola.equalsIgnoreCase("Fine"));	
			
		
	}

}
