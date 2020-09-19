/*
 * Test della classe QuadratoFigura
 */

public class QuadratoFiguraTest {

	public static void main(String[] args) {
		QuadratoFigura quadrato = new QuadratoFigura(4);
		quadrato.disegnaDa(3);
		System.out.println();
		System.out.print("Area: " + quadrato.calcolaArea());
		System.out.println();
		System.out.println("Perimetro: " + quadrato.calcolaPerimetro());
	}

}
