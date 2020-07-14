package metodi;

/*
 * 	Test del metodo primo e divisore.
 */

import java.util.Scanner;

public class NumeriTest {

	public static void main(String[] args) {
		
		int x;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inseirsci un numero diverso da zero.");
		x = tastiera.nextInt();
		
		if(Numeri.primo(x) == true) {
			System.out.println("Il numero inserito è un numero primo.");
		} else {
			
			System.out.println("Il più piccolo divisore di " + x + " è:" );
			Numeri.divisore(x);
		}

	}

}
