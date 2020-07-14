package metodi;

import java.util.Scanner;

/*
 *	Test del metodo conta.
 */

public class CarattereStringaTest {

	public static void main(String[] args) {
		
		String stringa;
		int numeroIntero;
		char carattere;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa:");
		stringa = tastiera.nextLine();
		System.out.println("Inserisci un numero intero:");
		numeroIntero = tastiera.nextInt();
		
		carattere = stringa.charAt(numeroIntero);
		
		System.out.println("stringa = \"" + stringa + "\", n = " + numeroIntero + ", il numero di volte in cui compare");
		System.out.println("il carattere \'" + carattere + "\' è " + CarattereStringa.conta(stringa, carattere));
	}

}
