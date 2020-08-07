/*
 *	Test della classe Cane 
 */

public class CaneTest {

	public static void main(String[] args) {
		
		Cane balto = new Cane();
		
		balto.setDati("Balto", "Husky Siberiano", 8);
		balto.scriviOutput();
		System.out.println("Età in anni umani: " + balto.getEtaInAnniUmani());
		
		Cane scooby = new Cane();
		
		scooby.setDati("Scooby", "Alano", 9); 
		scooby.scriviOutput();
		System.out.println("Età in anni umani: " + scooby.getEtaInAnniUmani());
		
		System.out.println(scooby.equals(balto));
	}

}
