/*
 *	Una classe per disegnare rettangoli sullo schermo utilizzando i caratteri
 *	della tastiera. Ogni carattere è più alto che largo, così questi rettangoli
 *	sembreranno più alti rispetto alle aspettative. La classe eredita getScostamento, 
 *	setScostamento e disegnaDa dalla classe FormaGenerica. 
 * 
 */

public class Rettangolo extends FormaGeometrica {
	private int altezza;
	private int larghezza;
	
	public Rettangolo() {
		super();
		altezza = 0;
		larghezza = 0;
	}
	
	public Rettangolo(int scostamentoIniziale, int altezzaIniziale, int larghezzaIniziale) {
		super(scostamentoIniziale);
		altezza = altezzaIniziale;
		larghezza = larghezzaIniziale;
	}
	
	public void set(int nuovaAltezza, int nuovaLarghezza) {
		altezza = nuovaAltezza;
		larghezza = nuovaLarghezza;
	}
	
	public void disegnaQui() {
		disegnaLineaOrizzontale();
		disegnaLineeVerticali();
		disegnaLineaOrizzontale();
	}
	
	private void disegnaLineaOrizzontale() {
		saltaSpazi(getScostamento());
		for(int conteggio = 0; conteggio < larghezza; conteggio++) {
			System.out.print('-');
		} System.out.println();
	}
	
	private void disegnaLineeVerticali() {
		for(int conteggio = 0; conteggio < (altezza - 2); conteggio++) {
			disegnaUnaLineaDiLineeVerticali();
		}
	}
	
	private void disegnaUnaLineaDiLineeVerticali() {
		saltaSpazi(getScostamento());
		System.out.print('|');
		saltaSpazi(larghezza - 2);
		System.out.println('|');
	}
}
