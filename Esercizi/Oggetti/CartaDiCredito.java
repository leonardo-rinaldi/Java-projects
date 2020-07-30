package oggetti;

import java.util.Scanner;

/*
 * 	1- Si definisca una classe per rappresentare una carta di credito.
 * 	   Si pensi agli attributi della carta di credito, cioè ai dati tipici
 * 	   della carta.
 * 
 */

public class CartaDiCredito {

	private int codice;
	private int pin;
	private int codiceSicurezza;
	private int saldo;
	
	
	public void inizializzazione() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il codice di una carta di credito:");
		this.codice = tastiera.nextInt();
		System.out.println("Inserisci il codice di sicurezza");
		this.codiceSicurezza = tastiera.nextInt();
		System.out.println("Inserisci un saldo");
		this.saldo = tastiera.nextInt();
		
		azioni();
		
	}
	
	private void mostraDati() {
		System.out.println("Codice: " + this.codice);
		System.out.println("Pin: " + this.pin);
		System.out.println("CodiceSicurezza: " + this.codiceSicurezza);
		System.out.println("Saldo: " + this.saldo);
	}
	
	private void azioni() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Quali azioni vuoi svolgere sulla tua carta?");
		System.out.println("Prelievo, deposito, mostra dati");
		String risposta = tastiera.nextLine();
		
		if(risposta.equalsIgnoreCase("prelievo")) {
			System.out.println("Inserisci la somma da prelevare");
			int sommaPrelevata = tastiera.nextInt();
			System.out.println("Il tuo saldo attuale è di: " + prelievo(sommaPrelevata));
		} else
			if(risposta.equalsIgnoreCase("deposito")) {
				System.out.println("Inserisci la somma da depositare");
				int sommaDepositata = tastiera.nextInt();
				System.out.println("Il tuo saldo attuale è di:" + deposito(sommaDepositata));
			} else
				if(risposta.equalsIgnoreCase("mostra dati")) {
					mostraDati();
				} else {
					System.out.println("Risposta non valida!");
				}
	}
	
	private int prelievo(int sommaPrelevata) {
		return saldo - sommaPrelevata;
	}
	
	private int deposito(int sommaDepositata) {
		return saldo + sommaDepositata;
	}
	
}
