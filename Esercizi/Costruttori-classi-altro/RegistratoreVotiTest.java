import java.util.Scanner;

/*
 * Test della classe RegistratoreVoti
 */

public class RegistratoreVotiTest {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		RegistratoreVoti voti = new RegistratoreVoti("Mauro", "Leonardo", "Giovanni", "Pietro");
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Inserisci il nome del candidato presidente che vuoi votare");
			 String nomePresidente = tastiera.next();
			 voti.getVotoPresidente(nomePresidente);
			 
			 System.out.println("Inserisci il nome del candidato vice presidente che vuoi votare");
			 String nomeVice = tastiera.next();
			 voti.getVotoVicePresidente(nomeVice);
			 
			 voti.restituisciEConfermaVoti();
		}
		voti.visualizza();
	}

}
