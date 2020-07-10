import java.util.Scanner;

/*
 * 	2- Si scriva un programma che individua se una parola è palindroma, cioè se scritta 
 * 	   nel verso opposto è uguale alla parola di partenza. Anna, per esempio, è una parola
 * 	   palindroma. Il programma deve terminare quando viene scritta la parola uscita.
 * 
 */

public class Palindroma {

	public static void main(String[] args) {
		
		String parolaInvertita;
		String risposta;
		
		Scanner tastiera = new Scanner(System.in);
		
		
		do {
			parolaInvertita = "";
			
			System.out.println("Scopri se la parola che hai inserito è palindroma");
			System.out.println("Inserisci una parola");
			
			risposta = tastiera.nextLine();
			
			for(int i = risposta.length() - 1; i >= 0; i--) {
				
				char carattere = risposta.charAt(i);
				
				
				parolaInvertita = parolaInvertita + carattere;
				
			}
			
			if(risposta.equalsIgnoreCase(parolaInvertita)) {
				System.out.println("La parola è palindroma");
			} else {
				System.out.println("La parola non è palindroma");
			}
			
			System.out.println("Per uscire dal programma scrivi uscita, altrimenti premi un tasto qualunque");
			risposta = tastiera.nextLine();
			
		} while(!risposta.equalsIgnoreCase("uscita"));
		
		
		
	}

}
