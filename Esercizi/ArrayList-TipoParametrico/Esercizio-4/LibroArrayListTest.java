/*
 *	Test della classe LibroArrayList 
 */

public class LibroArrayListTest {

	public static void main(String[] args) {
		
		LibroArrayList libro = new LibroArrayList(4);
		libro.aggiungiVendita(20.0);
		libro.aggiungiVendita(30.12);
		libro.aggiungiVendita(10.23);
		libro.visualizzaArray();
		System.out.println();
		System.out.println(libro.getNumeroVendite());
		System.out.println(libro.getTotaleVendite());

	}

}
