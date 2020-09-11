/*
 *	Una classe per disegnare triangoli sullo schermo utilizzando i caratteri 
 *	della tastiera. Un triangolo punta verso l'alto. La sua dimensione è determinata
 *	dalla lunghezza della sua base, che deve essere un intero dispari. La classe
 *	eredita getScostamento, setScostamento e disegnaDa dalla classe FormaGenerica. 
 * 
 */

public class Triangolo extends FormaGeometrica {
	private int base;
	
	public Triangolo() {
		super();
		base = 0;
	}
	
	public Triangolo(int scostamentoIniziale, int baseIniziale) {
		super(scostamentoIniziale);
		base = baseIniziale;
	}
	
	/*
	 * Precondizione: nuovaBase è un intero dispari.
	 */
	
	public void set(int nuovaBase) {
		base = nuovaBase;
	}
	
	public void disegnaQui() {
		disegnaPunta();
		disegnaBase();
	}
	
	private void disegnaBase() {
		saltaSpazi(getScostamento());
		for(int conteggio = 0; conteggio < base; conteggio++) {
			System.out.print('*');
		} 
		System.out.println();
	}
	
	private void disegnaPunta() {
		//inizioDellaLinea == numero di spazi prima
		//del primo '*' sulla linea. Inizialemnte è
		//impostato al numero di spazi prima del
		//'*' più alto.
		int inizioDellaLinea = getScostamento() + base / 2;
		saltaSpazi(inizioDellaLinea);
		System.out.println('*');	//punta '*'
		int conteggioLinee = base / 2 - 1;	//altezza sopra la base
		//larghezzaInterna == numero di spazi
		//tra due '*' su una linea
		int larghezzaInterna = 1;
		for(int conteggio = 0; conteggio < conteggioLinee; conteggio++) {
			//Scendendo di una linea, il primo '*'
			//è uno spazio in più verso sinistra.
			inizioDellaLinea--;
			saltaSpazi(inizioDellaLinea);
			System.out.print('*');
			saltaSpazi(larghezzaInterna);
			System.out.println('*');
			//Scendendo di una linea, l'interno
			//è più piccolo di due spazi.
			larghezzaInterna = larghezzaInterna + 2;
		}
	}
	
}
