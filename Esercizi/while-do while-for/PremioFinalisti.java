/*
 * 	7- Si hanno a disposizione tre premi da assegnare in un gruppo di dieci finalisti,
 * 	   ai quali sono stati associati i numeri da 1 a 10. Scrivere un programma che scelga
 * 	   in modo casuale i numeri dei tre finalisti che riceveranno un premio. Si faccia
 * 	   attenzione a non sorteggiare lo stesso numero più volte. Per esempio, l'estrazione 
 * 	   dei finalisti 3, 6, 2 sarebbe valida, ma quella di 3, 3, 11 no perchè il finalista
 * 	   numero 3 compare due volte e inoltre 11 non è un numero valido per un finalista.
 * 
 */

public class PremioFinalisti {

	public static void main(String[] args) {
		
		System.out.println("I tre finalisti sono: ");
		int primoNumero;
		int secondoNumero;
		int terzoNumero;
		
		
		do {
			
			primoNumero = (int) (Math.random() * 10) + 1;
			secondoNumero = (int) (Math.random() * 10) + 1;
			terzoNumero = (int) (Math.random() * 10) + 1;
		
		}while(primoNumero == secondoNumero || secondoNumero == terzoNumero || primoNumero == terzoNumero); //quando trova due numeri uguali si ferma
		
		
		
		System.out.println(primoNumero + " " + secondoNumero + " " + terzoNumero);
		
		

}
}
