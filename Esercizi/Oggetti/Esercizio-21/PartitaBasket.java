import java.util.Scanner;

/*
 * 	7- Si consideri una classe partitaBasket che rappresenta lo stato di una
 * 	   partita di basket. I suoi attributi sono:
 * 
 * 	   - nome della prima squadra;
 * 	   - nome della seconda squadra;
 * 	   - punteggio della prima squadra;
 * 	   - punteggio della seconda squadra;
 * 	   - stato del gioco (finito o ancora in corso);
 * 
 * 	   Deve avere metodi per le seguenti attività:
 * 
 * 	   - registrare la realizzazione di un canestro da 1 punto fatto da una squadra;
 * 	   - registrare la realizzazione di uncanestro da 2 punti fatto da una squadra;
 * 	   - registrare la realizzazione di un canestro da 3 punti fatto da una squadra;
 * 	   - cambiare lo stato del gioco da "ancora in corso" a "finito";
 * 	   - restituire il punteggio di una squadra;
 * 	   - restituire il nome della squadra vinvitrice;
 * 
 */

public class PartitaBasket {

	private String nomePrimaSquadra;
	private String nomeSecondaSquadra;
	private int punteggioPrimaSquadra;
	private int punteggioSecondaSquadra;
	private String statoGioco;
	
	public void inserisciNomi() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci nome prima squadra:");
		nomePrimaSquadra = tastiera.next();
		System.out.println("Inserisci il nome della seconda squadra");
		nomeSecondaSquadra = tastiera.next();
		statoGioco = "Ancora in corso";
	}
	
	public void punteggio() {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci il nome della squadra a cui assegnare il punteggio:");
		String nomeSquadra = tastiera.next();
		System.out.println("Inserisci un punteggio:");
		int punteggio = tastiera.nextInt();
		
		if(punteggio == 1) {
			punteggioUno(nomeSquadra);
		} else
			if(punteggio == 2) {
				punteggioDue(nomeSquadra);
			} else
				if(punteggio == 3) {
					punteggioTre(nomeSquadra);
				} else {
					System.out.println("Punteggio non valido");
				}
	}
	
	public void punteggioUno(String nomeSquadra) {
		if(nomeSquadra.equalsIgnoreCase(nomePrimaSquadra)) {
			punteggioPrimaSquadra++;
		} else
			if(nomeSquadra.equalsIgnoreCase(nomeSecondaSquadra)) {
				punteggioSecondaSquadra++;
			}
	}
	
	public void punteggioDue(String nomeSquadra) {
		if(nomeSquadra.equalsIgnoreCase(nomePrimaSquadra)) {
			punteggioPrimaSquadra = punteggioPrimaSquadra + 2;
		} else
			if(nomeSquadra.equalsIgnoreCase(nomeSecondaSquadra)) {
				punteggioSecondaSquadra = punteggioSecondaSquadra + 2;
			}
	}
	
	public void punteggioTre(String nomeSquadra) {
		if(nomeSquadra.equalsIgnoreCase(nomePrimaSquadra)) {
			punteggioPrimaSquadra = punteggioPrimaSquadra + 3;
		} else 
			if(nomeSquadra.equalsIgnoreCase(nomeSecondaSquadra)) {
				punteggioSecondaSquadra = punteggioSecondaSquadra + 3;
			}
	}
	
	public String cambiareStato() {
		return statoGioco = "finito";
	}
	
	public int punteggioPrimaSquadra() {
		return punteggioPrimaSquadra;
	}
	
	public int punteggioSecondaSquadra() {
		return punteggioSecondaSquadra;
	}
	
	public void vincitore() {
		if(punteggioPrimaSquadra > punteggioSecondaSquadra ) {
			System.out.println("Ha vinto la squadra: " + nomePrimaSquadra);
		} else
			if(punteggioPrimaSquadra < punteggioSecondaSquadra) {
				System.out.println("Ha vinto la squadra: " + nomeSecondaSquadra);
			} else {
				System.out.println("Pareggio");
			}
	}
}
