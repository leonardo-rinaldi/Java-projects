import java.util.Scanner;

/*
 * 	3- Si scriva un algoritmo per un semplice gioco che chieda di indovinare un codice numerico
 * 	   di cinque cifre. Quando l'utente scrive la risposta, il programma restituisce due valori:
 * 	   il numero di cifre al posto giusto e la somma di queste cifre. Per esempio, se il codice 
 * 	   segreto è 53840 e l'utente ipotizza 83241, le cifre 3 e 4 sono al posto giusto. Il 
 * 	   programma perciò restituirebbe in output i numeri 2 (cifre corrette) e 7 (somma). Si 
 * 	   permetta all'utente di provare per un numero prefissato di volte.
 * 
 */

public class AlgoritmoGioco {

	public static void main(String[] args) {
		
		int numeroSegreto = 53840;
		int contatore = 0;
		int somma = 0;
		int tentativi = 0;
		
		Scanner tastiera = new Scanner(System.in);
		
		do {
			
		contatore = 0;
		
		System.out.println("Prova ad indovinare il codice numerico a 5 cifre");
		System.out.println("Inserisci un numero:");
	     
		int numeroInserito = tastiera.nextInt();
		
		String numeroSegretoString = Integer.toString(numeroSegreto);
		String numeroInseritoString = Integer.toString(numeroInserito);
		
		
			for(int i = 0; i < numeroSegretoString.length(); i++) {
			
				if(numeroInseritoString.charAt(i) == numeroSegretoString.charAt(i)) {	
					contatore++;
					
					System.out.println(numeroInseritoString.charAt(i));
					String cifreString = String.valueOf(numeroInseritoString.charAt(i));	
					int cifreInt = Integer.valueOf(cifreString);							
					System.out.println(cifreInt);
					
					somma = somma + cifreInt;
					 
				}
		
		}
		
		System.out.println("Il numero di cifre corrette è:" + contatore);
		System.out.println("La somma delle cifre è: " + somma);
		System.out.println("Prova di nuovo, hai un altro tentativo.");
		tentativi++;
		
		} while (tentativi <= 10);
		
		System.out.println("Hai finito i tentativi");
	}

}
