import java.util.Arrays;
import java.util.Scanner;

/* 
 * 	12- Definire una classe GiocoDelTris. Un oggetto di tipo GiocoDelTris è
 * 		una singola partita del gioco tris. Memorizzare la griglia di gioco
 * 		come un array bidimensionale di tipo base char formato da tre righe
 * 		e tre colonne. Includere un metodo per aggiungere una mossa, per
 * 		visualizzare la griglia di gioco, per indicare che turno è ("X" o
 * 		"O"), per indicare se c'è un vincitore, per dire chi è il vincitore
 * 		e per ricominciare con una nuova partita. Scrivere un metodo main per
 * 		la classe che consenta a due giocatori di inserire le loro mosse a
 * 		turno dalla stessa tastiera.
 * 
 */

public class GiocoDelTris {
	
	private static final int RIGHE = 3;
	private static final int COLONNE = 3;
	private char griglia[][];
	
	public GiocoDelTris() {
		griglia = new char[RIGHE][COLONNE];
	}
	
	private void aggiungiMossaX(int riga, int colonna) {
		griglia[riga][colonna] = 'X';
	}
	
	private void aggiungiMossaO(int riga, int colonna) {
		griglia[riga][colonna] = 'O';
	}
	
	private boolean vincitore() {
		boolean risultato = false;
		
		trisRighe();
		trisColonne();
		trisVerticale();
		
		if(trisRighe() || trisColonne() || trisVerticale()) {
			risultato = true;
		}
		return risultato;
	}
	
	public void turno() {
		Scanner tastiera = new Scanner(System.in);
		boolean variabile = false;
		
		do {
			System.out.println("E' il turno di X");
			System.out.println("Inserire la riga:");
			int riga = tastiera.nextInt();
			System.out.println("Inserisci la colonna:");
			int colonna = tastiera.nextInt();
			aggiungiMossaX(riga, colonna);
			vincitore();
			visualizza();
			
			if(vincitore() == true) {
				variabile = true;
				break;
			}
			
			System.out.println("E' il turno di O");
			System.out.println("Inserire la riga:");
			riga = tastiera.nextInt();
			System.out.println("Inserisci la colonna:");
			colonna = tastiera.nextInt();
			aggiungiMossaO(riga, colonna);
			vincitore();
			visualizza();
			
			if(vincitore() == true) {
				variabile = true;
				break;
			}
			
		} while(variabile == false);
		
	}
	
	/*
	 * Presenza tris su riga
	 */
	
	private boolean trisRighe() {
		boolean risultato = false;
		int X = 0;
		int O = 0;
		
		for(int i = 0; i < RIGHE; i++) {
			for(int k = 0; k < COLONNE; k++) {
				
				if(griglia[i][k] == 'X') {
					X++;
					if(X == 3) {
						System.out.println("Ha vinto X");
						risultato = true;
						X = 0;
						O = 0;
					}
				} else
					if(griglia[i][k] == 'O') {
						O++;
						if(O == 3) {
							System.out.println("Ha vinto O");
							risultato = true;
							X = 0;
							O = 0;
						}
					}
			}
			X = 0;
			O = 0;
		}
		return risultato;
	}
	
	/*
	 * Presenza tris su colonne
	 */
	
	private boolean trisColonne() {
		boolean risultato = false;
		int X = 0;
		int O = 0;
		
		for(int i = 0; i < COLONNE; i++) {
			for(int k = 0; k < RIGHE; k++) {
				if(griglia[k][i] == 'X') {
					X++;
					if(X == 3) {
						System.out.println("Ha vinto X");
						risultato = true;
						X = 0;
						O = 0;
					}	
				} else 
					if(griglia[k][i] == 'O') {
						O++;
						if(O == 3) {
							System.out.println("Ha vinto O");
							risultato = true;
							X = 0;
							O = 0;
						}
					}
			}
			X = 0;
			O = 0;
		}
		return risultato;
	}
	
	/*
	 * Presenza tris verticale
	 */
	
	private boolean trisVerticale() {
		boolean risultato = false;
		
		if(griglia[0][0] == 'X' && griglia[1][1] == 'X' && griglia[2][2] == 'X') {
			System.out.println("Ha vinto X");
			risultato = true;
		} else
			if(griglia[0][0] == 'O' && griglia[1][1] == 'O' && griglia[2][2] == 'O') {
				System.out.println("Ha vinto O");
				risultato = true;
			} 
				
		if(griglia[0][2] == 'X' && griglia[1][1] == 'X' && griglia[2][0] == 'X') {
				System.out.println("Ha vinto X");
				risultato = true;
			} else 
				if(griglia[0][2] == 'O' && griglia[1][1] == 'O' && griglia[2][0] == 'O') {
					System.out.println("Ha vinto O");
					risultato = true;
				}
		return risultato;
	}
	
	public void riempi() {
		for(int i = 0; i < 3; i++) {
			for(int k = 0; k < 3; k++) {
				griglia[i][k] = '*';
			}
		}
	}
	
	public void visualizza() {
		for(int i = 0; i < 3; i++) {
			System.out.print("|");
			for(int k = 0; k < 3; k++) {
				System.out.print(griglia[i][k] + "|");
			}
			System.out.println();
		}
	}
}
