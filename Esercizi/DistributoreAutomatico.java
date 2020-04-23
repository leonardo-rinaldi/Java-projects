import java.util.Scanner;

/*  
 *  5- Si scriva un programma che determini il resto che deve essere restituito da un
 *     distributore automatico. Un prodotto del distributore automatico può costare
 *     da 25 centesimi a 1 Euro, con incrementi di 5 centesimi (25, 30, 35, ... , 90,
 *     95, 100) e il distributore accetta solo monete da 1 Euro.
 * 
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
