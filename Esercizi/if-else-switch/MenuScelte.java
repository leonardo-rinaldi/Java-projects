import java.util.Scanner;

/*
 * 
 * 	13- Si supponga di scrivere un programma che mostra un menu con cinque scelte
 * 		indicate con la lettera dalla a alla e. Si supponga che la scelta 
 * 		dell'utente sia letta e assegnata alla variabile "scelta". Scrivere 
 * 		un'istruzione switch che mostri un messaggio che indica la scelta effetuata.
 * 		Si mostri un messaggio di errore se l'utente effettua  una scelta sbagliata.
 * 
 */

public class MenuScelte {

	public static void main(String[] args) {
		
		String scelta;
		
		Scanner sceltaUtente  = new Scanner(System.in);
		
		System.out.println("Qual è la capitale dell'Italia?");
		System.out.println("Scegli tra una delle seguenti risposte:");
		System.out.println("a) Milano");
		System.out.println("b) Roma");
		System.out.println("c) Napoli");
		System.out.println("d) Firenze");
		System.out.println("e) Venezia");
		
		scelta = sceltaUtente.next();
		
		switch (scelta) {
		
		case "a":
			System.out.println("Sbagliato!");
			break;
			
		case "b":
			System.out.println("Giusto!");
			break;
			
		case "c":
			System.out.println("Sbagliato!");
			break;
			
		case "d":
			System.out.println("Sbagliato!");
			break;
			
		case "e":
			System.out.println("Sbagliato!");
			break;
			
			default:
				System.out.println("Risposta non valida!");
			
		}
	}

}
