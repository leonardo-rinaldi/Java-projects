import java.util.Scanner;

/*
 * 
 * 	15- Ripetere l'esercizio 13, ma usando un'istruzione if-else multi-ramo
 * 		invece di un'istruzione switch.
 * 
 */

public class ValutazioneAlternativa {

	public static void main(String[] args) {
		
		String votoInserito;
		double voto;
		
		Scanner lettera = new Scanner(System.in);
		System.out.println("Inserisci una lettera per avere il tuo voto: ");
		
		votoInserito = lettera.next();
		
		if(votoInserito.contentEquals("A")) {
			voto = 4.0;
			System.out.println("Il tuo voto è: " + voto);
		} else
			if (votoInserito.contentEquals("B")) {
				voto = 3.0;
				System.out.println("Il tuo voto è: " + voto);
			} else
				if (votoInserito.contentEquals("C")) {
					voto = 2.0;
					System.out.println("Il tuo voto è: " + voto);
				} else
					if(votoInserito.contentEquals("D")) {
						voto = 1.0;
						System.out.println("Il tuo voto è: " + voto);
					} else
						if(votoInserito.contentEquals("F")) {
							voto = 0;
							System.out.println("Il tuo voto è: " + voto);
						} 
						else {
							voto = 0.0;
							System.out.println("Errore, il tuo punteggio è: " + voto);
						}

	}

}
