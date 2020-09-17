/*
 *	Una classe per disegnare semplici forme sullo schermo utilizzando solo
 *	caratteri. Questa classe disegnerà un asterisco sullo schermo come prova.
 *	Non si intende creare una forma "reale", questa classe è stata concepita 
 *	come classe base per altre classi di forme.
 * 
 */

public class FormaGeometrica {
	private int scostamento;
	
	public FormaGeometrica() {
		scostamento = 0;
	}
	
	public FormaGeometrica(int scostamentoIniziale) {
		scostamento = scostamentoIniziale;
	}
	
	public void setScostamento(int nuovoScostamento) {
		scostamento = nuovoScostamento;
	}
	
	public int getScostamento() {
		return scostamento;
	}
	
	public void disegnaDa(int numeroLinee) {
		for(int conteggio = 0; conteggio < numeroLinee; conteggio++) {
			System.out.println();
			disegnaQui();
		}
	}
	
	public void disegnaQui() {
		for(int conteggio = 0; conteggio < scostamento; conteggio++) {
			System.out.print(' ');
		} 
		System.out.println('*');
	}
	
	//Scrive il numero indicato di spazi.
	
	protected static void saltaSpazi(int numero) {
		for(int conteggio = 0; conteggio < numero; conteggio++) {
			System.out.print(' ');
		}
	}
}
