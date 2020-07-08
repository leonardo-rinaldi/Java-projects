import java.util.Scanner;

/*
 * 
 * 	13- Si scriva un programma che calcoli il punteggio finale di una partita a baseball. 
 * 		Si usi un ciclo per leggere il numero di punti effetuati da ciascuna delle
 * 		due squadre durante ciascuno dei 9 tempi. Si mostri il punteggio finale.
 * 
 */

public class PuntiPartita {

	public static void main(String[] args) {
		
		int punteggioSquadraUno;
		int punteggioSquadraDue;
		int punteggioTotaleSquadraUno = 0;
		int punteggioTotaleSquadraDue = 0;
		
		Scanner tastiera = new Scanner(System.in);
		
		for(int i = 0; i <= 9; i++) {
			
			System.out.println("Inserisci il punteggio della prima squadra al tempo " + i );
			punteggioSquadraUno = tastiera.nextInt();
			
			System.out.println("Inserisci il punteggio della seconda squadra al tempo " + i);
			punteggioSquadraDue = tastiera.nextInt();
			
			punteggioTotaleSquadraUno = punteggioTotaleSquadraUno + punteggioSquadraUno;
			punteggioTotaleSquadraDue = punteggioTotaleSquadraDue + punteggioSquadraDue;
		}
		
		System.out.println("Il punteggio totale della prima squadra è: " + punteggioTotaleSquadraUno);
		System.out.println("Il punteggio totale dellla seconda squadra è: "+ punteggioTotaleSquadraDue);
	}

}
