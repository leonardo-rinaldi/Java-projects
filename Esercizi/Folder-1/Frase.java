import java.util.Scanner;

/*
 * 	
 * 
 * 	4- Si scriva un programma che chieda all'utente di scrivere il colore preferito,
 * 	   il piatto preferito, l'animale preferito, il nome di un amico o di un parente. 
 * 	   Il programma dovrebbe quindi scivere le due righe seguenti, dove l'input dell'utente
 * 	   sostituisce le parole in maisucolo:
 * 
 * 		Ho sognato che NOME aveva mangiato un ANIMALE COLORE e aveva detto che sapeva di PIATTO.
 * 	
 * 	   
 * 
 */

public class Frase {

	public static void main(String[] args) {
		
		String nome;
		String animale;
		String colore;
		String piatto;
		
		Scanner parola = new Scanner(System.in);
		
		System.out.println("Inserisci un nome:");
		nome = parola.nextLine();
		
		System.out.println("Inserisci il nome di un animale:");
		animale = parola.nextLine();
		
		System.out.println("Inserisci un colore:");
		colore = parola.nextLine();
		
		System.out.println("Inserisci piatto:");
		piatto = parola.nextLine();
		
		System.out.println();
		System.out.println("Ho sognato che " + nome + " aveva mangiato un " + animale + " " + colore +  " e aveva detto che sapeva di " + piatto + ".");
	}

}
