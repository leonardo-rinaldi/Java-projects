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
 *
 *	3- Si ripeta il programma 5 del capitolo 3, ma usando un ciclo in modo che l'utente possa
 *	   convertire più temperature. Se l'utente inserisce una lettera diversa da c o f (maiuscola
 *	   o minuscola), si mostri un messaggio d'errore e si chieda all'utente di inserire un valore
 *	   valido. Non si chieda, tuttavia, di re-inserire la parte numerica della temperatura. Dopo 
 *	   ciascuna conversione si chieda all'utente di scrivere E o e per terminare il programma o di
 *	   premere un qualsiasi altro tasto per ripetere il ciclo ed effetuare un'altra conversione.
 * 
 */

public class ConversioneTemperatura {

	public static void main(String[] args) {
		
		String temperaturaInserita;
		String lettera;
		String risposta;
		double temperatura;
		double gradi_Celsius;
		double gradi_Fahrenheit;
		
		Scanner rispostaInserita = new Scanner(System.in);
		
		do {
			System.out.println("Inserisci una temperatura in Celsius o Fahrenheit");
			
			temperaturaInserita = rispostaInserita.nextLine();
			lettera = temperaturaInserita.substring(temperaturaInserita.length() -1, temperaturaInserita.length()); //leggo l'ultima lettera
			temperatura = Double.valueOf(temperaturaInserita.substring(0, temperaturaInserita.length() - 1)); //leggo la parte numerica
			
			if (lettera.equalsIgnoreCase("c")) { //converto da Celsius a Fahrenheit
				
				gradi_Fahrenheit = ( (9 * temperatura) / 5 + 32);
				System.out.println("Equivalgono a: " + gradi_Fahrenheit + " gradi Fahrenheit");
			}
			else
				if (lettera.equalsIgnoreCase("f")) { //conversione da Fahrenheit a Celsius
					
					gradi_Celsius = ( (5 * (temperatura -32) ) / 9 );
					System.out.println("Equivalgono a: " + gradi_Celsius + " gradi Celsius");
				}
			
			System.out.println("Per continuare premi un tasto qualunque della tastiera");
			System.out.println("Per terminare il programma premi e");
			System.out.println();
			
			risposta = rispostaInserita.nextLine();
			
			
		}while(!risposta.equalsIgnoreCase("e")); //se la risposta è: "e" il ciclo si interrompe

	}

}
