package metodi;

import java.util.Scanner;

/*
 * 	Test del metodo divisibile.
 */

public class DivisibilitàTest {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Questo programma ritorna true quando due numeri inseriti");
		System.out.println("sono divisibili e false quando non lo sono.");
		System.out.println("Inserisci il primo numero:");
		a = tastiera.nextInt();
		
		System.out.println("Inserisci il secondo numero:");
		b = tastiera.nextInt();
		
		System.out.println(Divisibilità.divisibile(a, b));

	}

}
