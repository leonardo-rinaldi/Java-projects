/*
 *	Esempio di binding dinamico 
 */

public class BindingDinamicoDemo {

	public static void main(String[] args) {
		
		Vendita semplice = new Vendita("tappetino auto", 10.00); //un prodotto a E10.00.
		VenditaScontata scontato = new VenditaScontata("tappetino auto", 11.00, 10);  // un prodotto a E11.00 con il 10% di sconto
		
		System.out.println(semplice.toString());
		System.out.println(scontato.toString());
		
		if(scontato.minoreDi(semplice)) {
			System.out.println("Il prodotto scontato costa meno");
		} else {
			System.out.println("Il prodottoscontato non costa meno.");
		}
		
		Vendita prezzoNormale = new Vendita("porta bicchiere", 9.90); //un prodotto a E9.90
		VenditaScontata prezzoSpeciale = new VenditaScontata("porta bicchiere", 11.00, 10); //un prodotto a E11.00 con il 10% di sconto.
		
		System.out.println(prezzoNormale.toString());
		System.out.println(prezzoSpeciale.toString());
		
		if (prezzoSpeciale.uguaglianzaVendite(prezzoNormale)) {
			System.out.println("Il costo totale è lo stesso.");
		} else {
			System.out.println("Il costo totale è diverso.");
		}
	}
}
