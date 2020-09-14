/*
 *	3- Si crei una classe astratta PoliticaSconto. Essa dovrebbe avere un solo metodo
 *	   astratto calcolaSconto che restituirà lo sconto per l'acquisto di un certo numero
 *	   di articoli tutti dello stesso tipo. Il metodo ha due parametri, numeroArticoli e
 *	   prezzoArticolo.
 *
 */

public abstract class PoliticaSconto {

	private int numeroArticoli;
	private double prezzoArticolo;
	
	public abstract double calcolaSconto();
	
	public int getNumeroArticoli() {
		return numeroArticoli;
	}
	
	public double getPrezzoArticolo() {
		return prezzoArticolo;
	}
}
