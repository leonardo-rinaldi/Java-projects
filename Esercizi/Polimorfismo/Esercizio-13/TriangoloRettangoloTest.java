/*
 * Test della classe TriangoloRettangolo
 */

public class TriangoloRettangoloTest {

	public static void main(String[] args) {
		
		TriangoloRettangolo triangolo = new TriangoloRettangolo(10, 9);
		triangolo.disegnaDa(3);
		System.out.println();
		System.out.println("Area: " + triangolo.calcolaArea());
		System.out.println("Perimetro: " + triangolo.calcolaPerimetro());

	}

}
