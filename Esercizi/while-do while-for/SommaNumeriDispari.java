/*
 *
 * 	4- Si scriva un programma che computi la somma dei primi n numeri interi positivi dispari.
 * 	   Per esempio, se n fosse uguale a 9, il programma dovrebbe calcolare 1+3+5+7+9.
 * 
 */

public class SommaNumeriDispari {

	public static void main(String[] args) {
		
		int somma = 0;
		int n = 9;
		
		for(int i = 0; i <= n; i++) {
			if(i % 2 != 0) {
				somma = somma + i;
			}
		}
		System.out.println(somma);
	}

}
