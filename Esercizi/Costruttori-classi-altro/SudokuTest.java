import java.util.Scanner;

/*
 *	Test della classe Sudoku 
 */

public class SudokuTest {

	public static void main(String[] args) {
		
		Sudoku gioco = new Sudoku();
		
		Scanner tastiera = new Scanner(System.in);
		
		gioco.inizializzaGioco();
		gioco.visualizzaScacchiera();
		
		while(gioco.pieno() == false) {			
			System.out.println("Inserisci la prossima mossa");
			System.out.println("Vuoi un suggerimento?");
			String risposta = tastiera.next();
			
			if(risposta.equalsIgnoreCase("si")) {
				System.out.println("Inserisci una riga:");
				int riga = tastiera.nextInt();
				System.out.println("Inerisci una colonna:");
				int colonna = tastiera.nextInt();
				System.out.println("Questi sono i valori che possono essere inseriti:");
				boolean[] array = gioco.getValoriValidi(riga, colonna);
				
				for(int i = 1; i < 10; i++) {
					System.out.print(i + ":" + array[i] + " ");
				}
				System.out.println();
			}
			
			System.out.println("Inserisci la posizione sulla riga:");
			int riga = tastiera.nextInt();
			System.out.println("Inserisci la posizione nella colonna:");
			int colonna = tastiera.nextInt();
			System.out.println("Inerisci il valore:");
			int valore = tastiera.nextInt();
			gioco.aggiungiMossa(riga, colonna, valore);
			
			System.out.println();
			System.out.println("Stato attuale");
			gioco.visualizzaScacchiera();
			System.out.println();
		}
		System.out.println("Hai completato il gioco, complimenti!");
		gioco.reset();
	}

}
