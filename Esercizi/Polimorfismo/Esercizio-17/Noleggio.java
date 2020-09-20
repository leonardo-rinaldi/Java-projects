/*
 *	17- Si estenda il progetto precedente realizzando una classe Noleggio. Questa classe
 *		dovrebbe memorizzare il Film che è stato noleggiato, un numero intero che rappresenta
 *		il documento d'identificazione del cliente che ha affitato il film e un numero intero
 *		che rappresenta il numero di giorni di ritardo del film. SI aggiunga un metodo che
 *		calcola le penali per il noleggio. Si crei un'altra classe in cui si definisce il 
 *		metodo main. Nel metodo main si crei un array di tipo Noleggio e lo si riempia con i
 *		dati per tutti i tipi di film. Si crei, quindi, un metodo calcolaPenaliRitardo che
 *		itera attraverso l'array e restituisce l'ammontare totale di penali che devono essere
 *		incassate.
 * 
 */

public class Noleggio extends Film {
	
	private int documentoIdentificazione;
	private int ritardoFilm;
	private double penale;
	
	public Noleggio() {
		super(0, "");
		documentoIdentificazione = 0;
		ritardoFilm = 0;
	}
	
	public Noleggio(int codice, String titolo, int documento, int ritardoFilm) {
		super(codice, titolo);
		documentoIdentificazione = documento;
		this.ritardoFilm = ritardoFilm;
	}
	
	public int getDocumentoIdentificazione() {
		return documentoIdentificazione;
	}
	
	public int getRitradoFilm() {
		return ritardoFilm;
	}
	
	public void setDocumentoIdentificazione(int documento) {
		documentoIdentificazione = documento;
	}
	
	public void setRitardoFilm(int ritardo) {
		ritardoFilm = ritardo;
	}
	
	public double calcolaPenali() {
		return 2 * ritardoFilm;
	}
}
