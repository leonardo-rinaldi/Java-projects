/*
 * 	6- Si consideri una classe che può essere usata per un gioco in cui si deve indovinare
 * 	   una parola, indicando le diverse lettere in essa contenute. La classe deve avere i
 * 	   seguenti attributi:
 * 
 * 	   - la parola da indovinare;
 * 	   - le lettere scoperte, in cui ciascuna lettera non ancora scoperta è sostituita da
 * 	     un punto interrogativo. Per esempio, se la parola segreta e abbracadabra e le
 * 		 lettere a, b ed e sono state indovinate dai giocatori, la parola scoperta sarà
 * 		 ab?a?a?ab?a;
 * 	   - il numero di tentativi fatti;
 * 
 * 	   La classe avrà i seguenti metodi:
 * 
 * 	   - indovina(c) - prova a indovinare se la lettera c è parte della parola;
 * 	   - getParolaScoperta - restituisce una stringa che contiene le lettere indovinate
 * 		 nelle loro corrette posizioni e le lettere non ancora scoperte sostituite con un
 * 		 punto interrogativo;
 * 	   - getParolaDaIndovinare - restituisce la parola da indovinare;
 * 	   - getNumeroTentativi - restituisce il numero di tentativi;
 * 	   - isIndovinata - restituisce vero se la parola è stata indovinata.
 * 
 */

public class IndovinaParola {

	private String parolaDaIndovinare;
	private char[] lettereScoperte;
	private int tentativiFatti;
	
	/*
	 * Inizializza i valori
	 */
	
	public void inizializza() {
		parolaDaIndovinare = "gatta";
		lettereScoperte = new char[parolaDaIndovinare.length()];
	}
	
	/*
	 * Riempie l'array che rappresenta le lettere scoperte con
	 * tanti ? quante sono le lettere della parola da scoprire
	 */
	
	public void riempiArray() {
		for(int i = 0; i < lettereScoperte.length; i++) {
			lettereScoperte[i] = '?';
		}
	}
	
	/*
	 * Precondizione: lettereScoperte e parolaDaIndovinare devono
	 * essere inizializzati.
	 * Sostituisce nell'array lettereScoperte i ? con le lettere
	 * indovinate
	 */
	
	public void indovina(char c) {
		tentativiFatti++;
		char j;
		for(int i = 0; i < lettereScoperte.length; i++) {
			j = parolaDaIndovinare.charAt(i);
			if(c == j) {
				lettereScoperte[i] = c;
			} else {
				continue;
			}
		}
	}
	
	public void getParolaScoperta() {
		for(int i = 0; i < lettereScoperte.length; i++) {
			System.out.print(lettereScoperte[i]);
		}
		System.out.println();
	}
	
	public String getParolaDaIndovinare() {
		return parolaDaIndovinare;
	}
	
	public int getNumeroTentativi() {
		return tentativiFatti;
	}
	
	/*
	 * Restituice true se le parole sono uguali, false se sono
	 * diverse.
	 */
	
	public boolean isIndovinata() {
		String parola = "";
		boolean risultato;
		for(int i = 0; i < lettereScoperte.length; i++) {
			parola = parola + lettereScoperte[i];
		}
		if(parola.equalsIgnoreCase(parolaDaIndovinare)) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
}
