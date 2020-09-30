import java.util.ArrayList;
import java.util.Scanner;

/*
 * 	3- Scrivere un programma in una classe FrequenzaCarattere che conti il numero di
 * 	   volte che una cifra appare in un numero telefonico. Il programma deve creare 
 * 	   un array di dimensione 10 che memorizzerà il conto di ogni cifra da 0 a 9.
 * 	   Leggere da tastiera un numero di telefono come stringa. Esaminare ogni carattere
 * 	   del numero telefonico e incrementare il conteggio relativo alla cifra nell'array.
 * 	   Viualizzare il contenuto dell'array.
 * 
 *	   Si ripeta l'esercizio precedente ma usando un'istanza di ArrayList invece di un
 *	   array.
 * 
 */

public class FrequenzaCarattereModificato {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		String numeroInserito;
		
		System.out.println("Inserisci il tuo numero di telefono:");
		numeroInserito = tastiera.next();
		
		ArrayList<Integer> valore = occorrenzeCarattere(numeroInserito);
		
		visualizza(valore);
	}
	
	/*
	 * Analizzo i singoli caratteri che formano il numero e
	 * riempio l'array.
	 */
	
	public static ArrayList<Integer> occorrenzeCarattere(String numeroInserito) {
		
		ArrayList<Integer> valore = new ArrayList<Integer>(10);
		
		char carattere;
		int carattereNumerico;
		
		riempiArray(valore);
		
		for(int i = 0; i < numeroInserito.length(); i++) {
			carattere = numeroInserito.charAt(i);
			carattereNumerico = Character.getNumericValue(carattere);
			int incremento = valore.get(carattereNumerico); //Ottengo il numero attuale di ripetizioni del numero
			incremento++;									//Incremento il numero precedentemente ottenuto
			valore.set(carattereNumerico, incremento);		//setto l'incremento
		}
		return valore;
	}
	
	/*
	 * Provvede a riempire l'array di valori 0.
	 */
	
	private static ArrayList<Integer> riempiArray(ArrayList<Integer> valore) {
		for(int i = 0; i < 10; i++) {
			valore.add(i, 0);
		}
		return valore;
	}
	
	/*
	 * Elenco le occorrenze del carattere.
	 */
	
	private static void visualizza(ArrayList<Integer> valore) {
		System.out.println("Le occorrenze del carattere sono:");
		
		for(int x = 0; x < valore.size(); x++) {
			System.out.println(x + " : " + valore.get(x));
		}
	}
}
