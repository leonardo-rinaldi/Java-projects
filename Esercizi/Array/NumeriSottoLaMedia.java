import java.util.Scanner;

/*
 * 	1- Scrivere un programma in una classe NumeriSottoLaMedia che conti il numero di giorni
 * 	   in cui la temperatura è al di sotto della media. Leggere 10 temperature da tastiera
 * 	   e memorizzarle in un array. Calcolare la temperatura media e contare e visualizzare 
 * 	   il numero di giorni in cui la temperatura è al di sotto della media.
 * 
 */

public class NumeriSottoLaMedia {

	public static void main(String[] args) {
		
		int [] temperatura = new int[10];
		int temperaturaMedia = 0;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci 10 temperature:");
		
		for(int i = 0; i < temperatura.length; i++) {
			
			temperatura[i] = tastiera.nextInt();
			temperaturaMedia = (temperaturaMedia + temperatura[i]) / temperatura.length ;
			
		}
		System.out.println(temperaturaMedia);
		sottoLaMedia(temperatura, temperaturaMedia);
			
	}
	
	public static void sottoLaMedia(int[] temperatura, int temperaturaMedia) {
		
		int numeroGiorni = 0;
		
		for(int i = 0; i < temperatura.length; i++) {
			
			if(temperatura[i] < temperaturaMedia) {
				numeroGiorni++;
			} else {
				continue;
			}
		}
		
		System.out.println("La temperatura è stata sotto la media per " + numeroGiorni + " giorni.");
		
	}

}
