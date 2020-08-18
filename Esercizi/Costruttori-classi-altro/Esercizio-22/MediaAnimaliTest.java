/*
 * Test della classe MediaAnimali
 */

public class MediaAnimaliTest {

	public static void main(String[] args) {
		
		MediaAnimali an = new MediaAnimali();
		
		an.setValori();
		System.out.println("Nome più giovane: " + an.nomePiùGiovane());
		System.out.println("Nome più giovane: " + an.nomePiùVecchio());
		System.out.println("Nome del più piccolo: " + an.nomePiùPiccolo());
		System.out.println("Nome del più grande: " + an.nomePiùGrande());
		System.out.println("Peso medio: " + an.pesoMedio());
		System.out.println("Età media: " + an.etàMedia());
	}

}
