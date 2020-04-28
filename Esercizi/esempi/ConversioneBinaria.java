/*
 *  6- Si scriva un programma che legga dalla tastiera un numero binario di quattro bit
 * 	   sotto forma di stringa e che poi lo converta in un numero decimale. Per esempio,
 * 	   se l'input è 1100, l'output deve essere 12. 
 * 	   Suggerimento: si divida la stringa in sottostringhe e quindi si converta e quindi
 * 	   si converta ciascuna sottostringa in un valore per ciascun bit.
 * 	   Se i bit sono b0, b1, b2 e b3 il numero decimale equivalente potrà esser calcolato
 * 	   con la formula 8 * b0 + 4 * b1 + 2 * b2 + b3. 
 * 
 */

import java.util.Scanner;

public class ConversioneBinaria {

	public static void main(String[] args) {
		
		String numeroBinario;
		int primaCifra;
		int secondaCifra;
		int terzaCifra;
		int quartaCifra;
		int conversioneBinaria;
		
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Inserisci un numero binario di quattro cifre:");
		
		numeroBinario = numero.nextLine();
		
		primaCifra = Integer.valueOf(numeroBinario.substring(0, 1)); //converto una posizione specifica da stringa a numero
		secondaCifra = Integer.valueOf(numeroBinario.substring(1, 2));
		terzaCifra = Integer.valueOf(numeroBinario.substring(2, 3));
		quartaCifra = Integer.valueOf(numeroBinario.substring(3));
		
		conversioneBinaria = (8 * primaCifra + 4 * secondaCifra + 2 * terzaCifra + 1 * quartaCifra);  //conversione binaria 2^3 = 8, 2^2 = 4, 2^1=2, 2^0=1
		
		System.out.println("Il numero " + numeroBinario + " in decimale equivale a: " +conversioneBinaria);

	}

}
