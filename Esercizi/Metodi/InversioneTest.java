package metodi;

/*
 * Test del metodo inverti.
 */

import java.util.Scanner;

public class InversioneTest {

	public static void main(String[] args) {
		
		String daInvertire;
		int n;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa da invertire:");
		daInvertire = tastiera.nextLine();
		
		System.out.println("Inserisci un numero intero come indice:");
		n = tastiera.nextInt();
		
		Inversione.inverti(daInvertire, n);

	}

}
