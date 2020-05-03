import java.util.Scanner;

/* 
 *     Si scriva un programma che determini il resto che deve essere restituito da un
 *     distributore automatico. Un prodotto del distributore automatico può costare
 *     da 25 centesimi a 1 Euro, con incrementi di 5 centesimi (25, 30, 35, ... , 90,
 *     95, 100) e il distributore accetta solo monete da 1 Euro.
 *
 *  1- Ripetere l'esercizio precedente ma includendo il controllo dell'input. Si mostri il 
 *     resto solo se viene inserito un prezzo valido (non meno di 25 centesimi, 
 *     non più di 100 centesimi e con interi multipli di 5 centesimi). Altrimenti, 
 *     si mostri un messaggio d'errore diverso per ciascuno dei seguenti input non 
 *     validi:
 *     
 *     - Prezzo inferiore a 25 centesimi;
 *     - Prezzo che non è un multiplo di 5;
 *     - Prezzo superiore a 1 Euro; 
 * 
 */

public class DistributoreAutomatico {

	public static void main(String[] args) {
		
		int prezzoInserito;
		int numero;
		int cinquantaCent;
		int ventiCent;
		int dieciCent;
		int cinqueCent;
		
		Scanner prezzo = new Scanner(System.in);
		
		System.out.println("Scrivi il prezzo del prodotto");
		System.out.println("(da 25 centesimi con incrementi di  5 centesimi)");
		
		
		numero = prezzo.nextInt();
		
		if (numero < 25) {
			System.out.println("Il numero inserito è minore di 25 Centesimi!");
		}
		else
			if(numero > 100) {
				System.out.println("Il numero è maggiore di 1 euro!");
			}
			else
				if( numero % 5 != 0) { 	//controllo se il numero non è un multiplo di 5
					System.out.println("Il numero non è un multiplo di 5!");
				}
				else {
					
					prezzoInserito = 100 - numero;   
					
					cinquantaCent = prezzoInserito / 50;
					prezzoInserito = prezzoInserito % 50;
					
					ventiCent = prezzoInserito / 20;
					prezzoInserito = prezzoInserito % 20;
					
					dieciCent = prezzoInserito / 10;
					prezzoInserito = prezzoInserito % 10;
					
					cinqueCent = prezzoInserito / 5;
					prezzoInserito = prezzoInserito % 5;
					
					System.out.println(cinquantaCent + " monete da cinquanta centesimi");
					System.out.println(ventiCent + " monete da venti centesimi");
					System.out.println(dieciCent + " monete da dieci centesimi");
					System.out.println(cinqueCent + " monete da cinque centesimi");
				}
		
		
	}

	

}
