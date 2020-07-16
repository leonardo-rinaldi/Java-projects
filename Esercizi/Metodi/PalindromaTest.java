package metodi;

/*
 * 	Test del metodo palindroma
 */

import java.util.Scanner;

public class PalindromaTest {

	public static void main(String[] args) {
		
		String parola;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci una parola per scoprire se è palindroma:");
		parola = tastiera.next();
		
		Palindroma.palindroma(parola);

	}

}
