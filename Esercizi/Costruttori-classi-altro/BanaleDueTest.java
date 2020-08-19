
/* 
 *	Test della classe BanaleDue
 * 
 */

public class BanaleDueTest {

	public static void main(String[] args) {
		
		
		BanaleDue domandaUno = new BanaleDue();
		BanaleDue domandaDue = new BanaleDue();
		
		System.out.println("Domanda: " + domandaUno.getDomanda());
		System.out.println("Risposta: " + domandaUno.getRisposta());
		domandaUno.setValori();
		domandaDue.setValori();
		
		domandaUno.poniDomande();
		domandaDue.poniDomande();


	}

}
