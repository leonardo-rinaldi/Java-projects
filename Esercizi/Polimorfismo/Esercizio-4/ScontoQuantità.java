/*
 * 	4- Si derivi una classe astratta ScontoQuantità da PoliticaSconto, come descritta
 * 	   nell'esercizio 3. Essa dovrebbe avere un costruttore con due parametri, minimo
 * 	   e percentuale. Si dovrebbe ridefinire il metodo calcolaSconto in modo che se la
 * 	   la quanità di un articolo acquistato è maggiore del minimo, lo sconto è di
 * 	   percentuale sul totale.
 * 
 */

public class ScontoQuantità extends PoliticaSconto {
	
	private double minimo;
	private double percentuale;
	
	public ScontoQuantità(double minimo, double percentuale) {
		this.minimo = minimo;
		this.percentuale = percentuale;
	}
	
	public double calcolaSconto() {
		double sconto = 0;
		if(getNumeroArticoli() > minimo) {
			sconto = getNumeroArticoli() * getPrezzoArticolo() * percentuale;
		}
		return sconto;
	}
	
	public double totale() {
		double totale = getNumeroArticoli() * getPrezzoArticolo();
		return totale - calcolaSconto();
	}
}
