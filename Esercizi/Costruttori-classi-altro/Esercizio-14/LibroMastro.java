/*
 * 	14-	Creare una classe LibroMaestro per registrare le vendite di un negozio. Essa
 * 		deve avere i seguenti attributi:
 * 
 * 		- vendite: Un array di valori double che corrisponde agli importi di tutte le
 * 				   vendite;
 * 		- venditeEffetuate: Il numero di vendite effettuate;
 * 		- massimoVendite: Il massimo numero di vendite che può essere registrato
 * 
 * 		e i seguenti metodi:
 * 
 * 		- LibroMastro(massimo) un costruttore che inizializza a massimo il massimo
 * 		  numero di vendite;
 * 		- aggiungiVendita(d) aggiunge una vendita il  cui valore è d.
 * 		- getNumeroDiVendite restituisce il numero di vendite effetuate;
 * 		- getTotaleVendite restituisce il valore totale delle vendite. 
 * 
 */

public class LibroMastro {

	private double[] vendite;
	private int venditeEffetuate;
	private int massimoVendite;
	
	public LibroMastro(int massimo) {
		this.massimoVendite = massimo;
		this.venditeEffetuate = 0;
		vendite = new double[massimoVendite];
	}
	
	public void aggiungiVendita(double d) {
		vendite[venditeEffetuate] = d;
		venditeEffetuate++;
	}
	
	public int getNumeroVendite() {
		return venditeEffetuate;
	}
	
	public double getTotaleVendite() {
		double risultato = 0;
		for(int i = 0; i < vendite.length; i++) {
			risultato = risultato + vendite[i];
		}
		return risultato;
	}
	
	public void visualizzaArray() {
		for(int i = 0; i < vendite.length; i++) {
			System.out.print(vendite[i] + ", ");
		}
	}
}
