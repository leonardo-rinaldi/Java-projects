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

public class QuadratoFigura extends RettangoloFigura {
	
	public QuadratoFigura() {
	  setAltezza(0);
	  setLarghezza(0);
	}
	
	public QuadratoFigura(int lato) {
		setAltezza(lato);
		setLarghezza(lato);
	}
	
	public void disegnaQui() {
		rigaOrizzontali();
		righeVerticali();
		rigaOrizzontali();
	}
	
	public double calcolaArea() {
		return Math.pow(getAltezza(), 2);
	}
	
	public double calcolaPerimetro() {
		return 4 * getAltezza();
	}
	
	public void rigaOrizzontali() {
		for(int i = 0; i < getLarghezza(); i++) {
			System.out.print("*");
		}
	}
	
	public void righeVerticali() {
		for(int i = 0; i < getAltezza() - 2; i++) {
			System.out.println();
			System.out.print("*");
			saltaSpazi(getLarghezza() - 2);
			System.out.print("*");
		}
		System.out.println();
	}
}
