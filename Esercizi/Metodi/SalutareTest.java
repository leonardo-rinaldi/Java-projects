package metodi;

import java.util.Scanner;

/*
 * Test del metodo saluta.
 */

public class SalutareTest {

	public static void main(String[] args) {
		
		String risposta;
		String nome;
		int n;
		
		Scanner tastiera = new Scanner(System.in);
		
		do {
			
			System.out.println("Inserisci il tuo nome:");
			nome = tastiera.next();
			
			System.out.println("Inserisci quante volte deve essere ripetuto:");
			n = tastiera.nextInt();
			
			Salutare.saluta(nome, n);
			
			System.out.println();
			System.out.println("Vuoi continuare?");
			System.out.println("Risposndi con si oppure no.");
			risposta = tastiera.next();
			
		} while(risposta.equalsIgnoreCase("si"));
	}

}
