/*
 *	CAPITOLO 11
 *
 * 	2-	Si crei una classe Quadrato derivata da FormaDisegnabile, come descritta nel
 * 		precedente esercizio. Un oggetto Quadrato ha una variabile di istanza che 
 * 		rappresenta la lunghezza del lato. La classe dovrebbe avere un metodo get
 * 		e un metodo set per la lunghezza. Dovrebbe anche avere i metodi per calcolare
 * 		l'area e il perimetro del quadrato. Sebbene i caratteri siano più alti che larghi,
 * 		non occorre preoccuparsi di questo dettaglio quando si disegna il quadrato.
 * 
 */

public class FormaQuadrato extends FormaDisegnabile {

	private int lunghezzaLato;
	
	public void setLunghezzaLato(int lunghezzaLato) {
		this.lunghezzaLato = lunghezzaLato;
	}
	
	public int getLunghezzaLato() {
		return lunghezzaLato;
	}
	
	public double calcolaArea() {
		return lunghezzaLato * 2;
	}
	
	public double calcolaPerimetro() {
		return lunghezzaLato * 4;
	}

	/*
	 * Metodo per disegnare la figura
	 */
	
	public void disegna() {
		getSpazioSuperiore();
		disegnaLineaOrrizontale();
		disegnaLineeVerticali();
		disegnaLineaOrrizontale();
	}
	
	private void disegnaLineaOrrizontale() {
		getSpazioLaterale();
		
		for(int i = 0; i < lunghezzaLato; i++) {
			System.out.print("-");
		}
	}
	
	private void disegnaLineeVerticali() {
		System.out.println();
		for(int i = 0; i < lunghezzaLato - 2; i++) {	//Sottraggo 2 per compensare le linee orizzontali superiori e inferiori
			for(int j = 0; j < getPosizioneLato(); j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			getSpazio();
			System.out.print("|");
			System.out.println();
		}
	}
	
	/*
	 * Restituisce lo spazio da saltare all'interno del quadrato
	 */
	
	private void getSpazio() {
		for(int j = 0; j < lunghezzaLato - 2; j++) {	
			System.out.print(" ");
		}
	}
}