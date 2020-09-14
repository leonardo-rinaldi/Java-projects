/*
 *	CAPITOLO 11
 *
 *	1-	Si supponga di voler implementare un programma di disegno che crei varie forme
 *		utilizzando i caratteri della tastiera. Si implementi una classe base astratta
 *		FormaDisegnabile che definisce il centro (due valori interi) e il colore (una
 *		stringa) dell'oggetto. Si forniscano appropriati metodi set per gli attributi.
 *		Si dovrebbe definire, inoltre, un metodo set che sposti l'oggetto di una data 
 *		quantità.
 * 
 */

public abstract class FormaDisegnabile {

	private int posizioneAlto;
	private int posizioneLato;
	private String colore;
	
	public int getPosizioneAlto() {
		return posizioneAlto;
	}
	
	public int getPosizioneLato() {
		return posizioneLato;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setPosizioneAlto(int posizioneAlto) {
		this.posizioneAlto = posizioneAlto;
	}
	
	public void setPosizioneBasso(int posizioneLato) {
		this.posizioneLato = posizioneLato;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public void spostaOggetto(int nuovaPosizioneAlto, int nuovaPosizioneLato) {
		posizioneAlto = posizioneAlto + nuovaPosizioneAlto;
		posizioneLato = posizioneLato + nuovaPosizioneLato;
	}
	
	/*
	 * Metodo per posizionare la figura
	 */
	
	public abstract void disegna();
}
