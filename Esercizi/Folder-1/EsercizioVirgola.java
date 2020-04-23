import java.util.Scanner;

/*
 * 
 * 1- Si scriva un programma che dimostri la natura approssimativa dei numeri 
 * 	  in virgola mobile efettuando le seguenti attività.
 * 
 * 	 - Utilizzare Scanner per leggere un numero in virgola mobile x.
 *	 - Calcola 1.0/x e memorizzare il risultato in y.
 *	 - Visualizzare x, y e il prodotto x e y.
 *	 - Sottrare x dal prodotto di x e y e mostrarne il risultato
 * 
 * 
 */


public class EsercizioVirgola {

	public static void main(String[] args) {
		
		double numeroInserito;  //numero x
		double valoreDivisione;  //numero y
		double moltiplicazione;
		double sottrazione;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		
		numeroInserito = tastiera.nextDouble();
		
		valoreDivisione = 1.0 / numeroInserito;
		
		moltiplicazione = numeroInserito * valoreDivisione;
		
		sottrazione = moltiplicazione - numeroInserito;
		
		System.out.println("Numero x: " + numeroInserito );
		System.out.println("Risutato y: " + valoreDivisione);
		System.out.println("Numero x: " + numeroInserito + " numero y: " + valoreDivisione + " prodotto x * y: " + moltiplicazione);
		System.out.println("Sottrazione: " + sottrazione);
		
		
	}

}
