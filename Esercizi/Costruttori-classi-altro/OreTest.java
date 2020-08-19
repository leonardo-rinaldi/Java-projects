/*
 *	Test della classe Ore 
 */

public class OreTest {

	public static void main(String[] args) {
		
		Ore orario = new Ore();
		orario.setOra(15, 5);
		orario.getOra24();
		orario.getOra12();
	}

}
