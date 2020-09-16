/*
 * Test del metodo CifrarioCombinazione
 */

public class CifrarioCombinazioneTest {

	public static void main(String[] args) {
		
		CifrarioCombinazione combinazione = new CifrarioCombinazione(3);
		String parola = combinazione.codifica("abcdefghi");
		System.out.println(parola);
	}

}
