/*
 *	Test della classe PartitaBasket 
 */

public class PartitaBasketTest {

	public static void main(String[] args) {
		
		PartitaBasket partita = new PartitaBasket();
		
		partita.inserisciNomi();
		
		for(int i = 0; i < 4; i++) {
			partita.punteggio();
		}
		
		System.out.println("Stato della partita: " + partita.cambiareStato());
		System.out.println("Punteggio prima squadra: " + partita.punteggioPrimaSquadra());
		System.out.println("Punteggio seconda squadra: " + partita.punteggioSecondaSquadra());
		partita.vincitore();
	}

}
