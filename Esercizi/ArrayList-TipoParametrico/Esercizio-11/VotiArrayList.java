import java.util.ArrayList;
import java.util.Scanner;

/*
 *	11- Scrivere un programma che consente all'utente di inserire un numero
 *		arbitrario di voti (numeri interi) dalla tastiera. Ogni voto dovrà
 *		essere aggiunto a un ArrayList. L'immissione dei voti dovrà 
 *		interrompersi quando l'utente digita -1. Il programma dovrà analizzare
 *		il contenuto dell'arrayList al fine di calcolare il voto medio e 
 *		visualizzarlo insieme ai voti minimo e massimo.
 *	
 */

public class VotiArrayList {

	private ArrayList<Integer> voti;
	
	public void InserisciVoti() {
		Scanner tastiera = new Scanner(System.in);
		int votoInserito;
		voti = new ArrayList<Integer>();
		
		do {
			System.out.println("Inserisci un numero arbitrario di voti");
			System.out.println("Quando hai finito inserisci -1 ");
			votoInserito = tastiera.nextInt();
			
			if(votoInserito >= 0) {
				voti.add(votoInserito);
			}
			
		} while(votoInserito > 0);
	}
	
	public int calcolaVotoMedio() {
		int sommaVoto = 0;
		
		for(int i = 0; i < voti.size(); i++) {
			sommaVoto = sommaVoto + voti.get(i);
		}
		return sommaVoto / voti.size();
	}
	
	public int votoMassimo() {
		int votoMassimo = 0;
		
		for(int i = 0; i < voti.size(); i++) {
			if(voti.get(i) > votoMassimo) {
				votoMassimo = voti.get(i);
			} else {
				continue;
			}
		}
		return votoMassimo;
	}
	
	public int votoMinimo() {
		int votoMinimo = voti.get(0);
		
		for(int i = 0; i < voti.size(); i++) {
			if(voti.get(i) < votoMinimo) {
				votoMinimo = voti.get(i);
			} else {
				continue;
			}
		}
		return votoMinimo;
	}
}
