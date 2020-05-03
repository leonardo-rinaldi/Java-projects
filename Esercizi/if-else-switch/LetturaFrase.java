import java.util.Scanner;

/*
 * 	4- Scrivere un programma che legga una frase di una riga e quindi mostri
 * 	   la seguente risposta:
 * 
 * 	   - Si se la frase termina con un punto interrogativo (?) e il numero di 
 * 		 caratteri è pari;
 * 
 * 	   -No se la frase termina con un punto interrogativo (?), ma il numero
 * 	    di caratteri è dispari;
 * 
 * 	   -Wow se la frase termina con un punto esclamativo (!);
 * 		
 * 	   -le parole "Tu dici sempre" seguite dalla frase inserita tra doppi
 * 		apici in tutti gli altri casi
 * 
 * 	   L'output del programma dovrebbe essere contenuto in una sola riga.
 * 	   Si noti che nell'ultimo caso l'output deve comprendere i doppi apici
 * 	   intorno alla stringa. In tutti gli altri casi non devono comparire apici 
 * 	   nell'output. Il programma non deve verificare se la frase in input sia sensata.
 * 
 */

public class LetturaFrase {

	public static void main(String[] args) {
		
		String frase;
		String ultimoCarattere;
		
		Scanner fraseInserita = new Scanner(System.in);
		System.out.println("Inserisci una frase:");
		
		frase = fraseInserita.nextLine();
		
		ultimoCarattere = frase.substring(frase.length() - 1, frase.length()); //prendo solamente l'ultimo carattere
		
		if ( (frase.length() % 2 == 0) && (ultimoCarattere.contentEquals("?")) ) { //primo caso
			System.out.println("Si");
		}
		else
			if ( (frase.length() % 2 != 0) && (ultimoCarattere.contentEquals("?")) ) { //secondo caso
				System.out.println("No");
			}
			else 
				if (ultimoCarattere.contentEquals("!")) { //terzo caso
				System.out.println("Wow");
			}
				else {
					System.out.println("Tu dici sempre \"" + frase  +"\"");
				}
					
	}

}
