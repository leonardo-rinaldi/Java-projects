import java.util.Scanner;

/*
 * 	16- Si immagini un programma che comprime i file all'80% e li salva su un supporto di memorizzazione.
 * 		Prima che il file compresso venga memorizzato, deve essere diviso in blocchi da 512 byte ciascuno.
 * 		Si sviluppi un algoritmo per questo programma che prima legge il numero di blocchi disponibili sul
 * 		supporto di memorizzazione, quindi legge, in un ciclo, la dimensione non compressa del file, per
 * 		determinare se il file compresso può essere inserito nello spazio rimanente nel supporto di 
 * 		memorizzazione. In caso affermativo, il programma comprime e memorizza il file. Il processo continua
 * 		finchè non incontra un file che supera lo spazio disponibile.
 * 
 *  	Es.
 *  
 *  	Dimensione file non compresso = 1100 byte
 *  	Blocchi disponibili = 1000
 *  	Il file compresso occupa 880 byte, 2 blocchi di memoria
 *  	Lo spazio disponibile rimanente in memoria è di 998 blocchi
 * 
 */

public class CompressioneFile {

	public static void main(String[] args) {
		
		double blocchiDisponibili = 1000;
		double blocchiOccupati = 0;
		double dimensioneFile;
		double dimensioneFileCompresso;
		
		Scanner tastiera = new Scanner(System.in);
		
		do {
			
			System.out.println("Inserisci la dimensione del file in byte:");
			dimensioneFile = tastiera.nextDouble();
			
			dimensioneFileCompresso = dimensioneFile * 0.80;
			blocchiOccupati = dimensioneFileCompresso / 512; 
			
			
			blocchiDisponibili = blocchiDisponibili - blocchiOccupati;
			
			if(blocchiDisponibili < 0) {
				blocchiDisponibili = 0;
				System.out.println("Il file è troppo grande per essere memorizzato in memoria.");
			} else {
				
				System.out.println("Il file compresso pesa: " + dimensioneFileCompresso);
				System.out.println("Il numero di blocchi occupati in memoria dal file sono: " + Math.ceil(blocchiOccupati));	//Math.ceil arrotonda per eccesso il numero
				System.out.println("Il numero di blocchi disponibili in memoria è: " + blocchiDisponibili);
				System.out.println();
			
			}
			
		} while (blocchiDisponibili > 0);
		
		
	}

}
