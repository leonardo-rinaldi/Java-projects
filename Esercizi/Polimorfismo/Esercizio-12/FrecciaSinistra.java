/*
 * 	12- Si definiscano due classi derivate dalla classe FormaGeometrica.
 * 		Le due classi saranno chiamate FrecciaDestra e FrecciaSinistra.
 * 		Queste classi saranno come le classi Rettangolo e Triangolo, ma
 * 		disegneranno frecce che puntano, rispettivamente, a destra e a 
 * 		sinistra. Per esempio, la seguente freccia punta a destra:
 * 
 * 		      		   *
 * 		   			   **
 * 					   * *
 * 		****************  *
 * 					   * *
 *    				   **
 *    				   *
 *    
 *    La dimensione della freccia è determinata da due numeri, uno per la
 *    lunghezza della coda e uno per la larghezza della punta della freccia.
 *    La larghezza è la lunghezza della base verticale. La freccia mostrata
 *    ha una lunghezza di 16 e una larghezza di 7. La lunghezza della punta
 *    della freccia non può essere un numero pari; pertanto i costruttori e
 *    i metodi set dovrebbero verificare che questa sia sempre dispari. Si
 *    scriva un programma di prova che verifichi i metodi.
 */

public class FrecciaSinistra extends FormaGeometrica {

	private int larghezza;
	private int lunghezza;
	
	public FrecciaSinistra() {
		larghezza = 0;
		lunghezza = 0;
	}
	
	public FrecciaSinistra(int larghezza, int lunghezza) {
		this.lunghezza = lunghezza;
		controlloDispari(larghezza);
	}
	
	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}
	
	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	public int getLarghezza() {
		return larghezza;
	}
	
	public int getLunghezza() {
		return lunghezza;
	}
	
	public void disegnaQui() {
		int spazioInterno = 0;
		parteSuperiore(spazioInterno);
		spazioInterno = larghezza / 2 - 3;
		disegnaCoda();
		parteInferiore(spazioInterno);
	}
	
	private void disegnaCoda() {
		System.out.print("*");
		
		for(int i = 0; i < larghezza / 2 - 1; i++) {
			System.out.print(" ");
		}
		for(int i = 0; i < lunghezza; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	/*
	 * Metodo per disegnare la parte superiore della
	 * freccia
	 */
	
	private void parteSuperiore(int spazioInterno) {
		int spazio = larghezza / 2 - 1;
		
		saltaSpazi(spazio + 1);
		System.out.print("*");
		System.out.println();
		
		for(int i = 0; i < larghezza / 2 - 1; i++) {
			saltaSpazi(spazio--);
			System.out.print("*");
			for(int j = 0; j < spazioInterno; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
			spazioInterno++;
		}
	}
	
	/*
	 * Metodo per disegnare la parte inferiore della
	 * freccia
	 */
	
	private void parteInferiore(int spazioInterno) {
		int spazio = 1;
		
		for(int i = larghezza / 2 - 1; i > 0; i--) {
			saltaSpazi(spazio++);
			System.out.print("*");
			for(int j = spazioInterno; j >= 0; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
			spazioInterno--;
		}
		saltaSpazi(spazio++);
		System.out.print("*");
	}
	
	private void controlloDispari(int numero) {
		if(numero % 2 != 0) {
			this.larghezza = numero;
		} else {
			System.out.println("Errore! La larghezza non può essere pari.");
		}
	}
}
