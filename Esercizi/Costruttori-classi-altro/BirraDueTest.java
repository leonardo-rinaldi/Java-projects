/*
 * 	Test della classe BirraDue
 */

public class BirraDueTest {

	public static void main(String[] args) {
		
		BirraDue primaBirra = new BirraDue("Heineken", 0.05);
		BirraDue secondaBirra = new BirraDue("Corona", 0.04);
		
		primaBirra.setPeso();
		secondaBirra.setPeso();

	}

}
