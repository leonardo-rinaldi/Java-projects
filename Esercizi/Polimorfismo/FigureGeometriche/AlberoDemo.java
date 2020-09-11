/*
 *	Un programma che disegna un abete composto da triangoli e un
 *	un rettangolo, entrambi disegnati utilizzando i caratteri della
 *	tastiera.
 * 
 */

public class AlberoDemo {
	public static final int RIENTRO = 5;
	public static final int LARGHEZZA_PUNTA_ALBERO = 21;
	public static final int LARGHEZZA_BASE_ALBERO = 4;
	public static final int ALTEZZA_BASE_ALBERO = 4;
	
	public static void main(String[] args) {
		disegnaAlbero(LARGHEZZA_PUNTA_ALBERO, LARGHEZZA_BASE_ALBERO, ALTEZZA_BASE_ALBERO);
	}
	
	public static void disegnaAlbero(int larghezzaPunta, int larghezzaBase, int altezzaBase) {
		System.out.println("      Salva le Sequoie");
		Triangolo puntaAlbero = new Triangolo(RIENTRO, larghezzaPunta);
		disegnaPunta(puntaAlbero);
		Rettangolo troncoAlbero = new Rettangolo(RIENTRO + (larghezzaPunta / 2) - (larghezzaBase / 2), altezzaBase, larghezzaBase);
		disegnaTronco(troncoAlbero);
	}
	
	private static void disegnaPunta(Triangolo puntaAlbero) {
		puntaAlbero.disegnaDa(1);
	}
	
	private static void disegnaTronco(Rettangolo troncoAlbero) {
		troncoAlbero.disegnaQui();	
	}
}
