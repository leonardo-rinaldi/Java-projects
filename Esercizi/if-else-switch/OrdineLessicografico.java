import java.util.Scanner;

/* 	
 * 	3- Scrivere un programma che legga dalla tastiera tre stringhe. Visualizzare,
 * 	   quindi la stringa che risulta essere la seconda in ordine lessicografico.	
 */

public class OrdineLessicografico {

	public static void main(String[] args) {
		
		String primaStringa; //s1
		String secondaStringa; //s2
		String terzaStringa; //s3
		
		Scanner stringaInserita = new Scanner(System.in);

		System.out.println("Inserire tre stringe");
		
		primaStringa = stringaInserita.nextLine();
		secondaStringa = stringaInserita.nextLine();
		terzaStringa = stringaInserita.nextLine();
		
		if (primaStringa.compareTo(secondaStringa) < 0 && secondaStringa.compareTo(terzaStringa) < 0) { //se s1 s2 s3
			System.out.println(secondaStringa);
		}
		else
			if (secondaStringa.compareTo(primaStringa) < 0 && primaStringa.compareTo(terzaStringa) < 0 ) { //se s2 s1 s3
				System.out.println(primaStringa);
			}
			else
				if (primaStringa.compareTo(terzaStringa) < 0 && terzaStringa.compareTo(secondaStringa) <0 ) { //se s1 s3 s2
					System.out.println(terzaStringa);
				}
				else
					if (terzaStringa.compareTo(primaStringa) < 0 && primaStringa.compareTo(secondaStringa) <0 ) { //se s3 s1 s2
						System.out.println(primaStringa);
					}
					else
						if (terzaStringa.compareTo(secondaStringa) < 0 && secondaStringa.compareTo(primaStringa) <0 ) { //se s3 s3 s1
							System.out.println(secondaStringa);
						}
						else
							if (secondaStringa.compareTo(terzaStringa) < 0 && terzaStringa.compareTo(primaStringa) < 0) { //se s2 s3 s1
								System.out.println(terzaStringa);
							}
							else {
								System.out.println("Errore");
							}
		
		
	}

}
