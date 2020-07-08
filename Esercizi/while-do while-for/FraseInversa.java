import java.util.Scanner;

/* 
 * 	9- Si scriva un ciclo che crei una nuova stringa che corrisponde all'inversione di un a stringa data
 * 
 */

public class FraseInversa {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una parola e verrà restituita invertita:");
		
		String frase = tastiera.nextLine();
		
		for(int i = frase.length() - 1; i >= 0; i--) {	
			
			char carattere = frase.charAt(i);
			
			System.out.print(carattere);
		}
	}

}
