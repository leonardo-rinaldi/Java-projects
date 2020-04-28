import java.util.Scanner;

/*
 *	6- Scrivere un programma che consenta all'utente di inserire il raggio
 *	   del tubo che costituisce il pozzo in centimetri (un pozzo tipico ha
 *	   ha un raggio di 8 cm) e la profondità del pozzo in metri (si assuma 
 *	   per semplicità che l'acqua occupi l'intera profondità del pozzo, 
 *	   anche se in pratica ciò non è vero. Il programma dovrà stampare il
 *	   numero di litri d'acqua immagazzinati nel tubo.  
 * 
 */

public class VolumeCilindro {

	
	public static double PI = 3.14159;
	
	public static void main(String[] args) {
		
		double raggio;				
		double profondità;
		double conversioneRaggio;  //raggio da cm a metri
		double volume;			
		double conversioneLitri;	//conversione da m^3 a litri
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Inserisci il raggio del pozzo in cm:");
		raggio = numero.nextDouble();
		
		conversioneRaggio = raggio / 100;
		
		System.out.println("Inserisci la profondità in metri: ");
		profondità = numero.nextDouble();
		
		volume = PI * (conversioneRaggio * conversioneRaggio) * profondità;
		
		conversioneLitri = volume * 1000;
		
		System.out.println("Il pozzo contiene: " + conversioneLitri + " litri");
		
	}

}
