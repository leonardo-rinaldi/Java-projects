import java.util.Scanner;

/* 
 *	3- Scrivere un programma che chieda all'utente di restituire una risposta
 *	   di tipo si/no. Si supponga che il programma legga la risposta dell'utente
 *	   e la inserisca nella variabile String risposta.
 *
 * 	   - Se il valore di "risposta" è si o s, assegnare alla variabile "accettato" il 
 * 		 valore true; altrimenti assegnare false. 
 * 
 * 	   - Come si può modificare il codice in modo che accetti anche i valori Si e S?
 */

public class Risposta {

	public static void main(String[] args) {
		
		String risposta;
		String domanda;
		Boolean accettato;
		
		Scanner richiesta = new Scanner(System.in);
		System.out.println("Scrivi si oppure no (puoi scrivere anche s invece di si)");
		domanda = richiesta.nextLine();
		
		if ( domanda.equalsIgnoreCase("si") || domanda.equalsIgnoreCase("s")) {  //ignora se le lettere della stringa sono maiscole o minuscole
			accettato = true;
			System.out.println(accettato);
		}
		else {
			accettato = false;
			System.out.println(accettato);
		}
	}

}
