import java.util.Scanner;

/*
 * 
 * 
 * 2- Si scriva un programma che dimostri la conversione di tipo per valori double, 
 *    effettuando le seguenti attività.
 * 
 * 	-Utilizzare Scanner per leggere un numero in virgola mobile x
 *  	-Convertire x in un valore intero e memorizzare il risultato in y
 *  	-Visualizzare in maniera distinta x e y
 * 	-Convertire x in un valore di tipo byte e memorizzare il risultato in z
 *  	-Visualizzare in maniera distinta x e z
 * 
 * 	
 * 
 */


public class ConversioneDiTipo {

	public static void main(String[] args) {
		
		double virgolaMobile;  //numero x in virgola mobile
		int conversioneIntero;	//numero y
		byte conversioneByte;  //numero z
		
		Scanner numeroInserito = new Scanner(System.in);
		
		System.out.println("Inserisci un numero in virgola mobile.");
		
		virgolaMobile = numeroInserito.nextDouble();
		
		conversioneIntero = (int)virgolaMobile;  //conversione di tipo
		
		System.out.println("x: " + virgolaMobile + " " + "y: " + conversioneIntero);
		
		conversioneByte = (byte)virgolaMobile;
		
		System.out.println("x: " + virgolaMobile + " " + "z: " + conversioneByte );
		
	}

}
