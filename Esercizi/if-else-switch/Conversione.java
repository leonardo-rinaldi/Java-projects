import java.util.Scanner;

/*
 * 	5- Scrivere un programma che permetta all'utente di convertire una temperatura
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
 */

public class Conversione {

	public static void main(String[] args) {
		
		String temperaturaInserita;
		String lettera;
		double temperatura;
		double gradi_Celsius;
		double gradi_Fahrenheit;
		
		Scanner numero = new Scanner(System.in);
		System.out.println("Inserisci una temperatura in Celsius o Fahrenheit");
		
		temperaturaInserita = numero.nextLine();
		lettera = temperaturaInserita.substring(temperaturaInserita.length() -1, temperaturaInserita.length()); //leggo l'ultima lettera
		temperatura = Double.valueOf(temperaturaInserita.substring(0, temperaturaInserita.length() - 1)); //leggo la parte numerica
		
		if (lettera.equals("c") || lettera.equals("C")) { //converto da Celsius a Fahrenheit
			
			gradi_Fahrenheit = ( (9 * temperatura) / 5 + 32);
			System.out.println("Equivalgono a: " + gradi_Fahrenheit + " gradi Fahrenheit");
		}
		else
			if (lettera.equals("f") || lettera.equals("F")) { //conversione da Fahrenheit a Celsius
				
				gradi_Celsius = ( (5 * (temperatura -32) ) / 9 );
				System.out.println("Equivalgono a: " + gradi_Celsius + " gradi Celsius");
			}
		
		
		
		
	}

}
