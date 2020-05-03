import java.util.Scanner;

/* 
 * 	6- Scrivere un programma che riceve in input un numero intero. Se il valore
 * 	   è maggiore di 100 o compreso tra 50 e 75 (estremi inclusi), allora l'output
 * 	   dovrà essere SI, altrimenti NO. Il programma dovrà utilizzare un'istruzione
 * 	   if-else e gli operatori relazionali && (and) e || (or).
 * 
 */


public class NumeroIntero {

	public static void main(String[] args) {
		
		int numeroInserito;
		
		Scanner numero = new Scanner(System.in);
		System.out.println("Inserisci un numero intero: ");
		
		numeroInserito = numero.nextInt();
		
		if (numeroInserito > 100 || ( 50 <= numeroInserito ) && (numeroInserito <= 75) ) {
			System.out.println("SI");
		}
		else {
			System.out.println("NO");
		}
	}

}
