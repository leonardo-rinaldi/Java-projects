import java.util.Scanner;

/*
 
 * 
 * 	16- Data la variabile int di nome temp contenente una temperatura non
 * 		negativa, scrivere un'istruzione Java che usi l'operatore condizionale
 * 		per assegnare alla variabile String etichetta il valore "grado" o "gradi".
 * 		Lo scopo della variabile etichetta è quello di generare un output grammaticalmente
 * 		corretto, come per esempio "0 gradi", "1 grado", "2 gradi" e così via.
 * 
 */

public class Temperatura {

	public static void main(String[] args) {
		
		int temp;
		
		Scanner numeroInserito = new Scanner(System.in);
		System.out.println("Inserisci una temperatura:");
		
		temp = numeroInserito.nextInt();
		
		if(temp > 1) {
			System.out.println(temp + " gradi");
		}
		else {
			System.out.println(temp + " grado");
		}
		
	}

}
