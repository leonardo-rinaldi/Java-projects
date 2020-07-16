package metodi;

import java.util.Scanner;

/*
 *	Test del metodo Calcolatrice
 */

public class CalcolatriceTest {

	public static void main(String[] args) {
	
		double primoNumero;
		double secondoNumero;
		String risposta;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Quale operazione vuoi eseguire?");
		System.out.println("Puoi scegliere: somma, sottrazione, moltiplicazione, divisione.");

		risposta = tastiera.next();
		
		if(risposta.equalsIgnoreCase("somma")) {
			
			System.out.println("Inserisci il primo numero:");
			primoNumero = tastiera.nextDouble();
			System.out.println("Inserisci il secondo numero");
			secondoNumero = tastiera.nextDouble();
			
			System.out.println(Calcolatrice.somma(primoNumero, secondoNumero));
		} else 
			if(risposta.equalsIgnoreCase("sottrazione")) {
				
				System.out.println("Inserisci il primo numero:");
				primoNumero = tastiera.nextDouble();
				System.out.println("Inserisci il secondo numero");
				secondoNumero = tastiera.nextDouble();
				
				System.out.println(Calcolatrice.sottrazione(primoNumero, secondoNumero));
			} else 
				if(risposta.equalsIgnoreCase("moltiplicazione")) {
					
					System.out.println("Inserisci il primo numero:");
					primoNumero = tastiera.nextDouble();
					System.out.println("Inserisci il secondo numero");
					secondoNumero = tastiera.nextDouble();
					
					System.out.println(Calcolatrice.moltiplicazione(primoNumero, secondoNumero));
				} else
					if(risposta.equalsIgnoreCase("divisione")) {
						
						System.out.println("Inserisci il primo numero:");
						primoNumero = tastiera.nextDouble();
						System.out.println("Inserisci il secondo numero");
						secondoNumero = tastiera.nextDouble();
						
						System.out.println(Calcolatrice.divisione(primoNumero, secondoNumero));
					} else {
						System.out.println("Risposta sbagliata!");
					}
		
	}

}
