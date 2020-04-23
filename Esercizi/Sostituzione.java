import java.util.Scanner;

/*  
 *   2- Si scriva un programma che legga una riga di testo e poi la visualizzi
 *   	sostituendo la prima occorrenza della parola "odio" con "amore". Un 
 *   	possibile esempio di output potrebbe essere:
 *   
 *   	Io ti odio
 *   	io ti amo 
 * 
 */


public class Sostituzione {

	public static void main(String[] args) {
		
		String fraseInserita;
		String nuovaFrase;
		
		Scanner frase = new Scanner(System.in);
		
		System.out.println("Inserisci una riga di testo:");
		
		fraseInserita = frase.nextLine();
		
		nuovaFrase = fraseInserita.replace("odio", "amo");
		
		System.out.println(nuovaFrase);
		
	}

}
