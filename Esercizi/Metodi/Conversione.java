package metodi;

import java.util.Scanner;

/*
 * 	CAPITOLO 5
 * 
 *	   Scrivere un programma che permetta all'utente di convertire una temperatura
 * 	   fornita in gradi da Celsius a Fahrenheit e viceversa. Usare le seguenti formule:
 *	   gradi_Celsius = 5 (gradi_Fahrenheit) / 9
 *	   gradi_Fahrenheit = (9 (gradi_Celsius) / 5) + 32
 *
 *	   Si chieda all'utente di scrivere una temperatura e una lettera. La lettera C o c
 *	   indica che il valore è in gradi Celsius, la lettera F o f in Fahrenheit. Si converta
 *	   la temperatura in gradi Fahrenheit se si inseriscono i Celsius e viceversa. Se vengono
 *	   digitate lettere diverse da C, c, F o f, si mostri un messaggio di errore e si termini 
 *	   il programma.
 * 	
 * 	3- Si ripeta il programma precedente ma realizzando due metodi che rispettivamente convertono 
 * 	   in gradi Celsius una temperatura fornita in gradi Fahrenheit e viceversa. 
 * 
 */

public class Conversione {
	
	public static void main(String[] args) {
		
		String temperaturaInserita;
		String lettera;
		double temperatura;
		double temperaturaFahrenheit;
		double temperaturaCelsius;
		
		Scanner numero = new Scanner(System.in);
		System.out.println("Inserisci una temperatura in Celsius o Fahrenheit");
		
		temperaturaInserita = numero.nextLine();
		lettera = temperaturaInserita.substring(temperaturaInserita.length() -1, temperaturaInserita.length()); //leggo l'ultima lettera
		temperatura = Double.valueOf(temperaturaInserita.substring(0, temperaturaInserita.length() - 1)); //leggo la parte numerica
		
		if (lettera.equalsIgnoreCase("c")) { //converto da Celsius a Fahrenheit
			
			temperaturaFahrenheit = Fahrenheit(temperatura);
			System.out.println("Equivalgono a: " + temperaturaFahrenheit + " gradi Fahrenheit");
			
		}
		else
			if (lettera.equalsIgnoreCase("f")) { //conversione da Fahrenheit a Celsius
				
				temperaturaCelsius = Celsius(temperatura);
				System.out.println("Equivalgono a: " + temperaturaCelsius + " gradi Celsius");
			}
		
	}
	
	public static double Celsius(double temperaturaFahrenheit) {
		
		return ( (5 * (temperaturaFahrenheit -32) ) / 9 );
	}
	
	public static double Fahrenheit(double temperaturaCelsius) {
		
		return ( (9 * temperaturaCelsius) / 5 + 32);
	}
}
