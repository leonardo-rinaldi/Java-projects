import java.util.Scanner;

/*
 * 
 * 	1- Un numero x è divisibile per y se il resto della divisione è
 * 	   pari a 0. Scrivere un programma che controlli se un numero è
 * 	   divisibile per un altro. Entrambi i numeri devono essere letti
 * 	   dalla tastiera.
 * 
 */

public class Divisibile {

	public static void main(String[] args) {
		
	int x;
	int y;
	
	Scanner numeroInserito = new Scanner(System.in);
	
	System.out.println("Inserisci due numeri per vedere se sono divisibili");
	
	x = numeroInserito.nextInt();
	y = numeroInserito.nextInt();
	
	if ( (x % y) == 0 ) {
		System.out.println( x + " è divisibile per " + y);
	}
		else {
		System.out.println( x + " non è divisibile per " + y);
	}

	}

}
