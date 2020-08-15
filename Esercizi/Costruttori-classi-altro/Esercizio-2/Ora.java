/*
 *	2- Si consideri la classe Ora che rappresenta una certa ora del giorno.
 *	   Questa classe ha delle variabili di istanza per rappresentare l'ora 
 *	   e i minuti. Il valore delle ore varia da 0 a 23. I minuti variano da 
 *	   0 a 59.
 *
 *	   a. Si scriva un costruttore di default che inizializza l'ora a 0 ore e 0
 *		  minuti.
 *	   b. Si scriva un metodo privato valida(ore, minuti) che restituisce il valore
 *		  true se i valori passati sono validi.
 *	   c. Si scriva un metodo setOra(ore, minuti) che assegna l'ora data se i valori
 *		  passati sono validi.
 *	   d. Si scriva un altro metodo setOra(ore, minuti, AM) che assegna l'ora data se
 *		  i valori sono validi. Il parametro ore deve essere nel range 1-12. Il parametro
 *		  AM è true se le ore sono mattutine, altrimenti deve essere false.
 * 
 */

public class Ora {

	private int ora;
	private int minuti;
	private boolean AM;
	
	/*
	 * Costruttore default
	 */
	
	public Ora() {
		ora = 0;
		minuti = 0;
		AM = false;
	}
	
	private boolean valida(int ore, int minuti) {
		boolean risultato;
		
		if((ore >= 0 && ore <= 23) && (minuti >= 0 && minuti <= 59)) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
	
	public void setOra(int ore, int minuti) {
		boolean valido = valida(ore, minuti);
		if(valido) {
			this.ora = ore;
			this.minuti = minuti;
		} else {
			System.out.println("Valori non validi!");
		}
	}
	
	public void setOra(int ore, int minuti, boolean AM) {
		if((ore >= 1 && ore <= 12) && (minuti >= 0 && minuti <= 59)) {
			this.ora = ore;
			this.minuti = minuti;
			this.AM = AM;
		}
	}
	
	public void visualizza() {
		System.out.println("Ora: " + ora);
		System.out.println("Minuti: " + minuti);
		System.out.println("AM: " + AM);
	}
	
}
