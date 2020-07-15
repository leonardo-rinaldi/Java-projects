package metodi;

import java.util.Scanner;

/*
 * 	Test del metodo cercaCarattere
 */

public class RicercaCarattereTest {

	public static void main(String[] args) {
		
		String primaStringa;
		String secondaStringa = "";
		char carattereUguale;
		
		Scanner tastiera = new Scanner(System.in);
		
		do {
			
			System.out.println("Inserisci la prima stringa:");
			primaStringa = tastiera.next();
			System.out.println("Inserisci la seconda stringa:");
			secondaStringa = tastiera.next();
			
			System.out.println(RicercaCarattere.cercaCarattere(primaStringa, secondaStringa));
			
			carattereUguale = RicercaCarattere.cercaCarattere(primaStringa, secondaStringa);
			
		} while(carattereUguale != primaStringa.charAt(primaStringa.length() - 1));
		
	}

}
