/*
 *	Test della classe ProgettoScienzaPunteggio
 */

public class ProgettoScienzaPunteggioTest {

	public static void main(String[] args) {
		
		ProgettoScienzaPunteggio progettoUno = new ProgettoScienzaPunteggio();
		progettoUno.progettoScientifico();
		
		ProgettoScienzaPunteggio progettoDue = new ProgettoScienzaPunteggio();
		progettoDue.progettoScientifico();
		
		System.out.println("Punteggio primo progetto:");
		System.out.println();
		progettoUno.setPunteggi();
		System.out.println(progettoUno.getPunteggioMassimo());
		System.out.println("Punteggio totale: " + progettoUno.getPunteggio());
		
		System.out.println("Punteggio secondo progetto:");
		System.out.println();
		progettoDue.setPunteggi();
		System.out.println(progettoDue.getPunteggioMassimo());
		System.out.println("Punteggio totale: " + progettoDue.getPunteggio());
	}

}
