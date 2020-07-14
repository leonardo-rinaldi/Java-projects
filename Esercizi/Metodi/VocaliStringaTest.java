import java.util.Scanner;

/*
 * 	Test del metodo contaVocali.
 */

public class VocaliStringaTest {

	public static void main(String[] args) {
		
		String risposta;
		String piùLunga = "";
		Scanner tastiera = new Scanner(System.in);
		
		do {
			System.out.println("Inserisci una stringa:");
			risposta = tastiera.nextLine();
			
			if(VocaliStringa.contaVocali(risposta) > 5) {
				piùLunga = risposta;
			} else {
				continue;
			}
			
			System.out.println("Vuoi continuare?");
			System.out.println("Inserisci \"fine\" per terminare il programma");
			risposta = tastiera.nextLine();
			
		} while(!risposta.equalsIgnoreCase("fine"));
		
		System.out.println(piùLunga);
	}
	

}
