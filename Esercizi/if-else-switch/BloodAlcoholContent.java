import java.util.Scanner;

/*
 * 	7-	La seguente formula fornisce una stima approssimata del contenuto di
 * 		alcool nel sangue (BAC - Blood Alcohol Content) ed è derivata dalle 
 * 		formule pubblicate dalla National Traffic Safety Administration:
 * 
 * 		BAC = (4.136 X numDrinks X ouncesAlcohol) / (weight)
 * 
 * 		numDrinks è il numero di drink consumati;
 * 
 * 		ouncesAlcohol è il numero di once di Alcool per drink (un'oncia 
 * 		equivale 28.35 g);
 * 
 * 		weight è il peso in libbre della persona che ha consumato i drink
 * 		(una libbra equivale a 454 g).
 * 
 * 		Si noti che questa formula fornisce solo una stima approssimata del
 * 		tasso alcolemico e non include il particolare metabolismo della
 * 		persona che beve, il tempo impiegato nel bere, le differenze di sesso
 * 		ecc. Scrivere un programma che calcola il contenuto di alcool nel sangue
 * 		di una persona che beve Jagerbomb. Si supponga che una Jagerbomb contenga
 * 		0.55 once di alcool. Si scelga il numero di drink e il peso della persona.
 * 		Il programma dovrà indicare se questa persona ha superato o meno il tasso
 * 		alcolemico consentito per poter guidare in italia. 
 * 
 */

public class BloodAlcoholContent {

	public static void main(String[] args) {
		
		int numDrinks;
		double ouncesAlcohol;
		double weight;
		double BAC;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Inserisci il numero di drink consumati:");
		numDrinks = numero.nextInt();
		System.out.println("Inserisci il numero di once di alcool per drink:");
		ouncesAlcohol = numero.nextDouble();
		System.out.println("Inserire il proprio peso in libbre");
		weight = numero.nextDouble();
		
		BAC = (4.136 * numDrinks * ouncesAlcohol) / (weight);
		
		if (BAC <= 0.5 ) {
			System.out.println("Non hai superato il tasso alcolemico");
		} 
			else {
				System.out.println("Hai superato il tasso alcolemico consentito!");
	  }
		
	}

}
