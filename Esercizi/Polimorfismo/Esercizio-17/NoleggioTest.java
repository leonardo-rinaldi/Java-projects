import java.util.Scanner;

/*
 * Test della clase Noleggio
 */

public class NoleggioTest {
	
	public static void main(String[] args) {
		Noleggio[] film;
		int numeroFilm = 2;
		
		Scanner tastiera = new Scanner(System.in);
		film = new Noleggio[numeroFilm];
		
		for(int i = 0; i < film.length; i++) {
			film[i] = new Noleggio();
			System.out.println("Inserisci il titolo del film:");
			String titolo = tastiera.next();
			film[i].setTitolo(titolo);
			System.out.println("Inserisci il documento di identificazione:");
			int documento = tastiera.nextInt();
			System.out.println("Inserisci i giorni di ritardo:");
			int ritardo = tastiera.nextInt();
			film[i].setRitardoFilm(ritardo);
			film[i].setDocumentoIdentificazione(documento);
	}
		System.out.println();
		System.out.print("Le penali totali ammontano a: ");
		System.out.print(calcolaPenaliRitardo(film) + " Euro");
  }
	
	public static double calcolaPenaliRitardo(Noleggio[] film) {
		double penali = 0;
		
		for(int i = 0; i < film.length; i++) {
			penali = penali + film[i].calcolaPenali();
		}
		return penali;
	}

}
