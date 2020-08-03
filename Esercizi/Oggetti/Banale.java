import java.util.Scanner;

/* 
 * 	3- Definire una classe Banale che contiene informazioni su una singola domanda banale.
 * 	   La domanda e la risposta devono essere definite come variabili di istanza di tipo
 * 	   String. Creare i metodi get e set. Nel metodo main creare due oggetti Banale con
 * 	   domande e risposte a piacere. Poi, per ogni oggetto Banale il programma dovrà porre
 * 	   la domanda, accettare una risposta dall'utente, confrontare questa risposta con quella
 * 	   vera e indicare in output se la risposta dell'utente è corretta oppure no.
 * 
 */

public class Banale {

	private String domanda;
	private String risposta;
	
	public void setValori() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una domanda banale:");
		domanda = tastiera.nextLine();
		System.out.println("Inserisci una risposta:");
		risposta = tastiera.next();
	}
	
	public void poniDomande() {
		Scanner tastiera = new Scanner(System.in);
		String rispostaInserita;
		
		System.out.println();
		System.out.println(domanda);
		rispostaInserita = tastiera.next();
		
		if(equals(rispostaInserita)) {
			System.out.println("Risposta corretta");
		} else {
			System.out.println("Risposta errata!");
		}
	}
	
	private boolean equals(String rispostaInserita) {
		return rispostaInserita.equalsIgnoreCase(risposta);
	}
	
	public String getDomanda() {
		return domanda;
	}
	
	public String getRisposta() {
		return risposta;
	}
}
