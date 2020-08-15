/*
 * 	Test della clasee punteggio
 */

public class PunteggioTest {

	public static void main(String[] args) {
		
		Punteggio valutazione = new Punteggio();
		
		valutazione.punteggioOttenuto();
		
		System.out.println(valutazione.getPunteggioMassimo());
		System.out.println(valutazione.getPunteggio());
		valutazione.visualizzaPunteggioStringa();
	}

}
