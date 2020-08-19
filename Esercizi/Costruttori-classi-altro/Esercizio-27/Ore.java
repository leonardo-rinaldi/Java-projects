/*
 *	1- Si consideri la classe Ora che rappresenta una certa ora del giorno.
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
 * 	   Si includano inoltre i seguenti metodi:
 * 
 * 	   - getOra24: restituisce una stringa che rappresenta l'ora del giorno in una notazione
 * 				   a 24 ore: hhmm. Per esempio, se i valori di ore e minuti sono rispettivamente
 * 				   7 e 25, deve restituire "07:25. Se i valori di ore e minuti sono rispettivamente
 * 				   0 e 5, restituisce "00:05". Se i valori di ore e minuti sono rispettivamente 15
 * 				   e 30, restituisce "15:30";
 * 
 * 	   - getOra12: restituisce le ore in una notazione a 12 ore: h:mm xx. Per esempio se le ore e i 
 *     			   minuti valgono rispettivamente 7 e 25, restituisce "7:25 am". Se il valore delle
 *     			   ore è 15 e quello dei minuti è 30, restituisce "3:30 pm".
 * 
 */

public class Ore {

	private int ora;
	private int minuti;
	private boolean AM;
	
	/*
	 * Costruttore default
	 */
	
	public Ore() {
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
	
	/*
	 * Rappresenta le ore del iorno in una notazione
	 * a 24 ore.
	 */
	
	public void getOra24() {
		String oraStringa = Integer.toString(ora);
		String minutiStringa = Integer.toString(minuti);
		
		if(ora < 10) {
			oraStringa = "0" + oraStringa;
		}
		if(minuti < 10) {
			minutiStringa = "0" + minutiStringa;
		}
		System.out.println(oraStringa + ":" + minutiStringa);
	}
	
	/*
	 * Rappresenta le ore del giorno in una notazione
	 * a 12 ore.
	 */
	
	public void getOra12() {
		String oraStringa = Integer.toString(ora);
		String minutiStringa = Integer.toString(minuti);
		
		if(ora >= 0 && ora < 12) {
			if(ora == 0) {
				oraStringa = "12";
			}
			if(minuti < 10) {
				minutiStringa = "0" + minutiStringa;
			}
			System.out.println(oraStringa + ":" + minutiStringa + " AM");
		} else {
			oraStringa = conversioneOra(ora);
			
			if(minuti < 10) {
				minutiStringa = "0" + minutiStringa;
			}
			System.out.println(oraStringa + ":" + minutiStringa + " PM");
		}
	}
	
	private String conversioneOra(int ora) {
		String oraStringa = Integer.toString(ora);
		
		switch(ora) {
		case 12:
			oraStringa = "12";
			break;
		case 13:
			oraStringa = "1";
			break;
		case 14:
			oraStringa = "2";
			break;
		case 15:
			oraStringa = "3";
			break;
		case 16:
			oraStringa = "4";
			break;
		case 17:
			oraStringa = "5";
			break;
		case 18:
			oraStringa = "6";
			break;
		case 19:
			oraStringa = "7";
			break;
		case 20:
			oraStringa = "8";
			break;
		case 21:
			oraStringa = "9";
			break;
		case 22:
			oraStringa = "10";
			break;
		case 23:
			oraStringa = "11";
			break;
		}
		return oraStringa;
	}
	
	public void visualizza() {
		System.out.println("Ora: " + ora);
		System.out.println("Minuti: " + minuti);
		System.out.println("AM: " + AM);
	}
}
