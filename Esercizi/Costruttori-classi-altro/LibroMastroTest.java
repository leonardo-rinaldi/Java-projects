/*
 * 	Test della classe LibroMaestro
 */

public class LibroMastroTest {

	public static void main(String[] args) {
		
		LibroMastro libro = new LibroMastro(4);
		libro.aggiungiVendita(20.0);
		libro.aggiungiVendita(30.12);
		libro.aggiungiVendita(10.23);
		libro.visualizzaArray();
		System.out.println();
		System.out.println(libro.getNumeroVendite());
		System.out.println(libro.getTotaleVendite());

	}

}
