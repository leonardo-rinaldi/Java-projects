/*
 * Test della classe VotiArrayList
 */

public class VotiArrayListTest {

	public static void main(String[] args) {
		VotiArrayList voto = new VotiArrayList();

		voto.InserisciVoti();
		System.out.println("Il voto medio è: " + voto.calcolaVotoMedio());
		System.out.println("Il voto massimo è :" + voto.votoMassimo());
		System.out.println("Il voto minimo è :" + voto.votoMinimo());
	}

}
