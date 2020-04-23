import java.util.Scanner;

/* 
 * PROGRAMMI
 * 
 *  2- Si scriva un programma che usi Scanner per leggere due stringhe
 *     dalla tastiera e che visualizzi ciascuna Stringa su una riga
 *     distinta, indicandone la lunghezza, ma separandole con uno spazio.
 *     Infine, visualizzare su una terza riga la terza stringa e la sua
 *     lunghezza.
 * 
 */

public class Stringhe {

	public static void main(String[] args) {
		
		String primaStringa;
		String secondaStringa;
		String terzaStringa;
		
		int lunghezzaPrimaStringa;
		int lunghezzaSecondaStringa;
		int lunghezzaTerzaStringa;
		
		Scanner stringaInserita = new Scanner(System.in);
		
		System.out.println("Inserisci tre stringhe:");
		primaStringa = stringaInserita.nextLine();
		secondaStringa = stringaInserita.nextLine();
		terzaStringa = stringaInserita.nextLine();
		
		lunghezzaPrimaStringa = primaStringa.length();
		lunghezzaSecondaStringa = secondaStringa.length();
		lunghezzaTerzaStringa = terzaStringa.length();
		
		System.out.println("Prima stringa: " + primaStringa + " Lunghezza: " + lunghezzaPrimaStringa);
		System.out.println("Seconda stringa: " + secondaStringa + " Lunghezza: " + lunghezzaSecondaStringa);
		System.out.println("Terza stringa: " + terzaStringa + " Lunghezza " + lunghezzaTerzaStringa);

	}

}
