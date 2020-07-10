import java.util.Scanner;

/*
 * 	5- Si scriva un programma che chieda all'utente di inserire le dimensioni di un triangolo
 * 	   (un intero tra 1 e 50). Si visualizzi il triangolo mostrando righe di asterischi. La prima
 * 	   riga avrà un asterisco in più della precedente fino a raggiungere il numero di righe indicato 
 * 	   dall'utente. Per le righe succesive, il numero di asterischi per riga deve decrescere di uno
 * 	   per ogni nuova riga. Per esempio, se l'utente scrive 3 l'output sarà:
 * 
 * 	   *
 * 	   **
 * 	   ***
 * 	   **
 * 	   *
 */

public class Asterisco {

	public static void main(String[] args) {

		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci le dimensioni di un triangolo");
		System.out.println("Il valore deve essere compreso tra 1 e 50");
		
		int righeInserite = tastiera.nextInt();
		System.out.println();
		
		int i;
		int x;
		
		
		if(righeInserite >= 1 && righeInserite <= 50) {
			
			for(x = 1; x <= righeInserite; x++) {
				
				for(i = 0; i < x; i++) {
					System.out.print("*");
				}

				System.out.println();
				
				}
				
				
				for(x = righeInserite -1 ; x > 0; x--) {
					
					for(i = x; i > 0; i--) {
						System.out.print("*");
					}

					System.out.println();
					
					}
		} else {
			System.out.println("Il numero inserito non è valido.");
		}
		
	}
	

}
