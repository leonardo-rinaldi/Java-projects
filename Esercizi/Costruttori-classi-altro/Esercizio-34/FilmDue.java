package oggetti;

/* 
 * 	9-	Si consideri una classe Film che contenga informazioni relative a un film. La classe
 * 		ha i seguenti attributi.
 * 
 * 	    - il titolo del film;
 * 	    - la classificazione MPAA (Motion Picture Association of America) (per esempio G, PG,
 * 		  PG-13,R);
 * 		- il numero di persone che hanno assegnato al film la valutazione 1 (Terribile);
 * 		- il numero di persone che hanno assegnato al film la valutazione 2 (Brutto);
 * 		- il numero di persone che hanno assegnato al film la valutazione 3 (Normale);
 * 		- il numero di persone che hanno assegnato al film la valutazione 4 (Bello);
 * 		- il numero di persone che hanno assegnato al film la valutazione 5 (Grandioso);
 * 
 * 		Si implementi la classe con i metodi set e get per il titolo del film e la sua 
 * 		classificazione MPAA. Si scriva un metodo aggiungiValutazione che richiede in
 * 		input un parametro di tipo intero. Il metodo deve verificare che il paramanetro
 * 		sia un numero tra 1 e 5 e, in tal caso incrementare di un'unità il numero di 
 * 		persone che hanno espresso la valutazione corrispondente. Per esempio, se il valore
 * 		del parametro è 3, il numero di persone che hanno assegnato al film la valutazione
 * 		3 deve essere incrementato di uno. Si scriva poi un altro metodo, getMedia, che
 * 		restituisca la media delle valutazioni.
 * 		Si verifichi il funzionamento della classe scrivendo un metodo main che crei almeno
 * 		due oggetti di tipo Film, aggiunga a ognuno dei due almeno cinque valutazioni e stampi
 * 		il titolo, la classificazione MPAA e la media delle valutazioni per ognuno dei due film.
 * 
 * 		Si includano i costruttori.
 * 	  
 */

public class FilmDue {

	private String titoloFilm;
	private String MPAA;
	private int personeVoto1;
	private int personeVoto2;
	private int personeVoto3;
	private int personeVoto4;
	private int personeVoto5;
	
	public FilmDue() {
		titoloFilm = "";
		MPAA = "";
		personeVoto1 = 0;
		personeVoto2 = 0;
		personeVoto3 = 0;
		personeVoto4 = 0;
		personeVoto5 = 0;
	}
	
	public FilmDue(String titolo, String MPAA, int voto1, int voto2, int voto3, int voto4, int voto5) {
		titoloFilm = titolo;
		this.MPAA = MPAA;
		personeVoto1 = voto1;
		personeVoto2 = voto2;
		personeVoto3 = voto3;
		personeVoto4 = voto4;
		personeVoto5 = voto5;
	}
	
	
	/*
	 * Precondizione: valutazione deve essere un intero
	 */
	
	public void aggiungiValutazione(int valutazione) {
		if(valutazione >= 1 && valutazione <= 5) {
			switch(valutazione) {
			case 1:
				personeVoto1++;
				break;
			case 2:
				personeVoto2++;
				break;
			case 3:
				personeVoto3++;
				break;
			case 4:
				personeVoto4++;
				break;
			case 5:
				personeVoto5++;
				break;
			}
		}
	}
	
	public String setTitolo( String titolo) {
		return titoloFilm = titolo;
	}
	
	public String setMPAA(String classificazione) {
		return MPAA = classificazione;
	}
	
	public double getMedia() {
		double voto1 = 1 * personeVoto1;
		double voto2 = 2 * personeVoto2;
		double voto3 = 3 * personeVoto3;
		double voto4 = 4 * personeVoto4;
		double voto5 = 5 * personeVoto5;
		return (voto1 + voto2 + voto3 + voto4 + voto5) / 5;
	}
	
	public String getTitoloFilm() {
		return titoloFilm;
	}
	
	public String getMPAA() {
		return MPAA;
	}
}
