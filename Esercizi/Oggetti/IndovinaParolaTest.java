import java.util.Scanner;

/*
 * 	Test della classe IndovinaParola
 */

public class IndovinaParolaTest {

	public static void main(String[] args) {
		
		IndovinaParola parola = new IndovinaParola();
		
		Scanner tastiera = new Scanner(System.in);
		
		parola.inizializza();
		parola.riempiArray();
		
		int lunghezzaParola = parola.getParolaDaIndovinare().length();
		
		System.out.println("La parola da scoprire è la seguente:");
		parola.getParolaScoperta();
		
		for(int i = 0; i < lunghezzaParola - 2; i++) {
			
			System.out.println("Inserisci una lettera:");
			char lettera = tastiera.next().charAt(0);
			parola.indovina(lettera);
			parola.getParolaScoperta();
		}
		
		if(parola.isIndovinata()) {
			System.out.println("Hai indovinato la parola");
		} else {
			System.out.println("Non hai indovinato la parola");
		}
		
		System.out.print("Numero tentativi: ");
		System.out.print(parola.getNumeroTentativi());
	}

}
