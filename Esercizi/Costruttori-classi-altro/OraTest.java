/*
 *	Test della classe Ora 
 */

public class OraTest {

	public static void main(String[] args) {
		
		Ora orario = new Ora();
		orario.visualizza();
		orario.setOra(10, 50);
		orario.visualizza();
		orario.setOra(12, 20, true);
		orario.visualizza();
	}

}
