import java.util.Arrays;
import java.util.Scanner;

/*
 *	2- Una palindroma è una parola o una frase che non cambia se letta da sinistra a destra
 *	   o viceversa, ignorando gli spazi e senza distinguere fra lettere maiuscole e minuscole.
 *	   Per esempio, le seguenti frasi o parole sono palindrome:
 *
 *	   a. Ai lati d'italia
 *	   b. radar
 *	   c. I topi non avevano nipoti
 *	   d. xyzczyx
 *
 *	   Scrivere un programma che accetta una sequenza di caratteri terminata da un punto e decide
 *	   se tale stringa (escluso il punto) è palindroma. Si supponga che l'input contenga solo caratteri
 *	   e spazi e sia al più lungo 80 caratteri. Suggerimento: definire un metodo statico chiamato 
 *	   palindroma che inizi come segue:
 *
 *	   public static boolean palindroma(char[] a, int utilizzato)
 *
 *	   Il programma deve leggere i caratteri in input e inserirli in un array il cui tipo base è char e in
 *	   seguito chiamare questo metodo. La variabile int utilizzato tiene traccia di quanta parte dell'array
 *	   è utilizzata.
 * 
 */

public class Palindroma {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		char carattere = ' ';
		String fraseInserita;
		int riempimento = 0;
		
		System.out.println("Inserisci una frase che termina con un punto");
		
		do {
			fraseInserita = tastiera.nextLine();
			fraseInserita = fraseInserita.replaceAll(" ", "");
			fraseInserita = fraseInserita.replaceAll("'", "");
			
			for(int i = 0; i < fraseInserita.length(); i++) {
				carattere = fraseInserita.charAt(i);
			}
		} while(carattere != '.');
	
		
		char[] frase = arrayCaratteri(fraseInserita);
		riempimento = riempimentoArray(fraseInserita);
		
		System.out.println(palindroma(frase, riempimento));
	} 
	
	/*
	 * Vedo se la frase o parola è palindroma
	 */
	
	public static boolean palindroma(char[] a, int utilizzato) {
		
		boolean risultato = false;
		String rovesciato;
		String frase;
		char[] arrayRovesciato = new char[a.length];

			if(utilizzato <= 80) {
				int j = 0;
				
				for(int i = a.length - 2; i >= 0; i--) {
					arrayRovesciato[j] = a[i];
					j++;
				}

				frase = fromCharToString(a);
				rovesciato = fromCharToString(arrayRovesciato);
						
				if(frase.equalsIgnoreCase(rovesciato)) {
					risultato = true;
				} else {
					risultato = false;
				}
				
			} else {
				System.out.println("Errore! Frase troppo lunga");
			}
		return risultato;
	}
	
	/*
	 * Trasformo l'array char in una stringa
	 */
	
	public static String fromCharToString(char[] array) {
		String stringa;
		stringa = Arrays.toString(array);
		return stringa;
	}
	
	/*
	 * Riempio l'array con i caratteri della frase
	 */
	
	public static char[] arrayCaratteri(String fraseInserita) {
		
		char[] frase = new char[fraseInserita.length()];
		char carattere;
		
		for(int i = 0; i < fraseInserita.length(); i++) {
			carattere = fraseInserita.charAt(i);
			
			if(carattere == '.') {
				continue;
			} else {
			frase[i] = carattere;
			}
		}
		return frase;
	}
	
	/*
	 * Controllo il riempimento dell'array
	 */
	
	public static int riempimentoArray(String fraseInserita) {
		
		char[] frase = new char[fraseInserita.length()];
		char carattere;
		int riempimento = 0;
		
		for(int i = 0; i < fraseInserita.length(); i++) {
			carattere = fraseInserita.charAt(i);
			
			if(carattere == '.') {
				continue;
			} else {
			frase[i] = carattere;
			riempimento++;
			}
		}
		return riempimento;
	}
	
}
