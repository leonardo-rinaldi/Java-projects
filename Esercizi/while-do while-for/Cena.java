import java.util.Scanner;

/*
 *	8- Che cosa c'è per cena? Lasciamo decidere al computer. Scrivere un programma
 *	   che genera un numero intero casuale da 1 a 4 (si veda il precedente programma
 *	   sulla generazione di numeri casuali). Utilizzare il numero casuale in una 
 *	   istruzione switch o if in modo da ottenere "Pizza" se il numero è 1 o 2,
 *	   "Bibimbap" se il numero è 3, "Couscous" se il numero è 4.
 * 
 */

public class Cena {

	public static void main(String[] args) {
		
		String risposta;
		
		Scanner tastiera = new Scanner(System.in);
		
		do {
			
			int num = (int) (Math.random() * 4) + 1;
			
			switch(num) {
			
			case 1:
				System.out.println("Per cena c'è: pizza ");
				break;
			case 2:
				System.out.println("Per cena c'è: pizza");
				break;
			case 3:
				System.out.println("Per cena c'è: bibimbap");
				break;
			case 4:
				System.out.println("Per ena c'è: couscous");
			}
			
			System.out.println();
			System.out.println("Vuoi continuare?");
			System.out.println("Rispondi si oppure no");
			risposta = tastiera.nextLine();
			
		} while(risposta.equalsIgnoreCase("si"));
	}

}
