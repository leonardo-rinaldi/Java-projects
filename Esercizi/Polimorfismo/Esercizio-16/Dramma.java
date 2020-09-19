/*
 * 	16- Si definisca una classe astratta Film che rappresenta un film preso a noleggio da
 * 		una videoteca. Nella classe Film si deve definire un codice identificativo e un
 * 		titolo. Si definiscano per questi attributi i metodi get e set. Si definisca anche 
 * 		un metodo equals che sovrascrive quello ereditao da Object e che restituisce true
 * 		se due film hanno il loro codice identificativo uguale. Si creino, inoltre, tre classi
 * 		derivate dalla classe Film chiamate Azione, Commedia e Dramma. In ultimo, si crei un
 * 		metodo ridefinito chiamato calcolaPenaleRitardo che prende in ingresso il numero di
 * 		giorni di ritardo per un film e restituisce la penale per quel film. La penale 
 * 		predefinita è di Euro 2 al giorno. I film di azione hanno una penale pari a 3 Euro al
 * 		giorno, le commedie Euro 2.50 al giorno e i film drammatici Euro 2 al giorno. Si 
 * 		verifichino le classi in un metodo main.
 * 
 */

public class Dramma extends Film {
	
	public Dramma() {
		super(0, "");
	}
	
	public Dramma(int codice, String titolo) {
		super(codice, titolo);
	}
	
	public double calcolaPenaleRitardo(int giorni) {
		return 2 * giorni;
	}
}
