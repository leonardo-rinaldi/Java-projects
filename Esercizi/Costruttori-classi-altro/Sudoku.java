/*
 *	14- Il sudoku è un gioco ampiamente diffuso basato sulla logica
 *		che utilizza un array di 9x9 caselle suddivise in 3x3 sotto array.
 * 		Il solutore deve riempire le caselle bianche inserendo numeri che
 * 		vanno da 1 a 9, in modo che la cifra inserita non si ripeta nè nella
 * 		riga, nè nella colonna e neanche nel sottogruppo cui appartiene la cifra.
 * 		All'inizio alcune celle hanno già un valore e non possono essere modificate.
 * 		
 * 		Si crei una classe che possiede i seguenti attributi:
 * 
 * 		- scacchiera: un array 9x9 di interi che rappresenta lo stato attuale del gioco
 * 					  e in cui gli zeri rappresentano le celle ancora non riempite;
 * 		- inizio: un array 9x9 di valori booleani che specifica quali elementi dell'array
 * 				  scacchiera possiedono un valore che non può essere cambiato;
 * 		e i seguenti moduli:
 * 
 * 		- Sudoku: un costruttore che crea un nuovo gioco in cui tutte le caselle sono vuote;
 * 
 * 		- toString: restituisce una stringa stampabile che rappresenta il gioco;
 * 
 * 		- aggiungiaIniziali(riga, colonna, valore): aggiunge nella posizione specificata da
 * 													riga e colonna il valore specificato da
 * 													valore. Tale valore può essere modificato;
 * 
 * 		- aggiungiMossa(riga, colonna, valore): aggiunge nella posizione specificata da riga e
 * 												colonna il valore specificato da valore. Tale
 * 												valore può essere modificato;
 * 
 * 		- verificaGioco(): restiutisce vero se i valori inseriti non violano le regole del gioco;
 * 
 * 		-getValoreIn(riga, colonna): restituisce il valore contenuto nella posizione specificata
 * 									 da riga e colonna;
 * 
 * 		-getValoriValidi(riga, colonna):  restituisce un array monodimensionale di nove valori booleani,
 * 										  ognuno dei quali corrisponde a una cifra e risulta vero se la 
 * 										  cifra può essere posta alla posizione specificata da riga e
 * 										  colonna senza violare le regole del gioco;
 * 
 * 		- pieno: restituisce vero se ogni cella possiede un valore;
 * 		
 * 		-reset: imposta a zero tutte le celle che non contengono valori immutabili.
 */

public class Sudoku {

	private static int RIGHE = 9;
	private static int COLONNE = 9;
	
	private int[][] scacchiera = new int[RIGHE][COLONNE];
	private boolean[][] inizio = new boolean[RIGHE][COLONNE];
	
	public Sudoku() {
		for(int i = 0; i < RIGHE; i++) {
			for(int j = 0; j < COLONNE; j++) {
				scacchiera[i][j] = 0;
			}
		}
		
		for(int i = 0; i < RIGHE; i++) {
			for(int j = 0; j < COLONNE; j++) {
				inizio[i][j] = false;
			}
		}
	}
	
	/*
	 * Resituisce una descrizione del gioco in formato stringa
	 */
	
	public String toString() {
		String descrizioneGioco = "Il sudoku è un gioco ampiamente diffuso basato sulla logica" +
								  "che utilizza un array di 9x9 caselle suddivise in 3x3 sotto array."+
								  "Il solutore deve riempire le caselle bianche inserendo numeri che"+
								  "vanno da 1 a 9, in modo che la cifra inserita non si ripeta nè nella"+
								  "riga, nè nella colonna e neanche nel sottogruppo cui appartiene la cifra."+
								  "All'inizio alcune celle hanno già un valore e non possono essere modificate.";
		return descrizioneGioco;
	}
	
	/*
	 * Inizializza la scacchera con dei valori di default immutabili
	 */
	
	public void inizializzaGioco() {
		
		//prima riga
		aggiungiIniziali(0, 0, 1);
		aggiungiIniziali(0, 1, 2);
		aggiungiIniziali(0, 2, 3);
		aggiungiIniziali(0, 3, 4);
		aggiungiIniziali(0, 4, 9);
		aggiungiIniziali(0, 5, 7);
		aggiungiIniziali(0, 6, 8);
		aggiungiIniziali(0, 7, 6);
		aggiungiIniziali(0, 8, 5);
		
		//seconda riga
		aggiungiIniziali(1, 0, 4);
		aggiungiIniziali(1, 1, 5);
		aggiungiIniziali(1, 2, 9);
		
		//terza riga
		aggiungiIniziali(2, 0, 6);
		aggiungiIniziali(2, 1, 7);
		aggiungiIniziali(2, 2, 8);
		
		//quarta riga
		aggiungiIniziali(3, 0, 3);
		aggiungiIniziali(3, 4, 1);
		
		//quinta riga
		aggiungiIniziali(4, 0, 2);
		aggiungiIniziali(4, 5, 5);
		
		//sesta riga
		aggiungiIniziali(5, 0, 9);
		
		//settima riga
		aggiungiIniziali(6, 0, 8);
		
		//ottava riga
		aggiungiIniziali(7, 0, 7);
		
		//nona riga
		aggiungiIniziali(8, 0, 5);
		aggiungiIniziali(8, 3, 9);
	}
	
	/*
	 * Permette di aggiungere manualmente dei valori di default immutabili
	 */
	
	public void aggiungiIniziali(int riga, int colonna, int valore) {
		scacchiera[riga][colonna] = valore;
		inizio[riga][colonna] = true; //indica un valore non modificabile 
	}
	
	public void aggiungiMossa(int riga, int colonna, int valore) {
		
		if(verificaGioco(riga, colonna, valore)) {
			scacchiera[riga][colonna] = valore;
		} else {
			System.out.println("Valore non valido!");
		}
	}
	
	/*
	 * Verifica che i valori inseriti da aggiungiMossa() non violino 
	 * le regole del gioco
	 */
	
	private boolean verificaGioco(int riga, int colonna, int valore) {
		boolean risultato;
		int r = riga;
		int c = colonna;
		int v = valore;
		
		if(controlloNumero(r, c, v) && controlloRiga(r, c, v) && controlloColonna(r,c,v) && controllo3x3(r,c,v)) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
	
	/*
	 * Controllo valore compreso tra 1 e 9
	 */
	
	private boolean controlloNumero(int riga, int colonna, int valore) {
		boolean risultato;
		
		if(valore >= 1 && valore <= 9) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
	
	/*
	 * Controllo riga
	 */
	
	private boolean controlloRiga(int riga, int colonna, int valore) {
		boolean risultato = false;
		
		for(int i = 0; i < COLONNE; i++) {
			if(scacchiera[riga][i] != valore) {
				risultato = true;
			} else {
				risultato = false;
				break;
			}
		}
		return risultato;
	}
	
	/*
	 * controllo colonna
	 */
	
	private boolean controlloColonna(int riga, int  colonna, int valore) {
		boolean risultato = false;
		
		for(int i = 0; i < RIGHE; i++) {
			if(scacchiera[i][colonna] != valore) {
				risultato = true;
			} else {
				risultato = false;
				break;
			}
		}
		return risultato;
	}
	
	/*
	 * controllo sotto array 3x3
	 */
	
	private boolean controllo3x3(int riga, int colonna, int valore) {
		boolean risultato = true;
		
		int r = riga - riga % 3;
		int c = colonna - colonna % 3;
		
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (scacchiera[i][j] == valore) {
					risultato = false;
				}
			}
		}
		return risultato;
	}
	
	/*
	 * Restituisce un array monodimensionale di valori booleani
	 * che rappresentano i valori da 1 a 9.
	 */
	
	public boolean[] getValoriValidi(int riga, int colonna) {
		boolean[] valoriValidi = new boolean[10];
		int valore = 1;
		
		for(int i = 1; i < valoriValidi.length; i++) {
			valoriValidi[i] = verificaGioco(riga, colonna, valore);
			valore++;
		}
		return valoriValidi;
	}
	
	/*
	 * Controlla se la scacchiera è piena e quindi se è finito il gioco
	 */
	
	public boolean pieno() {
		boolean risultato = false;
		
		for(int i = 0; i < RIGHE; i++) {
			for(int j = 0; j < COLONNE; j++) {
				if(scacchiera[i][j] != 0) {
					risultato = true;
				} else 
					if(scacchiera[i][j] == 0) {
						risultato = false;
						break;
					}
			}
			if(risultato == false) {
				break;
			}
		}
		return risultato;
	}
	
	/*
	 * Resetta la scacchiera e trasforma tutti i valori in 0
	 */
	
	public void reset() {
		for(int i = 0; i < RIGHE; i++) {
			for(int j = 0; j < COLONNE; j++) {
				if(inizio[i][j] == false) {	//tengo conto dei valori immutabili
					scacchiera[i][j] = 0;
				} else {
					continue;
				}
			}
		}
	}
	
	public int getValoreIn(int riga, int colonna) {
		return scacchiera[riga][colonna];
	}

	public void visualizzaScacchiera() {
		for(int i = 0; i < RIGHE; i++) {
			System.out.print("|");
			for(int j = 0; j < COLONNE; j++) {
				System.out.print(scacchiera[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	/*
	 * Visuallizza l'array booleano contenente le posizioni dei valori 
	 * immutabili
	 */
	
	public void visualizzaInizio() {
		for(int i = 0; i < RIGHE; i++) {
			System.out.println("|");
			for(int j = 0; j < COLONNE; j++) {
				System.out.print(inizio[i][j] + "|");
			}
			System.out.println();
		}
	}
}
