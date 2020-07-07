import java.util.Scanner;

/*
 * 	8- Si scriva un ciclo che conti il numero di caratteri di spazziattura in una stringa data.
 */

public class CaratteriSpaziatura {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserire una frase e verranno calcolati i numeri di spazi al suo interno.");
		String frase = tastiera.nextLine();
		int numeroSpazi = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			
			char spazio = frase.charAt(i);	
			
			if(spazio ==  ' ') {	
				numeroSpazi ++;
				
			}
		}
		System.out.println("Il numero di spazi totali è: " + numeroSpazi);
		
	}

}
