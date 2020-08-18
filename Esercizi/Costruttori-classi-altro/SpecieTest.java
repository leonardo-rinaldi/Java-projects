/*
 *	Test della classe Specie 
 */

public class SpecieTest {

	public static void main(String[] args) {
		
		Specie nuovaSpecie = new Specie("gatto", 1000, 20);
		
		nuovaSpecie.scriviOutput();
		nuovaSpecie.setSpecie();
		nuovaSpecie.scriviOutput();
	}

}
