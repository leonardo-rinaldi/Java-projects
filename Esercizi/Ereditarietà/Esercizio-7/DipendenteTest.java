/*
 * Test della classe Dipendente
 */

public class DipendenteTest {

	public static void main(String[] args) {
		
		Dipendente Marco = new Dipendente("Marco", 20000, 2012, "KLIMN");
		Dipendente Giulio = new Dipendente("Giulio", 40000, 2010, "ZHLO");
		
		System.out.println("Nome: " + Marco.getNome());
		System.out.println("Retribuzione: " + Marco.getRetribuzione());
		System.out.println("Anno assunzione: " + Marco.getAnno());
		System.out.println("Identificativo: " + Marco.getIdentificativo());
		
		System.out.println(Marco.equals(Giulio));
	}

}
