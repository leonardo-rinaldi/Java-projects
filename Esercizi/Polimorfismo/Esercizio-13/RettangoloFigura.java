/*
 *	13- Si creino le classi TriangoloRettangolo e Rettangolo, ognuna delle quali sia
 *		derivata dalla classe astratta FormaBase. Si derivi poi una classe Quadrato
 *		dalla classe Rettangolo. Ognuna di queste tre classi derivate avrà due metodi
 *		aggiuntivi per calcolare l'area e il perimetro, oltre ai metodi ereditati. Non
 *		si dimetichi di ridefinire il metodo disegnaQui. Si dia alle classi un ragionevole
 *		insieme di costruttori e di metodi get. La classe Quadrato dovrebbe includere solo
 *		una dimensione (il lato) e dovrebbe automaticamente impostare l'altezza e larghezza
 *		alla lunghezza del lato. Si possono usare le dimensioni in termini di larghezza del
 *		carattere e di interlinea anche se essi sono senza dubbio diversi, così un quadrato
 *		non sembrerà un quadrato (proprio come un oggetto di Rettangolo, non soddisferà le
 *		aspettative). Si scriva un programma driver che verifichi tutti i metodi.
 * 
 */

public class RettangoloFigura extends FormaBase {

	private int larghezza;
	private int altezza;
	
	public RettangoloFigura() {
		super(0);
		larghezza = 0;
		altezza = 0;
	}
	
	public RettangoloFigura(int scostamento, int larghezza, int altezza) {
		super(scostamento);
		this.larghezza = larghezza;
		this.altezza = altezza;
	}
	
	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}
	
	public int getLarghezza() {
		return larghezza;
	}
	
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	public int getAltezza() {
		return altezza;
	}
	
	public double calcolaArea() {
		return larghezza * altezza;
	}
	
	public double calcolaPerimetro() {
		return 2 * (larghezza + altezza);
	}
	
	public void disegnaQui() {
		linea();
		parteCentrale();
		linea();
	}
	
	/*
	 * Metodo per disegnare la linea superiore e inferiore 
	 * del rettangolo
	 */
	
	private void linea() {
		for(int i = 0; i < larghezza; i++) {
			System.out.print("*");
		}
	}
	
	private void parteCentrale() {
		System.out.println();
		for(int i = 0; i < altezza - 2; i++) {
			System.out.print("*");
			saltaSpazi(larghezza - 2);
			System.out.print("*");
			System.out.println();
		}
	}
}