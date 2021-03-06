import java.util.Scanner;

/*
 * 	   E' importante considerare l'effetto dell'espansione termica quando si
 * 	   costruisce una strutturache deve resistere alle variazioni di temperatura.
 * 	   Per esempio, una trave metallica si espande se soggettta ad alte temperature
 *     Le tensioni aggiuntive dovute alla dilatazione termica potrebbero provocare
 *     il cedimento della struttura. Analogamente, un materiale si contrae alle basse
 *     temperature. La variazione lineare della lunghezza di un materiale libero di
 *     espandersi è descritta dalla seguente equazione: 
 *     
 *     L = alpa * L0 * T
 *     
 *     dove L0 è la lunghezza iniziale del materiale in metri, L è la dilatazione in
 *     metri, T è la variazione della temperatura in gradi Celsius e alpha è il
 *     coefficiente di dilatazione lineare.
 *     
 *     Scrivere un programma che riceve in input alpha, L0, T e il nome del materiale;
 *     poi calcola e visualizza il nome del materiale e il valore della dilatazione
 *     lineare. Ecco i valori di alpha per alcuni materiali.
 *     
 *     Alluminio 2.31 * 10^-5   ----->	2,31e-5
 *     Rame      1.70 * 10^-5	----->	1,70e-5
 *     Vetro     8.50 * 10^-6	----->	8,50e-6
 *     Acciaio   1.20 * 10^-5	----->	1,20e-5
 * 
 * 
 * 	6- Riscrivere il programma descritto in modo che, se la dilatazione è positiva, l'output
 * 	   dovrà essere "Il nome del materiale si espande di valore della dilatazione in metri". 
 * 	   Se la dilatazione è negativa, l'output dovrà essere "Il nome del materiale si contrae
 * 	   di valore della dilatazione in metri". Il valore della dilatazione non dovrà essere
 *     rappresentato come un numero negativo.
 * 
 */


public class DilatazioneTermica {

	public static void main(String[] args) {
		
		double lunghezzaIniziale;  		   //L0
		double variazioneTemperatura; 		   //T
		double coefficienteDilatazioneLineare;     //alpha
		double dilatazioneLineare; 		   //L
		String nomeMateriale, conversione;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserire la lunghezza iniziale del materiale in metri:");
		lunghezzaIniziale = tastiera.nextDouble(); //L 
		System.out.println("Inserire la variazione della temperatura in gradi Celsius:");
		variazioneTemperatura = tastiera.nextDouble(); //T 
		System.out.println("Inserire il coefficente di dilatazione lineare del materiale: ");
		coefficienteDilatazioneLineare = tastiera.nextDouble(); //alpha
		System.out.println("Inserire il nome del materiale: ");
		nomeMateriale = tastiera.next(); 
		
		
		dilatazioneLineare = coefficienteDilatazioneLineare * lunghezzaIniziale * variazioneTemperatura; //formula dilatazione lineare

		if (dilatazioneLineare < 0) {
			
			conversione = String.valueOf(dilatazioneLineare);					//elimino il segno meno davanti al numero
			conversione = conversione.substring(1, conversione.length());
			
			System.out.println(nomeMateriale +  " si espande di " + conversione + " metri");
		}
	
		else {
			System.out.println(nomeMateriale + " si espande di " + dilatazioneLineare + " metri");
		}
	}

}
