/*
 * Test della classe Dottore
 */

public class DottoreTest {

	public static void main(String[] args) {
		
		Dottore Filippo = new Dottore("Filippo", "Pediatra", 9);
		Dottore Mauro = new Dottore("Mario", "Ostetrico", 10);
		
		System.out.println("Nome: " + Filippo.getNome());
		System.out.println("Specializzazione: " + Filippo.getSpecializzazione());
		System.out.println("Parcelle: " + Filippo.getParcelle());

		System.out.println("Nome: " + Mauro.getNome());
		System.out.println("Specializzazione: " + Mauro.getSpecializzazione());
		System.out.println("Parcelle: " + Mauro.getParcelle());
		
		System.out.println(Filippo.equals(Mauro));
	}

}
