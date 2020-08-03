/*
 *	Test della classe Contatore
 */

public class ContatoreTest {

	public static void main(String[] args) {
		
		Contatore conto = new Contatore();
		
		//Test Contatore
		
		conto.azzera();
		
		int conteggio = conto.getContatore();
		
		for(int i = conteggio; i < 10; i++) {
			conto.incrementaDiUno();
		}
		conto.visualizzaConteggio();
		conteggio = conto.getContatore();
		
		for(int j = conteggio; j > 0; j--) {
			conto.decrementoDiUno();
		}
		conto.visualizzaConteggio();
	}
}
