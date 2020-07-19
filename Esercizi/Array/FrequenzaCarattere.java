import java.util.Scanner;

/*
 * 	4- Scrivere un programma in una classe FrequenzaCarattere che conti il numero di
 * 	   volte che una cifra appare in un numero telefonico. Il programma deve creare 
 * 	   un array di dimensione 10 che memorizzerà il conto di ogni cifra da 0 a 9.
 * 	   Leggere da tastiera un numero di telefono come stringa. Esaminare ogni carattere
 * 	   del numero telefonico e incrementare il conteggio relativo alla cifra nell'array.
 * 	   Viualizzare il contenuto dell'array.
 * 
 */

public class FrequenzaCarattere {

	public static void main(String[] args) {
		
		int[] valore = new int[10];
		
		Scanner tastiera = new Scanner(System.in);
		
		String numeroInserito;
		
		System.out.println("Inserisci il tuo nuero di telefono:");
		numeroInserito = tastiera.next();
		
		valore = occorrenzeCarattere(numeroInserito);

		/*
		 * Elenco le occorrenze del carattere.
		 */
		
		System.out.println("Le occorrenze del carattere sono:");
		
		for(int x = 0; x < valore.length; x++) {
			
			System.out.println(x + " : " + valore[x]);
		}
		
	}
	
	/*
	 * Analizzo i singoli caratteri che formano il numero e
	 * riempio l'array.
	 */
	
	public static int[] occorrenzeCarattere(String numeroInserito) {
		
		int[] valore = new int[10];
		
		char carattere;
		int carattereNumerico;
		
		for(int i = 0; i < numeroInserito.length(); i++) {
			
			carattere = numeroInserito.charAt(i);
			carattereNumerico = Character.getNumericValue(carattere);
			valore[carattereNumerico]++;
		}
		
		return valore;
	}

}
