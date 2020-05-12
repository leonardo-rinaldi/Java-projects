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
 * 5- Ripetere il programma precedente chiedendo in aggiunta all'utente se è:
 * 
 * 	  a. Sedentario
 *    b. Moderatamente attivo (svolge attività fisica occasionalmente)
 *    c. Attivo (svolge attività fisica 3-4 volte alla settimana)
 *    d. Molto attivo (svolge attività fisica tutti i giorni)
 *    
 *    Se l'utente risponde "Sedentario", si incrementi il valore di MB del 20 percento.
 *    Se risponde "Moderatamente attivo", si incrementi di MB del 30 percento. Se risponde
 *    "Attivo" si incrementi MB del 40 percento. Infine, se l'utente risponde "Molto attivo"
 *    si incrementi MB del 50 percento. Si stampi il numero di barrette di cioccolato
 *    richieste in base al nuovo valore di MB.
 * 
 */


public class ConteggioCalorieAlternativo {

public static int BARRETTA_CIOCCOLATO = 230;
	
	public static void main(String[] args) {
		
		double peso;
		double altezza;
		int età;
		double formulaDonna;
		double formulaUomo;
		double numeroBarretteUomo;
		double numeroBarretteDonna;
		String sesso, attività;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserire il proprio sesso: U = uomo, D = donna");
		sesso = tastiera.next();
		
		System.out.println("Scegli il tuo livello di attività:");
		System.out.println("Sedentario");
		System.out.println("Moderatamente attivo");
		System.out.println("Attivo");
		System.out.println("Molto attivo");
		attività = tastiera.next();
		
		System.out.println("Inserire il proprio peso in kg:");
		peso = tastiera.nextDouble();
		
		System.out.println("Inserire la propria altezza in cm:");
		altezza = tastiera.nextDouble();
		
		System.out.println("Inserire la propria età:");
		età = tastiera.nextInt();
		
		
		switch(attività) {
		
		case "Sedentario": 
			
			if (sesso.equals("U")) {
				
				formulaUomo = 66 + (13.8 * peso) + (5.0 * altezza) - (6.8 * età);
				numeroBarretteUomo = (formulaUomo / BARRETTA_CIOCCOLATO) * 0.20; 
				System.out.println("Barrette consumabili da un uomo: " + numeroBarretteUomo);
			}
			else
				if(sesso.equals("D")) {
					
					formulaDonna = 655 + (9.6 * peso) + (1.8 * altezza) - (4.7 * età);
					numeroBarretteDonna = (formulaDonna / BARRETTA_CIOCCOLATO) * 0.20;
					System.out.println("Barrette consumabili da una donna: " + numeroBarretteDonna);
				}
				else {
					System.out.println("Risposta non valida!");
				}
			break;
			
		case "Moderatamente attivo":
			
			if (sesso.equals("U")) {
				
				formulaUomo = 66 + (13.8 * peso) + (5.0 * altezza) - (6.8 * età);
				numeroBarretteUomo = (formulaUomo / BARRETTA_CIOCCOLATO) * 0.30; 
				System.out.println("Barrette consumabili da un uomo: " + numeroBarretteUomo);
			}
			else
				if(sesso.equals("D")) {
					
					formulaDonna = 655 + (9.6 * peso) + (1.8 * altezza) - (4.7 * età);
					numeroBarretteDonna = (formulaDonna / BARRETTA_CIOCCOLATO) * 0.30;
					System.out.println("Barrette consumabili da una donna: " + numeroBarretteDonna);
				}
				else {
					System.out.println("Risposta non valida!");
				}
			break;
			
		case "Attivo":
			
			if (sesso.equals("U")) {
				
				formulaUomo = 66 + (13.8 * peso) + (5.0 * altezza) - (6.8 * età);
				numeroBarretteUomo = (formulaUomo / BARRETTA_CIOCCOLATO) * 0.40; 
				System.out.println("Barrette consumabili da un uomo: " + numeroBarretteUomo);
			}
			else
				if(sesso.equals("D")) {
					
					formulaDonna = 655 + (9.6 * peso) + (1.8 * altezza) - (4.7 * età);
					numeroBarretteDonna = (formulaDonna / BARRETTA_CIOCCOLATO) * 0.40;
					System.out.println("Barrette consumabili da una donna: " + numeroBarretteDonna);
				}
				else {
					System.out.println("Risposta non valida!");
				}
			break;
			
		case "Molto attivo":
			
			if (sesso.equals("U")) {
				
				formulaUomo = 66 + (13.8 * peso) + (5.0 * altezza) - (6.8 * età);
				numeroBarretteUomo = (formulaUomo / BARRETTA_CIOCCOLATO) * 0.50; 
				System.out.println("Barrette consumabili da un uomo: " + numeroBarretteUomo);
			}
			else
				if(sesso.equals("D")) {
					
					formulaDonna = 655 + (9.6 * peso) + (1.8 * altezza) - (4.7 * età);
					numeroBarretteDonna = (formulaDonna / BARRETTA_CIOCCOLATO) * 0.50;
					System.out.println("Barrette consumabili da una donna: " + numeroBarretteDonna);
				}
				else {
					System.out.println("Risposta non valida!");
				}
			break;
			
			default: 
				System.out.println("Risposta errata!");
			
		}
		
	}

}
