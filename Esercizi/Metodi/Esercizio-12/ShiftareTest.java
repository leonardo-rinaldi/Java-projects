package metodi;

import java.util.Scanner;

/*
 * 	Test del metodo shift
 */

public class ShiftareTest {

	public static void main(String[] args) {
		
		String daShiftare;
		String stringaShiftata;
		int n;
		
		Scanner tastiera = new Scanner(System.in);
		
		do {
			
			System.out.println("Inserisci una stringa:");
			daShiftare = tastiera.next();
			
			System.out.println("Inserisci un numero intero:");
			n = tastiera.nextInt();
			
			
			stringaShiftata = Shiftare.shift(daShiftare, n);
			System.out.print(stringaShiftata);
			System.out.println();
			System.out.println();
			
			
		} while( stringaShiftata.charAt(0) != 'a' && stringaShiftata.charAt(stringaShiftata.length() - 1) != 'a' );

	}

}
