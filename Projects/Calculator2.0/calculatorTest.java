/*
 * "Calculator" made with Java.
 * Version 2.0
 * You can choose one of the 12 programs.
 * This program is in italian.
 * 
 */

import java.util.Scanner;

public class calculatorTest {

public static void main(String[] args) {
		
	calculator calc = new calculator();
	
	int rispostaOpzioni;
	
	Scanner choise = new Scanner (System.in);
	
	
	System.out.println();
	System.out.println("Scegli un opzione di calcolo:");
	System.out.println();
	System.out.println("1: Somma");
	System.out.println("2: Sottrazione");
	System.out.println("3: Moltiplicazione");
	System.out.println("4: Divisione");
	System.out.println("5: Massimo fra due numeri");
	System.out.println("6: Minimo fra due numeri");
	System.out.println("7: Calcola la radice quadrata");
	System.out.println("8: Coseno di un angolo");
	System.out.println("9: Seno di un angolo");
	System.out.println("10: Da gradi a radianti");
	System.out.println("11: Da radianti a gradi"); 
	System.out.println("12: Elevamento a potenza");
	System.out.println();
	
	rispostaOpzioni = choise.nextInt();
	
	switch(rispostaOpzioni) {
	
	case 1: calc.sum();
	break;
	
	case 2: calc.subtraction();
	break;
	
	case 3: calc.molt();
	break;
	
	case 4: calc.division();
	break;
	
	case 5: calc.max();
	break;
	
	case 6: calc.min();
	break;
	
	case 7: calc.sqrt();
	break;
	
	case 8: calc.cos();
	break;
	
	case 9: calc.sin();
	break;
	
	case 10: calc.toRadians();
	break;
	
	case 11: calc.toDegrees();
	break;
	
	case 12: calc.pow();
	break;
	
	default: calculatorTest.main(null);
	
	}
		
	}

	
} //class calculatorTest
