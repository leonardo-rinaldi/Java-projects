import java.util.Scanner;

/* 
 * 	3- Si scriva un programma che dimostri le funzionalità dell'operatore %
 * 	   effetuando le seguenti attività.
 * 
 * 	- Utilizzare Scanner per leggere un numero in virgola mobile x.
 * 	- Calcolare x % 2.0 e memorizzare il risultato in y.
 * 	- Visualizzare in maniera distinta x e y.
 * 	- Effettuare una conversione di tipo di x in un valore int e memorizzare il risultato in z.
 * 	- Visualizzare in maniera distinta x, z e z % 2 oppurtunamente etichettati.
 * 
 */



public class Operatore {

	public static void main(String[] args) {
		
		double virgolaMobile; 	//numero x
		double resto; 			//numero y
		int conversioneIntero;  //numero z
		double secondoResto;    //x % 2
		
		Scanner numeroInserito = new Scanner(System.in);
		
		System.out.println("Inserisci un numero in virgola mobile.");
		
		virgolaMobile = numeroInserito.nextDouble();
		
		resto = virgolaMobile % 2.0;
		
		System.out.println("x: " + virgolaMobile + " " + "y: " + resto);
		
		conversioneIntero =  (int)virgolaMobile;
		
		secondoResto = conversioneIntero % 2;
		
		System.out.println("x: " + virgolaMobile);
		System.out.println("z: " + conversioneIntero);
		System.out.println("x % 2: " + secondoResto);
		
	}

}
