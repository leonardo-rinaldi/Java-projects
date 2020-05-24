import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
		
		int numeroUno;
		int numeroDue;
		String risposta;
		
		Scanner tastiera = new Scanner(System.in);

		do {
			System.out.println("Inserisci due numeri interi e verrà eseguita la somma");
			numeroUno = tastiera.nextInt();
			numeroDue = tastiera.nextInt();
			
			if(numeroUno >=0 && numeroDue >= 0) {
			
				int somma = numeroUno + numeroDue;
				System.out.println("La somma è: " + somma);
			}
			
			System.out.println("Vuoi eseguire un'altra operazione?");
			risposta = tastiera.next();
		} while(risposta.equalsIgnoreCase("si"));
		
	}

}
