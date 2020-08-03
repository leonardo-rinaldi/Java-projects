/*
 * Test della classe Specie
 */

public class SpecieTest {

	public static void main(String[] args) {
		
		Specie bufalo = new Specie();
		
		bufalo.setSpecie("Bufalo Klingon", 100, 15);
		bufalo.scriviOutput();
		System.out.println();
		
		Specie elefante = new Specie();
		
		elefante.setSpecie("Elefante", 10, 35);
		elefante.scriviOutput();
		System.out.println("ci vorranno " + bufalo.crescitaPopolazione(elefante) + " anni");
		
		
	}

}
