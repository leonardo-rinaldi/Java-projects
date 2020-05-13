import java.util.Scanner;

/*
 * 	   L'equazione di Harris-Benedict stima il numero di calorie richieste dal corpo umano
 * 	   per mantenere costante il peso se non si svolge attività fisica. Tale valore è detto
 * 	   metabolismo basale o MB.
 * 		
 * 	   Le calorie necesarie a una donna per mantenere il suo peso sono date da:
 * 
 * 	   MB = 665 + (9.6 * peso in kg) + (1.8 * altezza in cm) - (4.7 * età in anni)
 * 
 * 	   Le calorie necessarie a un uomo sono date invece da:
 * 
 *     MB = 66 + (13.8 * peso in kg) + (5.0 * altezza in cm) - (6.8 * età in anni)
 *    
 *     Una barretta di cioccolato contiene circa 230 calorie. Scrivere un programma
 *     che consenta all'utente di inserire il proprio perso in kg, la propria altezza
 *     in cm e la propria età. Il programma dovrà stampare il numero di barrette di 
 *     cioccolato che si dovrebbero consumare per mantenere il proprio peso sia nel 
 *     caso di un uomo che di una donna con i valori specificati di peso, altezza ed
 *     età.
 * 
 * 
 * 	4- Riscrivere il programma per il conteggio delle calorie descritto nell'esercizio precedente. 
 *     Questa volta, si chieda all'utente di inserire la stringa "U" se è un uomo
 * 	   e "D" se è una donna. Si utilizzi quindi per il calcolo delle calorie necessarie, solo 
 * 	   la formula per gli uomini nel caso l'utente inserisca "U" e solo quella per le donne nel
 * 	   caso inserisca "D". Si stampi come nel caso precedente il numero di barette di cioccolato
 *     richieste.
 * 
 * 
 */

public class ConteggioCalorie {


	public static int BARRETTA_CIOCCOLATO = 230;
	
	public static void main(String[] args) {
		
		double peso;
		double altezza;
		int età;
		double formulaDonna;
		double formulaUomo;
		double numeroBarretteUomo;
		double numeroBarretteDonna;
		String sesso;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserire il proprio sesso: U = uomo, D = donna");
		sesso = tastiera.next();
		System.out.println("Inserire il proprio peso in kg:");
		peso = tastiera.nextDouble();
		System.out.println("Inserire la propria altezza in cm:");
		altezza = tastiera.nextDouble();
		System.out.println("Inserire la propria età:");
		età = tastiera.nextInt();
		
		
		if (sesso.equals("U")) {
			
			formulaUomo = 66 + (13.8 * peso) + (5.0 * altezza) - (6.8 * età);
			numeroBarretteUomo = formulaUomo / BARRETTA_CIOCCOLATO; 
			System.out.println("Barrette consumabili da un uomo: " + numeroBarretteUomo);
		}
		else
			if(sesso.equals("D")) {
				
				formulaDonna = 655 + (9.6 * peso) + (1.8 * altezza) - (4.7 * età);
				numeroBarretteDonna = formulaDonna / BARRETTA_CIOCCOLATO;
				System.out.println("Barrette consumabili da una donna: " + numeroBarretteDonna);
			}
			else {
				System.out.println("Risposta non valida!");
			}
		
		
		
		
		
		
		
		
		

	}

}
