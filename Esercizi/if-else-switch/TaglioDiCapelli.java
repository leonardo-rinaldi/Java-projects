import java.util.Scanner;

/* 
 *  9- Si rappresenti un programma contenente una serie di domande per
 *     determinare il taglio di capelli. Si utilizzino degli if anndinati
 *     per risolvere il problema.
 *   
 * 
 */


public class TaglioDiCapelli {

	public static void main(String[] args) {
		
		String risposta;
		
		Scanner rispostaData = new Scanner(System.in);

		System.out.println("Buongiorno, questo programma ti consiglierà il taglio di capelli più adatto a te");
		System.out.println("Basterà rispondere a qualche facile domanda, iniziamo!");
		System.out.println("Uomo o donna?");
		risposta = rispostaData.next();
		
		if(risposta.equalsIgnoreCase("uomo")) {
			System.out.println("Supereroe o supercattivo?");
			risposta = rispostaData.next();
			
			if(risposta.equalsIgnoreCase("supereroe")) {
				System.out.println("Bistecca o sushi?");
				risposta = rispostaData.next();
				
				if(risposta.equalsIgnoreCase("bistecca")) {
					System.out.println("E' consigliato il taglio a spazzola.");
				}
				else 
					if(risposta.equalsIgnoreCase("sushi")) {
					System.out.println("E' consigliato il taglio Pompadour.");
				}
					else {
						System.out.println("Risposta errata!");
					}
				
			}
			else 
				if(risposta.equalsIgnoreCase("supercattivo")) {
					
					System.out.println("E' consigliato il taglio alla moicana.");
				}
				else {
					System.out.println("Risposta errata!");
				}
		}
		else 
			if(risposta.equalsIgnoreCase("donna")) {
				
				System.out.println("Supereroe o supercattivo?");
				risposta = rispostaData.next();
				
				if(risposta.equalsIgnoreCase("Supereroe")) {
					
					System.out.println("Animazione o sitcom?");
					risposta = rispostaData.next();
					
					if(risposta.equalsIgnoreCase("animazione")) {
						
						System.out.println("E' consigliata la frangetta.");
					}
					else 
						if(risposta.equalsIgnoreCase("sitcom")) {
							
							System.out.println("E' consigliato il taglio della maschietta.");
						}
						else {
							System.out.println("Risposta errata!");
						}
				}
				else 
					if(risposta.equalsIgnoreCase("supercattivo")) {
						
						System.out.println("E' consigliato il taglio alla moicana.");
					}
					else {
						System.out.println("Risposta errata!");
					}
			}
			else {
				System.out.println("Risposta errata!");
			}
	}

}
