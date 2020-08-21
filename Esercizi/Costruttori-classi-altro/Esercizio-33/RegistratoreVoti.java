import java.util.Scanner;

/*
 * 	8- Si scriva un programma che registra i voti per uno tra due candidati usando la
 * 	   classe RegistratoreVoti, che deve essere progettata e implementata secondo le 
 * 	   specifiche di seguito fornite. RegistratoreVoti deve avere delle variabili
 * 	   statiche per tracciare il numero totale di voti per i candidati e variabili
 * 	   di istanza per tracciare i voti fatti da una singola Persona. La classe avrà
 * 	   le seguenti variabili:
 * 
 * 	   - nomeCandidatoPresidente1: una variabile statica di tipo String che contiene
 * 								   il nome del primo candidato presidente;
 * 	   - nomeCandidatoPresidente2: una variabile statica di tipo String che contiene
 * 								   il nome del secondo candidato presidente;
 * 	   - nomeCandidatoVicePresidente1: una variabile statica di tipo String che
 * 									   contiene il nome del primo candidato alla carica
 * 									   di vicepresidente;
 * 	   - nomeCandidatoVicePresidente2: una variabile statica di tipo String che contiene 
 * 									   il nome del secondo candidato alla carica di
 * 									   vicepresidente;
 * 	   - votiPerCandidatoPresidente1: una variabile statica che conta i voti per il primo
 * 									  candidato;
 * 	   - votiPerCandidatoPresidente2: una variabile statica che conta i voti per il secondo
 * 									  candidato presidente;
 * 	   - votiPerCandidatoVicePresidente1: una variabile statica che conta i voti per il primo
 * 										  candidato alla carica di vicepresidente;
 * 	   - votiPerCandidatoVicePresidente2: una variabile statica che conta i voti per il
 * 										  secondo candidato alla carica di vicepresidente;
 * 	   - mioVotoPerPresidente: un intero che contiene il voto di una singola persona per la 
 * 							   carica di presidente (0 per nessuna scelta, 1 per il primo
 * 							   candidato, 2 per il secondo candidato).
 * 
 * 	   Olte a opportuni costruttori, RegistratoreVoti deve definire i seguenti metodi:
 * 
 * 	   - setCandidatiPresidente(String nome1, String nome2): metodo statico per impostare i
 * 		 nomi dei candidati alla carica di presidente;
 * 	   - setCandidatiVicePresidente(String nome1, String nome2): metodo statico per impostare
 * 		 i nomi dei candidati alla carica di vicepresidente;
 * 	   - resettaVoti: metodo statico che resetta il conteggio dei voti a 0;
 * 	   - getVotiPresidenti: metodo statico che restituisce una stringa contenente i voti per
 * 		 entrambi i candidati alla carica di presidente.
 * 	   - getVotiVicePresidenti: metodo statico che restituisce una stringa contenete i valori per
 * 		 entrambi i candidati alla carica di vicepresidente;
 * 	   - restituisciEConfermaVoti: un metodo di istanza che restituisce i voti di un individuo, li
 * 		 conferma e li registra;
 * 	   - getVotoPresidente(String nome) metodo statico che restituisce una scelta di voto fatta
 * 		 tra due candidati presidenti (0 per nessuna scelta, 1 per il primo candidato, 2 per il
 * 		 secondo candidato);
 * 	   - getVotoVicePresidente(String nome): metodo statico che restituisce una scelta di voto fatta
 * 		 tra due candidati vice presidenti (0 per nessuna scelta, 1 per il primo candidato, 2 per il
 * 		 secondo candidato);
 * 	   - getVoti: un metodo privato che restituisce una scelta di voto per i candidati di presidente
 * 		 e vicepresidente fatta da un individuo;
 * 	   - confermaVoti: un metodo privato che mostra i voti di una persona e chiede al votante se è
 * 		 contento della scelta e restituisce true se questa ha risposto si e false se ha risposto no;
 * 	   - registraVoti: un metodo privato che aggiunge i voti di un individuo alle variabili statiche
 * 		 appropriate.
 * 
 */

public class RegistratoreVoti {

	public static String nomeCandidatoPresidente1;
	public static String nomeCandidatoPresidente2;
	public static String nomeCandidatoVicePresidente1;
	public static String nomeCandidatoVicePresidente2;
	public static int votiCandidatoPresidente1;
	public static int votiCandidatoPresidente2;
	public static int votiPerCandidatoVicePresidente1;
	public static int votiPerCandidatoVicePresidente2;
	public static int mioVotoPerPresidente;
	public static int mioVotoPerVicePresidente;
	
	/*
	 * Costruttore default
	 */
	
	public RegistratoreVoti() {
		nomeCandidatoPresidente1 = "";
		nomeCandidatoPresidente2 = "";
		nomeCandidatoVicePresidente1 = "";
		nomeCandidatoVicePresidente2 = "";
		votiCandidatoPresidente1 = 0;
		votiCandidatoPresidente2 = 0;
		votiPerCandidatoVicePresidente1 = 0;
		votiPerCandidatoVicePresidente2 = 0;
		mioVotoPerPresidente = 0;
		mioVotoPerVicePresidente = 0;
	}
	
	public RegistratoreVoti(String nome1, String nome2, String nome3, String nome4) {
		nomeCandidatoPresidente1 = nome1;
		nomeCandidatoPresidente2 = nome2;
		nomeCandidatoVicePresidente1 = nome3;
		nomeCandidatoVicePresidente2 = nome4;
		votiCandidatoPresidente1 = 0;
		votiCandidatoPresidente2 = 0;
		votiPerCandidatoVicePresidente1 = 0;
		votiPerCandidatoVicePresidente2 = 0;
		mioVotoPerPresidente = 0;
		mioVotoPerVicePresidente = 0;
	}
	
	public static void setCandidatiPresidente(String nome1, String nome2) {
		nomeCandidatoPresidente1 = nome1;
		nomeCandidatoPresidente2 = nome2;
	}
	
	public static void setCandidatiVicePresidente(String nome1, String nome2) {
		nomeCandidatoVicePresidente1 = nome1;
		nomeCandidatoVicePresidente2 = nome2;
	}
	
	public static void resettaVoti() {
		votiCandidatoPresidente1 = 0;
		votiCandidatoPresidente2 = 0;
		votiPerCandidatoVicePresidente1 = 0;
		votiPerCandidatoVicePresidente2 = 0;
	}
	
	public static void getVotiPresidenti() {
		System.out.println(nomeCandidatoPresidente1 + " ha guadagnato " + votiCandidatoPresidente1 + " punti");
		System.out.println(nomeCandidatoPresidente2 + " ha guadagnato " + votiCandidatoPresidente2 + " punti");
	}
	
	public static void getVotiVicePresidenti() {
		System.out.println(nomeCandidatoVicePresidente1 + " ha guadagnato " + votiPerCandidatoVicePresidente1 + " punti");
		System.out.println(nomeCandidatoVicePresidente2 + " ha guadagnato " + votiPerCandidatoVicePresidente2 + " punti");
	}
	
	public void restituisciEConfermaVoti() {
		getVoti();
		confermaVoti();
		registraVoti();
		
	}
	
	public void getVotoPresidente(String nome) {
		
		if(nome.equalsIgnoreCase(nomeCandidatoPresidente1)) {
			mioVotoPerPresidente = 1;
		} else
			if(nome.equalsIgnoreCase(nomeCandidatoPresidente2)) {
				mioVotoPerPresidente = 2;
			} else {
				mioVotoPerPresidente = 0;
			}
	}
	
	public void getVotoVicePresidente(String nome) {
		
		if(nome.equalsIgnoreCase(nomeCandidatoVicePresidente1)) {
			mioVotoPerVicePresidente = 1;
		} else
			if(nome.equalsIgnoreCase(nomeCandidatoVicePresidente2)) {
				mioVotoPerVicePresidente = 2;
			} else {
				mioVotoPerVicePresidente = 0;
			}
	}
	
	private void getVoti() {
		if(mioVotoPerPresidente == 1) {
			System.out.println("Hai votato come presidente: " + nomeCandidatoPresidente1);
		} else
			if(mioVotoPerPresidente == 2) {
				System.out.println("Hai votato come presidente: " + nomeCandidatoPresidente2);
			} else {
				System.out.println("Voto nullo per il presidente");
			}
		
		if(mioVotoPerVicePresidente == 1) {
			System.out.println("Hai votato come vice presidente: " +  nomeCandidatoVicePresidente1);
		} else
			if(mioVotoPerVicePresidente == 2) {
				System.out.println("Hai votato come vice presidente: " + nomeCandidatoVicePresidente2);
			} else {
				System.out.println("Voto nullo per il presidente");
			}
	}
	
	private boolean confermaVoti() {
		Scanner tastiera = new Scanner(System.in);
		String risposta;
		boolean risultato;
		
		System.out.println("Questi sono i tuoi voti:");
		System.out.println("Voto presidente: " + mioVotoPerPresidente);
		System.out.println("Voto vice presidente: " + mioVotoPerVicePresidente);
		System.out.println("Sei contento/a della scelta fatta?");
		risposta = tastiera.next();
		
		if(risposta.equalsIgnoreCase("si")) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
	
	private void registraVoti() {
		if(mioVotoPerPresidente == 1) {
			votiCandidatoPresidente1++;
		} else
			if(mioVotoPerPresidente == 2) {
				votiCandidatoPresidente2++;
			}
		
		if(mioVotoPerVicePresidente == 1) {
			votiPerCandidatoVicePresidente1++;
		} else
			if(mioVotoPerVicePresidente == 2) {
				votiPerCandidatoVicePresidente2++;
			}
	}
	
	public void visualizza() {
		System.out.println("Voti candidato presidente 1: " + votiCandidatoPresidente1);
		System.out.println("Voti candidato presidente 2: " + votiCandidatoPresidente2);
		System.out.println("Voti candidato vice presidente 1: " + votiPerCandidatoVicePresidente1);
		System.out.println("Voti candidato vice presidente 2: " + votiPerCandidatoVicePresidente2);
	}
}
