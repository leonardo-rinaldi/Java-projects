import java.util.Scanner;

/*
 * 
 * 	14- Si supponga di lavorare in un'azienda che produce bibite. L'azienda vuole conoscere
 * 		il costo ottimale per un contenitore cilindrico che contiene un certo volume di bibita.
 * 		Si scriva un frammento di codice che utilizza un ciclo del tipo chiedi-prima-di-iterare.
 * 		Durante ogni interazione del ciclo, il codice deve chiedere all'utente di inserire il 
 * 		volume e il raggio del cilindro; quindi deve calcolare e visualizzare l'altezza e il prezzo
 * 		del contenitore. Si utilizzi la formula seguente, in cui V rappresenta il volume, r il raggio,
 * 		h l'altezza e c il prezzo.
 * 
 *  	h = V / (PI * r^2)
 *  	C = 2 * PI * r * (r + h)	
 * 
 */

public class VolumeCilindro {

	public static void main(String[] args) {
		
		double volumeCilindro;
		double raggioCilindro;
		double prezzoLattina;
		double altezzaLattina;
		String risposta;
		
		Scanner tastiera = new Scanner(System.in);
		
		do {
			
			System.out.println("Inserisci il volume del cilindro:");
			volumeCilindro = tastiera.nextDouble();
			System.out.println("Inserisci il volume del raggio:");
			raggioCilindro = tastiera.nextDouble();
				
			altezzaLattina = volumeCilindro / (Math.PI * (raggioCilindro * raggioCilindro));
			prezzoLattina = 2 * Math.PI * raggioCilindro * (raggioCilindro + altezzaLattina);	
			
			System.out.println("L'altezza della lattina è: " + altezzaLattina);
			System.out.println("Il prezzo della lattina è: " + prezzoLattina);
			
			System.out.println();
			System.out.println("Desideri continuare con un'altro calcolo?");
			System.out.println("Rispondi si oppure no");
			risposta = tastiera.next();
			
		} while(risposta.equalsIgnoreCase("si"));
	}

}
