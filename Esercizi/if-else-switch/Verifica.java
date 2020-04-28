import java.util.Scanner;

/*
 * 	1- Scrivere un frammento di codice che verifichi che la variabile intera
 * 	   "punteggio" contenga un valore valido. Si supponga che i valori siano
 * 	   validi se sono compresi tra 0 e 100.
 * 
 * 
 */

public class Verifica {

	public static void main(String[] args) {
		
		int punteggio;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Inserisci un punteggio: ");
		punteggio = numero.nextInt();
		
		if (punteggio > 0 && punteggio < 100) {
			System.out.println("Valore valido");
		}
		else {
			System.out.println("Valore non valido");
		}
		
	}

}
