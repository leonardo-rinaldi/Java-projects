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

public class TriangoloRettangolo extends FormaBase {

	private int cateto;
	
	public TriangoloRettangolo() {
		super(0);
		cateto = 0;
	}
	
	public TriangoloRettangolo(int scostamento, int larghezza) {
		super(scostamento);
		this.cateto = larghezza;
	}
	
	public void setLarghezza(int larghezza) {
		this.cateto = larghezza;
	}
	
	public double calcolaArea() {
		return (cateto * cateto) / 2;
	}
	
	public double calcolaPerimetro() {
		double catetoUno = Math.pow(cateto, 2);
		double catetoDue = Math.pow(cateto, 2);
		double ipotenusa = Math.sqrt(catetoUno + catetoDue);
		return cateto + cateto + ipotenusa;
	}
	
	public void disegnaQui() {
		parteSuperiore();
		parteInferiore();
	}
	
	private void parteSuperiore() {
		int spazioInterno = 0;
		
		saltaSpazi(getScostamento());
		System.out.print("*");
		System.out.println();
		for(int i = 0; i < cateto - 2; i++) {
			saltaSpazi(getScostamento());
			System.out.print("*");
			saltaSpazi(spazioInterno);
			System.out.print("*");
			System.out.println();
			spazioInterno++;
		}
	}
	
	private void parteInferiore() {
		saltaSpazi(getScostamento());
		for(int i = 0; i < cateto; i++) {
			System.out.print("*");
		}
	}
}