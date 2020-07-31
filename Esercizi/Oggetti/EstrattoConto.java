import java.util.Scanner;

/*
 * 	2- Si definisca una classe per rappresentare l'estratto conto di
 * 	   una carta di credito. U estratto conto rappresenta i pagamenti
 * 	   e  versamenti effetuati usando la carta di credito.
 * 
 */

public class EstrattoConto {

	private double numeroConto;
	private double saldo;

	public void inizializzazione() {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserire il numero del conto");
		numeroConto = tastiera.nextDouble();
		System.out.println("Inserire saldo del conto");
		saldo = tastiera.nextDouble();
		azioni();
	}
	
	public void azioni() {
		Scanner tastiera = new Scanner(System.in);
		String risposta;
		double somma;
		
		do {
			
			System.out.println("Quale azione desideri svolgere?");
			System.out.println("Deposito, prelievo, saldo");
			risposta = tastiera.next();
			
			if(risposta.equalsIgnoreCase("deposito")) {
				System.out.println("Inserire somma da depositare:");
				somma = tastiera.nextDouble();
				deposito(somma);
				System.out.println("Transazione eseguita correttamente");
			} else
				if(risposta.equalsIgnoreCase("prelievo")) {
					System.out.println("Inserire somma da prelevare");
					somma = tastiera.nextDouble();
					prelievo(somma);
					System.out.println("Transazione eseguita correttamente");
				} else 
					if(risposta.equalsIgnoreCase("saldo")) {
						visualizzaSaldo();
					} else {
						System.out.println("Errore!");
					}
			
			
			System.out.println("Vuoi uscire?");
			risposta = tastiera.next();
			
		} while(risposta.equalsIgnoreCase("no"));
		
	}
	
	public double deposito(double quantitàDepositata) {
		return saldo = (saldo + quantitàDepositata); 
	}
	
	public double prelievo(double quantitàPrelevata) {
		return saldo = (saldo - quantitàPrelevata);
	}
	
	public void visualizzaSaldo() {
		System.out.println("Il tuo saldo attuale è: " + saldo);
	}
	
	
}
