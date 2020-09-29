import java.util.ArrayList;

/*
 * 	4-	Creare una classe LibroMaestro per registrare le vendite di un negozio. Essa
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
 * 		Si ripetano gli Esercizi 14 e 15 del Capitolo 9, ma usando un'istanza di ArrayList
 * 		invece di un array. Non ci sarà più bisogno di conoscere il numero massimo di vendite,
 * 		così i metodi dovranno cambiare per far fronte a ciò.
 * 		
 * 
 */

public class LibroArrayList {
	

	private ArrayList<Double> vendite;
	private int venditeEffetuate;
	
	public LibroArrayList(int massimo) {
		this.venditeEffetuate = 0;
		vendite = new ArrayList<Double>();;
	}
	
	public void aggiungiVendita(double d) {
		vendite.add(d);
		venditeEffetuate++;
	}
	
	public int getNumeroVendite() {
		return venditeEffetuate;
	}
	
	public double getTotaleVendite() {
		double risultato = 0;
		for(int i = 0; i < vendite.size(); i++) {
			risultato = risultato + vendite.get(i);
		}
		return risultato;
	}
	
	public void visualizzaArray() {
		for(int i = 0; i < vendite.size(); i++) {
			System.out.print(vendite.get(i) + ", ");
		}
	}
}
