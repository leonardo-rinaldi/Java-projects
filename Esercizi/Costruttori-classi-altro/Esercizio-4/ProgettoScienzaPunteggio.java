import java.util.Scanner;

/*
 * 	10- Si consideri la classe ProgettoScienzaPunteggio per giudicare un progetto
 * 		scientifico. Questa classe userà la classe Punteggio dell'esercizio 9. Gli
 * 		attributi della nuova classe sono:
 * 		
 * 		- nome del progetto;
 * 		- stringa identificativa univoca del progetto;
 * 		- nome della persona;
 * 		- un punteggio per l'abilità creativa (max 30);
 * 		- un punteggio per il valore scientifico del progetto (max 30);
 * 		- un punteggio per la completezza (max 15);
 * 		- un punteggio per l'abilità tecnica (max 15);
 * 		- un punteggio per la chiarezza (max 10).
 * 
 * 		La classe avrà i metodi per:
 * 
 * 		- ricevere il numero di giudici;
 * 		- ricevere tutti i punteggi per un particolare progetto;
 * 		- restituire il totale dei punteggi per un particolare progetto;
 * 		- restituire il massimo punteggio possibile;
 * 		- restituire una stringa che mostra il punteggio di un progetto;
 * 		  in un formato utile per la visualizzazione.
 * 
 */

public class ProgettoScienzaPunteggio {

	private String descrizioneOggetto;
	private int punteggioMassimo;
	private int punteggio;
	private String nomeProgetto;
	private String nomePersona;
	private int punteggioAbilitàCreativa;
	private int punteggioValoreScientifico;
	private int punteggioCompletezza;
	private int punteggioAbilitàTecnica;
	private int punteggioChiarezza;
	
	public ProgettocienzaPunteggio(String descrizioneOggetto, int punteggioMassimo, int punteggio) {
		this.descrizioneOggetto = descrizioneOggetto;
		this.punteggioMassimo = punteggioMassimo;
		this.punteggio = punteggio;
	}
	
	public void progettoScientifico() {
		Scanner tastiera = new Scanner(System.in);
		punteggioMassimo = 30;
		System.out.println("Inserisci il tuo nome");
		nomePersona = tastiera.nextLine();
		System.out.println("Inserisci il nome del progetto");
		nomeProgetto = tastiera.nextLine();
		System.out.println("Inserisci una descrizione al progetto");
		descrizioneOggetto = tastiera.nextLine();
		numeroGiudici();
	}
	
	/*
	 * Inizializza il numero di giudici
	 */
	
	public void numeroGiudici() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il numero di giudici");
		int giudici = tastiera.nextInt();
		punteggi(giudici);
	}
	
	/*
	 * Precondizione: i valori inseriti siano minoi del valore massimo
	 * Inserisce i vari punteggi nella variabili di istanza
	 */
	
	private void punteggi(int giudici) {
		Scanner tastiera = new Scanner(System.in);
		int i = 0;
		int numeroInserito;
		
		while(i < giudici) {
			System.out.println("Giudice numero " + (i + 1));
			System.out.println("Punteggio per l'abilità creativa (max 30 punti)");
			numeroInserito = tastiera.nextInt();
			controlloPunteggio30(numeroInserito);
			punteggioAbilitàCreativa = punteggioAbilitàCreativa + numeroInserito;
			
			System.out.println("Punteggio per il valore scientifico del progetto (max 30 punti)");
			numeroInserito = tastiera.nextInt();
			controlloPunteggio30(numeroInserito);
			punteggioValoreScientifico = punteggioValoreScientifico + numeroInserito;
			
			System.out.println("Punteggio per la completezza (max 15 punti)");
			numeroInserito = tastiera.nextInt();
			controlloPunteggio15(numeroInserito);
			punteggioCompletezza = punteggioCompletezza + numeroInserito;
			
			System.out.println("Punteggio per l'abilità tecnica (max 15 punti)");
			numeroInserito = tastiera.nextInt();
			controlloPunteggio15(numeroInserito);
			punteggioAbilitàTecnica = punteggioAbilitàTecnica + numeroInserito;
			
			System.out.println("Punteggio per la chiarezza (max 10 punti)");
			numeroInserito = tastiera.nextInt();
			controlloPunteggio10(numeroInserito);
			punteggioChiarezza = punteggioChiarezza + numeroInserito;
			i++;
		}
		punteggio = punteggioAbilitàCreativa + punteggioValoreScientifico + punteggioCompletezza + punteggioAbilitàTecnica + punteggioChiarezza;
	}
	
	/*
	 * Controlla che il punteggio sia minore del punteggio massimo 30
	 */
	
	private void controlloPunteggio30(int punteggio) {
		if(punteggio >= 0 && punteggio <= punteggioMassimo) {
			System.out.println("PunteggioAccettato");
			this.punteggio = punteggio;
		} else {
			System.out.println("Punteggio errato!");
		}
	}
	
	/*
	 * Controlla che il punteggio inserito sia minore del punteggio massimo 15
	 */

	private void controlloPunteggio15(int punteggio) {
		if(punteggio >= 0 && punteggio <= punteggioMassimo / 2) {
			System.out.println("PunteggioAccettato");
			this.punteggio = punteggio;
		} else {
			System.out.println("Punteggio errato!");
		}
	}
	
	/*
	 * Controlla che il punteggio inserito sia minore del punteggio massimo 10
	 */
	
	private void controlloPunteggio10(int punteggio) {
		if(punteggio >= 0 && punteggio <= punteggioMassimo / 3) {
			System.out.println("PunteggioAccettato");
			this.punteggio = punteggio;
		} else {
			System.out.println("Punteggio errato!");
		}
	}
	
	/*
	 * Precondizione: punteggio >= 0 && punteggio <= punteggioMassimo
	 * Resituisce una messaggio di conferma dell'inserimento oppure
	 * di errore.
	 */
	
	public int getPunteggioMassimo() {
		return punteggioMassimo;
	}
	
	public int getPunteggio() {
		return punteggio;
	}
	
	public void setPunteggi() {
		System.out.println("Punteggio abilità creativa: " + punteggioAbilitàCreativa);
		System.out.println("Punteggio valore scientifico: " + punteggioValoreScientifico);
		System.out.println("Punteggio completezza: " + punteggioCompletezza);
		System.out.println("Punteggio abilità tecnica: " + punteggioAbilitàTecnica);
		System.out.println("Punteggio chiarezza: " + punteggioChiarezza);
	}
	
	/*
	 * Visualizza una stringa che mostra il punteggio
	 */
	
	public void visualizzaPunteggioStringa() {
		System.out.println("Il punteggio che hai inserito è: " + punteggio);
	}
}
