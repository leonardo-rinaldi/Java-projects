import java.util.Scanner;

/*
 *	1- Scrivere un programma che legga degli interi uno per riga, e visualizzi la loro
 *	   somma. Deve visualizzare, inoltre, tutti i numeri letti, ognuno con un'annotazione
 *	   che indichi il contributo percentuale alla somma. Utilizzare un metodo che prende
 *	   come argomento un intero array e che restituisce la somma dei numeri nell'array.
 * 
 */

public class SommaNumeri {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Quanti numeri verranno inseriti?");
		int dimensioneArray = tastiera.nextInt();
		
		int[] numero = new int[dimensioneArray];
		
		System.out.println("Inserire " + dimensioneArray + " interi, uno per riga");
		
		for(int i = 0; i < numero.length; i++) {
			numero[i] = tastiera.nextInt();
		}
		
		int somma = somma(numero);
		
		System.out.println("La somma è " + somma);
		System.out.println("I numeri sono:");
		
		percentuali(numero, somma);
	}
	
	public static int somma(int numero[]) {
		
		int somma = 0;
		
		for(int i = 0; i < numero.length; i++) {
			somma = somma + numero[i];
		}
		return somma;
	}
	
	public static void percentuali(int numero[], int somma) {
		
		for(int i = 0; i < numero.length; i++) {
			double percentuale;
			percentuale = numero[i] * 100 / somma;
			System.out.println(numero[i] + ", che è il " + percentuale + "% della somma.");
		}
	}

}
