import java.util.Scanner;

/*
 * 	5-	Si scriva un programma che legge un elenco di voti ottenuti durante un esame
 * 		come interi da 0 a 30. Si mostri il numero totale di voti e il numero di voti
 * 		in ciascuna delle seguenti categorie: Ottimo (voti 29 e 30), Distinto(voti da 
 * 		26 a 28), Buono (voti da 23 a 25), Discreto (voti da 20 a 22), Sufficiente 
 * 		(voti 18 e 19), Insufficiente (voti da 0 a 17). Si usi un numero negativo
 * 		per indicare la fine dell'inserimento.
 * 
 */

public class ElencoVoti {

	public static void main(String[] args) {
		
		int numeroInserito;
		int voti = 0;
		int ottimo = 0,distinto = 0,buono = 0,discreto = 0,sufficiente = 0, insufficiente = 0;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Scrivi l'elenco di voti ottenuti durante l'esame");
		System.out.println("come interi da 0 a 30");
		System.out.println("Si usi un numero negativo per indicare la fine dell'inserimento.");
		
		numeroInserito = tastiera.nextInt();
		
		while(numeroInserito > 0) {
			voti++;
			
			if(numeroInserito >= 29 && numeroInserito <= 30) {
				ottimo++;
			} else
				if(numeroInserito >= 26 && numeroInserito <= 28) {
					distinto++;
				} else
					if(numeroInserito >= 23 && numeroInserito <= 25) {
						buono++;
					} else
						if(numeroInserito >= 20 && numeroInserito <= 22) {
							discreto++;
						} else
							if(numeroInserito >= 18 && numeroInserito <= 19) {
								sufficiente++;
							} else 
								if(numeroInserito >= 0 && numeroInserito <= 17) {
									insufficiente++;
								}
			
			numeroInserito = tastiera.nextInt();
		}
		
		System.out.println("Numero totale voti: " + voti);
		System.out.println("Numero di ottimi: " + ottimo);
		System.out.println("Numero di distinti " + distinto);
		System.out.println("Numero di buoni " + buono);
		System.out.println("numero di discreti: " + discreto);
		System.out.println("Numero di sufficienti: " + sufficiente);
		System.out.println("numero di insufficienti: " + insufficiente);
	}

}
