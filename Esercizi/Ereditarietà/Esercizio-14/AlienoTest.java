/*
 *	Test della classe Alieno, AlienoSerpente, AlienoOrco e AlienoUomoMarshmallow.
 */

public class AlienoTest {

	public static void main(String[] args) {
		
		AlienoSerpente alienoUno = new AlienoSerpente(10, "AlienoUno");
		AlienoOrco alienoDue = new AlienoOrco(20, "AlienoDue");
		AlienoUomoMarshmallow alienoTre = new AlienoUomoMarshmallow(5, "AlienoTre");
		
		System.out.println("Danno alieno serpente: " + alienoUno.calcolaDanno());
		System.out.println("Danno alieno orco: " + alienoDue.calcolaDanno());
		System.out.println("Danno alieno uomo marshmallow: " + alienoTre.calcolaDanno());

	}

}
