package metodi;

/*
 * 
 * Test del metodo trova.
 * 
 */

import java.util.Scanner;

public class TovaCarattereTest {

	public static void main(String[] args) {
		
		String stringaUno;
		String stringaDue;
		char carattereStringa;
		
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci due stringhe");
		
		stringaUno = tastiera.nextLine();
		stringaDue = tastiera.nextLine();
		
		if(stringaUno.length() == stringaDue.length()) {
			
			carattereStringa = stringaDue.charAt(0);
			
			System.out.println(TrovaCarattere.trova(stringaUno, carattereStringa));
		} else {
			
			carattereStringa = stringaDue.charAt(stringaUno.length() - 1);
			System.out.println(TrovaCarattere.trova(stringaDue, carattereStringa));
		}
	}

}
