import java.util.Scanner;

/*
 *	7- Scrivere un programma che simula il gioco della magica palla 8. Eseguendo il
 *	   programma, viene generato un numero casuale che è associato in output a una 
 *	   delle seguenti 8 risposte:
 *
 *	   E' certo
 *	   E' decisamente così
 *	   E' molto probabile
 *	   I segni indicano di sì
 *	   E' difficile rispondere, prova di nuovo
 *	   Rifai la doamnda più tardi
 *	   Non ci contare
 *	   Le mie fonti dicono di no
 * 
 */

public class PallaMagica {

	public static void main(String[] args) {
		
		String risposta;
		String domanda;
		
		Scanner tastiera = new Scanner(System.in);
		
		do {
			
			System.out.println("Fai una domanda alla palla magica...");
			domanda = tastiera.nextLine();
			System.out.println("La palla magica sta pensando ad una risposta...");
			
			int num = (int) (Math.random() * 8) + 1;
			
			switch(num) {
			
			case 1:
				System.out.println("E' certo");
				break;
			case 2:
				System.out.println("E' decisamente così");
				break;
			case 3:
				System.out.println("E' molto probabile");
				break;
			case 4:
				System.out.println("I segni indicano di sì");
				break;
			case 5:
				System.out.println("E' difficile rispondere, prova di nuovo");
				break;
			case 6:
				System.out.println("Rifai la domanda più tardi");
				break;
			case 7:
				System.out.println("Non ci contare");
				break;
			case 8:
				System.out.println("Le mie fonti dicono di no");
				
			}
			
			System.out.println();
			System.out.println("Vuoi fare un'altra domanda alla palla magica?");
			System.out.println("Rispondi con si oppure con no.");
			
			risposta = tastiera.nextLine();
		} while(risposta.equalsIgnoreCase("si"));
	}

}
