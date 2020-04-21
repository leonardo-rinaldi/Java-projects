/*
 * Simple program to identify if a number is even or not
 * 
 */

import java.util.Scanner;

public class PariDispari {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Pari o dispari?");
		System.out.println("Inserisci un numero");
		
		numero = tastiera.nextInt();
		
		if(numero % 2 == 0) {							//se il resto della divisione è 0 vuol dire che il numero è pari
			System.out.println("True");
		}
		
		else {
			System.out.println("False");
		}
		
	}

}
