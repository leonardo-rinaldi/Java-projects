/* 
 * 	10- Si crei una nuova classe Cane che sia derivata dalla classe Animale. La nuova classe
 * 		avrà gli attributi aggiuntivi razza (tipo String) e comandoDiRichiamo (tipo boolean),
 * 		il quale sarà vero se l'animale ha il suo comando di richiamo e falso altrimenti. Si
 * 		dotino le classi di opportuni costruttori e di tutti i metodi get. Si scriva un
 * 		programma driver per verificare tutti i metodi, poi si scriva un programma driver
 * 		per verificare tutti i metodi, poi si scriva un programma che legga le informazioni
 * 		per cinque animali di tipo Cane e visualizzi il nome e la razza di tutti gli animali
 * 		che siano oltre i due anni di età e non abbiano assegnati i loro comandi di richiamo.
 * 
 */

public class Cane extends Animale {
	
	private String razza;
	private boolean comandoDiRichiamo;
	
	public Cane() {
		super();
		razza = "";
		comandoDiRichiamo = false;
	}
	
	public Cane(String razza, boolean comando) {
		super();
		this.razza = razza;
		comandoDiRichiamo = comando;
	}
	
	public String getRazza() {
		return razza;
	}
	
	public boolean getComandoDiRichiamo() {
		return comandoDiRichiamo;
	}
	
	public void setRazza(String razza) {
		this.razza = razza;
	}
	
	public void setComandoDiRichiamo(boolean comando) {
		comandoDiRichiamo = comando;
	}
	
}
