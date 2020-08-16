/* 
 *	Test della classe OccupazioneStanza 
 */

public class OccupazioneStanzaTest {

	public static void main(String[] args) {
		
		OccupazioneStanza stanza = new OccupazioneStanza();
		
		stanza.aggiungiUnoAllaStanza();
		System.out.println("NumeroNellaStanza: " + stanza.getNumero());
		System.out.println("numeroTotale: " + stanza.getTotale());
		stanza.rimuoviUnoDallaStanza();
		System.out.println("NumeroNellaStanza: " + stanza.getNumero());
		System.out.println("numeroTotale: " + stanza.getTotale());
	}

}
