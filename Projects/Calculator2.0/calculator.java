/*
 * "Calculator" made with Java.
 * Version 2.0
 * You can choose one of the 12 programs.
 * This program is in italian.
 * 
 */


import java.util.Scanner;

public class calculator {

	int rispostaOpzioni;     //answers for the option
	double risposta1;        //answers for the calculations
	double risposta2;		 //answers for the calculations
	double risultato;
	double conversione;
	String option;
	Scanner choise = new Scanner (System.in);
	Scanner choise2 = new Scanner (System.in);
	
	
	public void sum() {	// case 1: returns the sum of two numbers
		
		System.out.println();
		System.out.println("Somma di due numeri");
		System.out.println("Inserisci due numeri:");
		risposta1 = choise2.nextDouble();
		risposta2 = choise2.nextDouble();
		
		risultato = risposta1 + risposta2;
		
		System.out.println();
		System.out.println("Risultato: " + risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
        option = choise.next();
		
		if(option.equals("y")) {
			calculatorTest.main(null);
		}
		
		else 
			if(option.equals("n")) {
				sum();
			}
			else {
				calculatorTest.main(null);
			}
		
		
	}
	
	public void subtraction() {	//case 2: returns the substraction of two numbers
		
		System.out.println();
		System.out.println("Sottrazione di due numeri");
		System.out.println("Inserisci due numeri:");
		risposta1 = choise2.nextDouble();
		risposta2 = choise2.nextDouble();
		
		risultato = risposta1 - risposta2;
		
		System.out.println();
		System.out.println("Risultato: " + risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if(option.equals("y")) {
			calculatorTest.main(null);
		}
		
		else 
			if(option.equals("n")) {
				subtraction();
			}
			else {
				calculatorTest.main(null);
			}
		
	}
	
	public void molt() {	//case 3: returns the moltiplication of two numbers
		
		System.out.println();
		System.out.println("Moltiplicazione fra due numeri");
		System.out.println("Inserisci due numeri:");
		risposta1 = choise2.nextDouble();
		risposta2 = choise2.nextDouble();
		
		risultato = risposta1 * risposta2;
		
		System.out.println();
		System.out.println("Risultato: " + risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if(option.equals("y")) {
			calculatorTest.main(null);
		}
		
		else 
			if(option.equals("n")) {
				molt();
			}
			else {
				calculatorTest.main(null);
			}
	}
	
	public void division() {	//case 4: returns the division of two numbers
		
		System.out.println();
		System.out.println("Divisione fra due numeri");
		System.out.println("Inserisci due numeri:");
		risposta1 = choise2.nextDouble();
		risposta2 = choise2.nextDouble();
		
		risultato = risposta1 / risposta2;
		
		System.out.println();
		System.out.println("Risultato: " + risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if(option.equals("y")) {
			calculatorTest.main(null);
		}
		
		else 
			if(option.equals("n")) {
				division();
			}
			else {
				calculatorTest.main(null);
			}
	}


	public void max() {	//case 5: returns the maximum between two numbers
		
		System.out.println();
		System.out.println("Massimo fra due numeri");
		System.out.println("Inserisci due numeri:");
		risposta1 = choise2.nextDouble();
		risposta2 = choise2.nextDouble();
		
		risultato = Math.max(risposta1, risposta2);
		
		System.out.println();
		System.out.println("Il Maggiore è: " + risultato );
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if(option.equals("y")) {
			calculatorTest.main(null);
		}
		
		else 
			if(option.equals("n")) {
				max();
			}
			else {
				calculatorTest.main(null);
			}
		
	}
		
	public void min() {	//case 6: returns the minimum between two numbers
		
		System.out.println();
		System.out.println("Minimo fra due numeri");
		System.out.println("Inserisci due numeri:");
		risposta1 = choise2.nextDouble();
		risposta2 = choise2.nextDouble();
		
		risultato = Math.min(risposta1, risposta2);
		
		System.out.println();
		System.out.println("Il minore è: " + risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if(option.equals("y")) {
			calculatorTest.main(null);
		}
		
		else 
			if(option.equals("n")) {
				min();
			}
			else {
				calculatorTest.main(null);
			}
		
	}
	
	public void sqrt() {	//case 7: returns the square root of a number
		
		System.out.println();
		System.out.println("Radice quadrata");
		System.out.println("Inserisci un numero:");
		risposta1 = choise2.nextDouble();
		
		risultato = Math.sqrt(risposta1);
		
		System.out.println();
		System.out.println("La radice quadrata è: " + risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if(option.equals("y")) {
			calculatorTest.main(null);
		}
		else 
			if(option.equals("n")) {
				sqrt();
			}
			else {
				calculatorTest.main(null);
			}
	}

	
	public void cos() {	//case 8: return the cos of a number
		
		System.out.println();
		System.out.println("Coseno");
		System.out.println("Inserisci un angolo in gradi:");
		risposta1 = choise2.nextDouble();
		
		conversione = Math.toRadians(risposta1);    //I convert the angle from degrees to radiants 
		
		risultato = Math.cos(conversione);          //cos of the number (in radiants)
		
		
		
		System.out.println();
		System.out.println("Il coseno di " + risposta1 + " è: " + risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if (option.equals("y")) {
			calculatorTest.main(null);
		}
		else
			if(option.equals("n")) {
				cos();
			}
			else {
				calculatorTest.main(null);
			}
	}

	
	public void sin() {	//case 9: returns the sin of a number
		
		System.out.println();
		System.out.println("Seno");
		System.out.println("Inserisci un angolo in gradi");
		risposta1 = choise2.nextDouble();
		
		conversione = Math.toRadians(risposta1);     //I convert the angle from degrees to radiants 
		
		risultato = Math.sin(conversione);           //sin of the number (in radiants)
		
		System.out.println();
		System.out.println("Il Seno di " + risposta1 + " è: " + risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if (option.equals("y")) {
			calculatorTest.main(null);
		}
		else
			if(option.equals("n")) {
				sin();
			}
			else {
				calculatorTest.main(null);
			}
	}
	
	
	public void toRadians() {	//case 10: returns the conversion of the angle from degrees to radians
		
		System.out.println();
		System.out.println("Da gradi a radianti");
		System.out.println("Inserisci un angolo in gradi:");
		risposta1 = choise2.nextDouble();
		
		risultato = Math.toRadians(risposta1);
		
		System.out.println();
		System.out.println(risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if (option.equals("y")) {
			calculatorTest.main(null);
		}
		else
			if(option.equals("n")) {
				toRadians();
			}
			else {
				calculatorTest.main(null);
			}
	}
	
	public void toDegrees() {	//case 11: returns the conversion of an angle from radians to degrees
		
		
		
		System.out.println();
		System.out.println("Da radianti a gradi");
		System.out.println("Inserisci un angolo in radianti:");
		risposta1 = choise2.nextDouble();
		
		risultato = Math.toDegrees(risposta1);
		
		System.out.println();
		System.out.println(risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if (option.equals("y")) {
			calculatorTest.main(null);
		}
		else
			if(option.equals("n")) {
				toDegrees();
			}
			else {
				calculatorTest.main(null);
			}
	}
	
	public void pow() {	//case 12: exponentiation
		
		System.out.println();
		System.out.println("Elevamento a potenza");
		System.out.println("Inserisci il numero da elevare: ");
		risposta1 = choise2.nextDouble();
		System.out.println("Inserisci l'esponente:");
		risposta2 = choise2.nextDouble();
		
		risultato = Math.pow(risposta1, risposta2);
		
		System.out.println();
		System.out.println(risultato);
		
		System.out.println();
		System.out.println("Vuoi tornare alle opzioni? y/n");
		
		option = choise.next();
		
		if (option.equals("y")) {
			calculatorTest.main(null);
		}
		else
			if(option.equals("n")) {
				pow();
			}
			else {
				calculatorTest.main(null);
			}
	}
	
} //class calculator
