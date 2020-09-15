/*
 *	5- Si derivi una classe CompraNArticoliPrendiUnoGratis da PoliticaSconto,
 *	   come descritta nell'Esercizio 3. La classe dovrebbe avere un costruttore
 *	   che ha un singolo parametro n. In più, la classe dovrebbe ridefinire il
 *	   metodo calcolaSconto cosi che ogni n-esimo articolo sia gratis. Per esempio,
 *	   la seguente tabella fornisce lo sconto per l'acquisto di varie quantità di un
 *	   articolo che costa 10 Euro, quando n è 3:
 *
 *		Quantità | 1 | 2 | 3  | 4  | 5  | 6  | 7  |
 *		-------------------------------------------
 *		Sconto	 | 0 | 0 | 10 | 10 | 10 | 20 | 20 |
 * 
 */

public class CompraNArticoliPrendiUnoGratis extends PoliticaSconto {
	
	private int n;
	private int sconto;
	
	public CompraNArticoliPrendiUnoGratis(int n) {
		this.n = n;
		sconto = 0;
	}
	
	public double calcolaSconto() {
		switch(n) {
		case 1:
			sconto = 0;
			break;
		case 2:
			sconto = 0;
			break;
		case 3:
			sconto = 10;
			break;
		case 4:
			sconto = 10;
			break;
		case 5:
			sconto = 10;
			break;
		case 6:
			sconto = 20;
			break;
		case 7:
			sconto = 20;
			break;
		}
		return sconto;
	}
}
