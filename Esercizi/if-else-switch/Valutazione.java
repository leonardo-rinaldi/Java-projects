import java.util.Scanner;


/* 
 * 	12- Scrivere un'istruzione switch che converta un voto in lettere nel voto numerico
 * 		equivalente, su una scala di quattro punti. Si assegni alla variabile "voto" il
 * 		valore 4.0 per una A, 3.0 per una B, 2.0 per una C, 1.0 per una D e 0.0 per una
 * 		F. Per qualsiasi altra lettera si assegni il valore 0.0 esi mostri un messaggio
 * 		di errore.
 * 
 * 
 */

public class Valutazione {

	public static void main(String[] args) {
		
		String votoInserito;
		double voto;
		
		Scanner lettera = new Scanner(System.in);
		System.out.println("Inserisci una lettera per avere il tuo voto: ");
		
		votoInserito = lettera.next();
		
		switch (votoInserito) {
		
		case "A":
			voto = 4.0;
			System.out.println("Il tuo voto è: " + voto);
		break;
		
		case "B":
			voto = 3.0;
			System.out.println("Il tuo voto è: " + voto);
		break;
		
		case "C":
			voto = 2.0;
			System.out.println("Il tuo voto è: " + voto);
		break;
		
		case "D":
			voto = 1.0;
			System.out.println("Il tuo voto è: " + voto);
		break;
			
		case "F":
			voto = 0.0;
			System.out.println("Il tuo voto è: " + voto);
		break;
		
		default:
			voto = 0.0;
			System.out.println("Errore, il tuo punteggio è: " + voto);
			
		}

	}

}
