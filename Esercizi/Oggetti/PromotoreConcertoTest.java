package oggetti;

/*
 * 	Test della classe PromotoreConcerto
 */

public class PromotoreConcertoTest {

	public static void main(String[] args) {
	
		PromotoreConcerto concerto = new PromotoreConcerto();
		
		concerto.concerto();
		
		for(int i = 7; i >= 0; i--) {
			System.out.println(i);
			concerto.cambiaPrezzo(i);
			concerto.venditaBiglietto();
			System.out.println("Numero biglietti: " + concerto.bigliettivenduti());
		}
		
		System.out.println("Biglietti rimanenti: " + concerto.bigliettiRimanenti());
		System.out.println("Totale vendite: " + concerto.totaleVendite() + " €");
	}

}
