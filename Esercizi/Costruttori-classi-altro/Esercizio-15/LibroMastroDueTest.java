/*
 * 	Test della classe LibroMastroDue 
 */

public class LibroMastroDueTest {

	public static void main(String[] args) {

		LibroMastroDue libro = new LibroMastroDue(4);
		libro.aggiungiVendita(20.0);
		libro.aggiungiVendita(30.12);
		libro.aggiungiVendita(10.23);
		libro.aggiungiVendita(10.10);
		libro.visualizzaArray();
		System.out.println("Numero vendite: " + libro.getNumeroVendite());
		System.out.println("Totale vendite " + libro.getTotaleVendite());
		System.out.println("Media vendite: " + libro.getMediaVendite());
		System.out.println("Numero di vendite al di sopra di v: " + libro.getVenditeAlDiSopra(10.50));
	}
}
