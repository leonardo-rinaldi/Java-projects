import java.util.Scanner;

/* 
 * 	2- Scrivere un frammento di codice che cambi il valore intero memorizzato
 * 	   nella variabile x nel seguente modo: se x è pari, deve essere diviso
 * 	   per 2; se è dispari deve essere moltiplicato per 3 e gli deve essere 
 * 	   sottratto 1.
 */

public class CambioValore {

	public static void main(String[] args) {
		
		int x;
		
		Scanner numero = new Scanner(System.in);
		System.out.println("Inserisci un numero intero pari o dispari:");
		x = numero.nextInt();
		
		if (x % 2 == 0) {   //se x è pari
			x= x/2;
			System.out.println("x è pari, il suo nuvo valore è: " + x);
		}
		else {		//altrimenti se x è dispari
			x=x*3;
			System.out.println("x è dispari, il suo nuovo valore è: " + x);
		}
	}

}
