import java.util.Scanner;

/*
 * 	CAPITOLO 8
 * 
 * 	9-	Si consideri la classe Punteggio che rappresenta un punteggio numerico per 
 * 		la valutazione di qualcosa, come, per esempio, un film. I suoi attributi
 * 		sono:
 * 
 * 		- descrizione dell'oggetto valutato;
 * 		- punteggio massimo possibile;
 * 		- punteggio.
 * 
 * 		La classe avrà i metodi per:
 * 
 * 		- ottenere un punteggio da un utente;
 * 		- restituire il massimo punteggio possibile;
 * 		- restituire il punteggio;
 * 		- restituire una stringa che mostra il punteggio in un formato utile per
 * 		  essere stampato.
 * 
 */

public class Punteggio {

	private String descrizioneOggetto;
	private int punteggioMassimo;
	private int punteggio;
	
	public void punteggioOttenuto() {
		Scanner tastiera = new Scanner(System.in);
		
		punteggioMassimo = 10;
		System.out.println("Inserisci una descrizione dell'oggetto");
		descrizioneOggetto = tastiera.nextLine();
		System.out.println("Inserisci un punteggio da 0 a " + punteggioMassimo);
		int punteggio = tastiera.nextInt();
		controlloPunteggio(punteggio);
		
	}
	
	/*
	 * Precondizione: punteggio >= 0 && punteggio <= punteggioMassimo
	 * Resituisce una messaggio di conferma dell'inserimento oppure
	 * di errore.
	 */
	
	private void controlloPunteggio(int punteggio) {
		if(punteggio >= 0 && punteggio <= punteggioMassimo) {
			System.out.println("PunteggioAccettato");
			this.punteggio = punteggio;
		} else {
			System.out.println("Punteggio errato!");
		}
	}
	
	public int getPunteggioMassimo() {
		return punteggioMassimo;
	}
	
	public int getPunteggio() {
		return punteggio;
	}
	
	/*
	 * Precondizione: punteggio >= 0 %% punteggio <= punteggioMassimo
	 * Visualizza una stringa che mostra il punteggio
	 */
	
	public void visualizzaPunteggioStringa() {
		System.out.println("Il punteggio che hai inserito è: " + punteggio);
	}
}
