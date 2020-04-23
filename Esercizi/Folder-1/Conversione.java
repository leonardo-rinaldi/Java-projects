import java.util.Scanner;

/*
 * 	
 * 
 * 	1- Si scriva un programma che converta la temperatura da Fahrenheit a Celsius
 * 	   utilizzando la formula gradiCelsius = 5 * ( gradiFahrenheit - 32 ).
 * 		Si chieda all'utente di digitare una temperatura in gradi Gahrenheit come
 * 		iintero. La temperatura deve essere visualizzata in Celsius con un numero 
 * 		in virgola mobile con una precisione di un decimo di grado. 
 * 
 * 
 */


public class Conversione {

	public static void main(String[] args) {
		
	int gradiFahrenheit;
	double conversioneDouble;
	double gradiCelsius;
	
	Scanner temperatura = new Scanner(System.in);
	
	System.out.println("Inserire una temperatura in Fahrenheit:");
	
	gradiFahrenheit = temperatura.nextInt();
	
	conversioneDouble = (double)gradiFahrenheit;
	
	gradiCelsius = 5 * (gradiFahrenheit - 32) / 9; 
	
	System.out.printf(gradiFahrenheit + " gradi Fahrenheit corrispondono a: %2.1f gradi Celsius", gradiCelsius); 
																												
	}

}
