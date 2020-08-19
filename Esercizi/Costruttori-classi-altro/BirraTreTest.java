/*
 * 	Test della classe BirraTre
 */

public class BirraTreTest {

	public static void main(String[] args) {
		
		BirraTre primaBirra = new BirraTre("Heineken", 5.0);
		BirraTre secondaBirra = new BirraTre("Corona", 0.05);
		
		System.out.println("Percentuale alcool: " + primaBirra.getAlcool());
		System.out.println("Percentuale alcool: " + secondaBirra.getAlcool());
		
		primaBirra.setPeso();
		secondaBirra.setPeso();
		
	}

}
