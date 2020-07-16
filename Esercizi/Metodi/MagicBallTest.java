package metodi;

import java.util.Scanner;

/*
 * Test del metodo pallaMagica.
 */

public class MagicBallTest {

	public static void main(String[] args) {
		
		String domanda, risposta;
		
		Scanner tastiera = new Scanner(System.in);
		
		do {
			System.out.println("Fai una domanda alla palla magica e riceverai una risposta");
			domanda = tastiera.nextLine();
			System.out.println(MagicBall.pallaMagica());
			
			System.out.println();
			System.out.println("Vuoi fare un'altra domanda alla palla magica?");
			System.out.println("Rispondi si oppure no");
			risposta = tastiera.nextLine();
			
		} while(risposta.equalsIgnoreCase("si"));
		
	}

}
