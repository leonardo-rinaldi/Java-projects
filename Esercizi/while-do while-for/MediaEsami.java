import java.util.Scanner;

/*
 * Calcola la media di un elenco di voti non negativi relativi a un esame. Ripete il calcolo
 * per più esami fino a quando l'utente non chiede di fermarsi.
 * 
 */

public class MediaEsami {

	public static void main(String[] args) {
		
		System.out.println("Questo programma calcola la media");
		System.out.println("di un elenco di voti non negativi.");
		double somma;
		int numeroStudenti;
		double successivo;
		String risposta;
		Scanner tastiera = new Scanner(System.in);

		do {
			System.out.println();
			System.out.println("Inserisci tutti i voti di cui");
			System.out.println("vuoi calcolare la media.");
			System.out.println("Poi inserisci un numero negativo");
			System.out.println("dopo aver finito tutti i voti");
			somma = 0;
			numeroStudenti = 0;
			successivo = tastiera.nextDouble();
			while (successivo >= 0) {
				somma = somma + successivo;
				numeroStudenti++;
				successivo = tastiera.nextDouble();
			}
			if (numeroStudenti > 0) {
				System.out.println("La media è " + (somma / numeroStudenti));
			} else {
				System.out.println("La media non è calcolabile.");
			}
			System.out.println("Vuoi calcolare la media di un altro " + "esame?");
			System.out.println("Scrivi si o no");
			risposta = tastiera.next();
		} while (risposta.equalsIgnoreCase("Si"));
		
	}

} //MediaEsami
