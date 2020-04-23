import java.util.Scanner;

/* 
 * 	4- Si scriva un programma che legga un intero di quattro cifre, per esempio 2010,
 *    e quindi lo visualizzi, una cifra per riga:
 *    
 *    2
 *    0
 *    1
 *    0
 * 
 */

public class InteroQuattroCifre {

	public static void main(String[] args) {
		
		int numeroInserito;
		String conversioneStringa;
		
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero di quattro cifre");
		
		numeroInserito = numero.nextInt();
		
		conversioneStringa = Integer.toString(numeroInserito);  //converto un intero in una stringa
		
		System.out.println(conversioneStringa.substring(0, 1));  //stampo la prima lettera
		System.out.println(conversioneStringa.substring(1,2));	//stampo la seconda lettera
		System.out.println(conversioneStringa.substring(2, 3)); //stampo la terza lettera
		System.out.println(conversioneStringa.substring(3));	//stampo la quarta lettera
		
	}

}
