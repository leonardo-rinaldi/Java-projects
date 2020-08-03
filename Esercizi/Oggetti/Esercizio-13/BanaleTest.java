/*
 * Test della classe Banale
 */

public class BanaleTest {

	public static void main(String[] args) {
		
		Banale domandaUno = new Banale();
		Banale domandaDue = new Banale();
		
		domandaUno.setValori();
		domandaDue.setValori();
		
		domandaUno.poniDomande();
		domandaDue.poniDomande();

	}

}
