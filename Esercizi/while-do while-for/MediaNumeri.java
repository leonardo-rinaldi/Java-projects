import java.util.Scanner;

/*
 *	4- Si scriva un programma che legge un elenco di numeri non negativi e mostri l'intero
 *	   più grande, quello più piccolo e la media di tutti gli interi. L'utente indica la
 *	   fine dell'input inserendo un valore negativo come sentinella che non deve essere
 *	   consierato quando si individuano il valore più grande, più piccolo e medio. La media
 *	   dei numeri inseriti deve essere un numero di tipo double.
 *
 */

public class MediaNumeri {

	public static void main(String[] args) {
		
		double numeroInserito;
		double media = 0;
		double max;
		double min;
		int contatore = 0;
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una serie di numeri per eseguire la media.");
		System.out.println("Per concludere la lista di numeri inserisci un numero negativo.");
		numeroInserito = tastiera.nextDouble();
		max = numeroInserito;
		min = numeroInserito;
		
		while(numeroInserito >= 0) {
			
			contatore++;
			
			media = media + numeroInserito;
			
			if(numeroInserito > max) {
				max = numeroInserito;
			} else 
				if(numeroInserito < min) {
					min = numeroInserito;
				}
			
			numeroInserito = tastiera.nextDouble();
			
		}
		
		System.out.println("La media dei numeri inseriti è: " + media / contatore);
		System.out.println("Il maggiore dei numeri inseriti è: " + max);
		System.out.println("Il minore dei numeri inseriti è: " + min);
		 
	}

}
