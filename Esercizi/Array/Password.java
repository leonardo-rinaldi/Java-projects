import java.util.Arrays;
import java.util.Scanner;

/*
 *	5- Si consideri lo schema seguente, nel quale la password consiste in un PIN a cinque
 *	   cifre (il pin per semplicità è composta da una sequenza di numeri consecutivi, come
 *	   45678). Ad ogni cifra è associato un numero casuale scelto tra 1, 2 e 3. L'utente 
 *	   inserirà, al posto del PIN vero e proprio, i numeri casuali corrispondenti alle
 *	   cifre del PIN.
 *	   Per esempio, si supponga che il vero PIN sia 12345. In fase di autenticazione,
 *	   all'utente verrà mostrata una schermata come:
 *		
 *	   PIN:	0123456789
 *	   NUM: 3231132213
 *
 * 	   A questo punto, l'utente inserirà il numero 23113 al posto di 12345. In questo
 * 	   modo, la assword non viene svelata nemmeno se qualcuno vede cosa viene inserito
 * 	   perchè 23113 potrebbe corrispondere anche a molti altri PIN. Al successivo accesso
 * 	   verrà generata una sequenza diversa di numeri casuali.
 * 
 * 	   Si scriva un programma che simuli la procedura di autenticazione, inserendo un PIN
 * 	   direttamente nel codice. Il programma dovrebbe utilizzare degli array. Inoltre, dovrà
 * 	   mostrare sullo schermo i numeri casuali, leggere la risposta dell'utente e comunicare
 * 	   se la risposta è corretta o meno.
 * 
 */

public class Password {
	
	public static final int[] PIN = {1, 2, 3, 4, 5};

	public static void main(String[] args) {
		
		int[] pin = new int[10];
		int[] numero = new int[pin.length];
		
		numero = generaNumeri(numero);
		pin = riempiArrayPin(pin);
		
		System.out.print("PIN: ");
		visualizzaArray(pin);
		System.out.println();
		System.out.print("NUM: ");
		visualizzaArray(numero);
		System.out.println();
		
		System.out.println("Inserisci il pin:");
		
		int[] pinRisposta = new int[5]; 
	
		pinRisposta = pinInserito(pinRisposta);
			
		int posizionePartenza = indice(pin, PIN);
			
		int [] nuovoArrayPin = arrayRispostaInserita(numero, posizionePartenza);
		
		if(confrontoPin(nuovoArrayPin, pinRisposta) == true) {
			System.out.println("Il pin è corretto");
		} else {
			System.out.println("Il pin è sbagliato!");
			}
		}
	
	/*
	 * Metodo per generare dei numeri casuali per l'array numero
	 */
	
	public static int[] generaNumeri(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int num = (int) (Math.random() * 3) + 1;
			
			array[i] = num;
		}
		return array;
	}
	
	public static int[] riempiArrayPin(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		return array;
	}
	
	public static void visualizzaArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/*
	 * Trovo in che punto parte la password nell'array pin
	 */
	
	public static int indice(int[] pin, int[] pinPassword) {
		int posizionePartenza = 0;
		
		for(int i = 0; i < pin.length - 1; i++) {
			if(pin[i] != PIN[0]) {
				continue;
			} else {
				posizionePartenza = i;
			}
		}
		return posizionePartenza;
	}
	
	/*
	 * Riempio l'array con il pin che inserisco tramite la tastiera
	 */
	
	public static int[] pinInserito(int[] risposta) {
		Scanner tastiera = new Scanner(System.in);
		
		for(int i = 0; i < risposta.length; i++) {
			risposta[i] = tastiera.nextInt();
		}
		return risposta;
	}
	
	/*
	 * Riempio l'array con i numeri casuali corrispondenti ai numeri che compongono il pin
	 */
	
	public static int[] arrayRispostaInserita(int[] numero, int posizionePartenza) {
		int[] nuovoArrayPin = new int[5];
		
		for(int i = 0; i < nuovoArrayPin.length; i++) {
			if(i < nuovoArrayPin.length) {
				nuovoArrayPin[i] = numero[posizionePartenza];
				posizionePartenza++;
			} else
				if(i == nuovoArrayPin.length - 1) {
					nuovoArrayPin[i] = numero[posizionePartenza];
				}
		}
		return nuovoArrayPin;
	}
	
	/*
	 * Confronto dei due array
	 */
	
	public static boolean confrontoPin(int[] primoArray, int[] secondoArray) {
		boolean risultatoConfronto;
		
		if(Arrays.equals(primoArray, secondoArray)) {
			risultatoConfronto = true;
		} else {
			risultatoConfronto = false;
		}
	  return risultatoConfronto;
	}
}
