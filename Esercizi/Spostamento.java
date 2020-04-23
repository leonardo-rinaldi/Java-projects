import java.util.Scanner;

/* 
 *  3- Si scriva un programma che legga una riga di testo come input e che la
 *    visualizzi dopo aver spostato la prima parola alla fine della riga. Un
 *    possibile esempio del risultato da ottenere è il seguente:
 *    
 *    Java è un linguaggio
 *    
 *    è un linguaggio Java
 * 
 * 
 */


public class Spostamento {

	public static void main(String[] args) {
		
		String primaParolaInserita;
		String secondaParolaInserita;
		
		System.out.println("Scrivi una riga di testo senza punteggiatura.");
		
		Scanner parola = new Scanner(System.in);
		
		
		
		primaParolaInserita = parola.next();
		secondaParolaInserita = parola.nextLine();
		
		System.out.println(secondaParolaInserita + " " + primaParolaInserita);
		
		
		
		
	}

}
