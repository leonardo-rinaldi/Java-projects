/*
 *	Test della classe RettanfoloFigura 
 */

public class RettangoloFiguraTest {

	public static void main(String[] args) {
		
		RettangoloFigura rettangolo = new RettangoloFigura(0, 9, 4);
		rettangolo.disegnaDa(3);
		System.out.println();
		System.out.println("Area: " + rettangolo.calcolaArea());
		System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
	}

}
