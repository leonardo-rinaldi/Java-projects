package metodi;

import java.util.Scanner;

/*
 * 	14- Si realizzi una classe Java che definisce:
 * 
 * 		a. il metodo areaRettangolo che calcola e restituisce l'area di un
 * 		   rettangolo date la base e l'altezza. La base e l'altezza sono di 
 * 		   tipo int così come l'area calcolata e restituita;
 * 
 * 		b. il metodo areaQuadrato che accetta in ingresso il alto e sfrutta il
 * 		   metodo areaRettangolo per calcolare l'area del quadrato. L'area 
 * 		   calcolata viene restituita. Sia il lato che l'area calcolata e
 * 		   restituita sono di tipo int;
 * 
 * 		c. il metodo main che chiede all'utente un valore per la base e uno
 * 		   per l'altezza e stampa a video il ritorno dell'invocazione al metodo
 * 		   areaRettangolo. Chiede infine il lato di un quadrato e stampa a video 
 * 		   il ritorno dell'invocazione al metodo areaRettangolo. Chiede infine
 * 		   all'utente il lato di un quadrato e stampa a video il ritorno 
 * 		   dell'invocazione al metodo areaQuadrato.
 * 
 */

public class Area {
	
	public static void main(String[] args) {
		
		int valoreBase;
		int valoreAltezza;
		int valoreLato;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Calcolo dell'area di un rettangolo");
		System.out.println("Inserisci il valore della base:");
		valoreBase = tastiera.nextInt();
		System.out.println("Inserisci il valore dell'altezza");
		valoreAltezza = tastiera.nextInt();
		System.out.println(areaRettangolo(valoreBase, valoreAltezza));
		
		System.out.println();
		System.out.println("Calcolo dell'area di un quadrato");
		System.out.println("Inserisci il valore del lato:");
		valoreLato = tastiera.nextInt();
		System.out.println(areaQuadrato(valoreLato));
	}

	public static int areaRettangolo(int base, int altezza) {
		
		return base * altezza;
		
	}
	
	public static int areaQuadrato( int lato) {
		
		return areaRettangolo(lato, lato);
		
	}
	
}
