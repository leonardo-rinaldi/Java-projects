import java.util.Scanner;

/*
 *	7- Scrivere un programma per il gioco della morra cinese (carta-forbici-sasso).
 *     Ciascuno dei due giocatori digita C, F, o S. Il programma poi comunica il
 *     vincitore e il criterio per determinare il vincitore: la carta avvolge il
 *     sasso, le forbici tagliano la carta, il sasso spezza le forbici oppure non
 *     c'è nessun vincitore. Il programma dovrà consentire ai giocatori di digitare
 *     lettere maiuscole e minuscole.
 * 
 */

public class MorraCinese {
	

	public static void main(String[] args) {
		
		String giocatoreUno;
		String giocatoreDue;
		
		Scanner risposta = new Scanner(System.in);

		System.out.println("Per giocare digira C per la carta, F per le forbici e S per il sasso");
		System.out.println("Giocatore 1");
		giocatoreUno = risposta.next();
		
		System.out.println("Giocatore 2");
		giocatoreDue = risposta.next();
		
		if (giocatoreUno.equalsIgnoreCase("C") && giocatoreDue.equalsIgnoreCase("S") ) {
			
			System.out.println("Ha vinto il giocatore 1");
		}
		else
			if (giocatoreUno.equalsIgnoreCase("S") && giocatoreDue.equalsIgnoreCase("C")) {
				System.out.println("Ha vinto il giocatore 2");
			}
			else
				if (giocatoreUno.equalsIgnoreCase("F") && giocatoreDue.equalsIgnoreCase("C")) {
					System.out.println("Ha vinto il giocatore 1");
				}
				else
					if (giocatoreUno.equalsIgnoreCase("C") && giocatoreDue.equalsIgnoreCase("F")) {
						System.out.println("Ha vinto il giocatore 2");
					}
					else
						if (giocatoreUno.equalsIgnoreCase("S") && giocatoreDue.equalsIgnoreCase("F")) {
							System.out.println("Ha vinto il giocatore 1");
						}
						else
							if (giocatoreUno.equalsIgnoreCase("F") && giocatoreDue.equalsIgnoreCase("S")) {
								System.out.println("Ha vinto il giocatore 2");
							}
							else {
								System.out.println("Risposta non valida!");
							}
	}

}
