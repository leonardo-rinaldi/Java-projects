import java.util.Scanner;

/*
 * 
 * 	2- Scrivere un programma che legga dalla tastiera tre numeri interi non
 * 	   negativi. Visualizzare, quindi, gli interi in ordine crescente.
 * 
 */

public class Maggiore {

	public static void main(String[] args) {
		
		int primoNumero;
		int secondoNumero;
		int terzoNumero;
		
		Scanner numeroInserito = new Scanner(System.in);
		
		System.out.println("Inserire tre numeri interi e verranno restituiti in ordine crescente");
		
		primoNumero = numeroInserito.nextInt();
		secondoNumero = numeroInserito.nextInt();
		terzoNumero = numeroInserito.nextInt();
		
		if ( (primoNumero > secondoNumero) && (secondoNumero > terzoNumero) ) {
			
			System.out.println(primoNumero + " > " + secondoNumero + " > " + terzoNumero);
		}
		else
			if ( (primoNumero > terzoNumero) && (terzoNumero > secondoNumero) ) {
				System.out.println (primoNumero + " > " + terzoNumero + " > " + secondoNumero);
			}
			else
				if ( (secondoNumero > primoNumero) && (primoNumero > terzoNumero) ) {
					System.out.println(secondoNumero + " > " + primoNumero + " > " + terzoNumero);
				}
				else
					if ( (secondoNumero > terzoNumero) && (terzoNumero > primoNumero) ) {
						System.out.println(secondoNumero + " > " + terzoNumero + " > " + primoNumero);
					}
					else
						if( (terzoNumero > secondoNumero) && (secondoNumero > primoNumero) ) {
							System.out.println(terzoNumero + " > " + secondoNumero + " > " + primoNumero);
						}
						else
							if ( (terzoNumero > primoNumero) && (primoNumero > secondoNumero) ) {
								System.out.println(terzoNumero + " > " + primoNumero + " > " + secondoNumero);
							}
							else {
								System.out.println("Errore!");
							}
	}

}
