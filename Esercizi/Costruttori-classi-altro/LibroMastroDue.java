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
 * 
 * 	15- Definire i seguenti metodi per la classe LibroMastro, come descritto nel precedente
 * 		esercizio:
 * 
 * 		- getMediaVendite() restituisce il valore medio di tutte le vendite;
 * 		- getVenditaAlDiSopra(v) restituisce il numero di vendite che hanno un valore superiore
 * 		  a v.
 * 
 * 
 */

public class LibroMastroDue {

	private double[] vendite;
	private int venditeEffetuate;
	private int massimoVendite;
	
	public LibroMastroDue(int massimo) {
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
		System.out.print("[ ");
		
		for(int i = 0; i < vendite.length; i++) {
			
			if(i == vendite.length -1) {
				System.out.print(vendite[i]);
			} else {
				System.out.print(vendite[i] + ", ");
			}
		}
		System.out.println(" ]");
	}
	
	public double getMediaVendite() {
		double somma = getTotaleVendite();
		return somma / massimoVendite;
	}
	
	public int getVenditeAlDiSopra(double v) {
		int contatore = 0;
		
		for(int i = 0; i < vendite.length; i++) {
			if(vendite[i] > v) {
				contatore++;
			} else {
				continue;
			}
		}
		return contatore;
	}
}
