package metodi;

/*
 *	Test del metodo contaVocali.
 */

import java.util.Scanner;

public class VocaliTest {

	public static void main(String[] args) {
		
		String frase;
		Scanner tastiera = new Scanner(System.in);
		int numeroVocali = 0;
		
		
		do {
			
			System.out.println("Inserisci una frase, se il numero di vocali è minore di 5");
			System.out.println("dovrai inserirne un'altra.");
			frase = tastiera.nextLine();
			numeroVocali = Vocali.contaVocali(frase);
			
			
		} while(numeroVocali < 5);
		
		System.out.println("Il numero di vocali dell'ultima frase è: " + numeroVocali);
	}

}
