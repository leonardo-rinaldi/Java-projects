import java.util.Scanner;

/* 
 * 
 * 	1- Si scriva un programma che legge tre numeri interi e visualizza
 * 	   la media dei tre numeri.
 * 
 */


public class MediaNumeri {

	public static void main(String[] args) {
		
		int numeroUno;
		int numeroDue;
		int numeroTre;
		int media;
		
		Scanner numeroInserito = new Scanner(System.in);
		
		System.out.println("Inserisci tre numeri per eseguire la media");
		
		numeroUno = numeroInserito.nextInt();
		numeroDue = numeroInserito.nextInt();
		numeroTre = numeroInserito.nextInt();
		
		media = ( numeroUno + numeroDue + numeroTre) / 3;
		
		System.out.println("La media dei tre numeri è: " + media);
	}

}
