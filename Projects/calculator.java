/*
 * "Calculator" made with Java.
 * You can choose one of the 12 programs.
 * This program is in italian language.
 * 
 */

import java.util.Scanner;

public class calculator {

 int rispostaOpzioni; //answers for the option
 double risposta1; //answers for the calculations
 double risposta2; //answers for the calculations
 double risultato;
 double conversione;
 String option;
 Scanner choise = new Scanner(System. in );
 Scanner choise2 = new Scanner(System. in );

 public static void main(String[] args) {

  calculator x;

  x = new calculator();

  x.calc();

 }

 public void calc() {

  System.out.println();
  System.out.println("Calcolatrice Leo Corp");
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

  switch (rispostaOpzioni) {

  case 1:
   sum();
   break;

  case 2:
   subtraction();
   break;

  case 3:
   molt();
   break;

  case 4:
   division();
   break;

  case 5:
   max();
   break;

  case 6:
   min();
   break;

  case 7:
   sqrt();
   break;

  case 8:
   cos();
   break;

  case 9:
   sin();
   break;

  case 10:
   toRadians();
   break;

  case 11:
   toDegrees();
   break;

  case 12:
   pow();
   break;

  default:
   calc();

  }

 }

 public void sum() { //returns the sum of two numbers
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

  if (option.equals("y")) {
   calc();
  }

  else if (option.equals("n")) {
   sum();
  }
  else {
   System.out.println("Risposta non valida!");
  }
 }

 public void subtraction() { //returns the substraction of two numbers
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

  if (option.equals("y")) {
   calc();
  }

  else if (option.equals("n")) {
   subtraction();
  }
  else {
   System.out.println("Risposta non valida!");
  }
 }

 public void molt() { //returns the moltiplication of two numbers
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

  if (option.equals("y")) {
   calc();
  }

  else if (option.equals("n")) {
   molt();
  }
  else {
   System.out.println("Risposta non valida!");
  }
 }

 public void division() { //returns the division of two numbers
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

  if (option.equals("y")) {
   calc();
  }

  else if (option.equals("n")) {
   division();
  }
  else {
   System.out.println("Risposta non valida!");
  }
 }

 public void max() { //returns the maximum between two numbers
  System.out.println();
  System.out.println("Massimo fra due numeri");
  System.out.println("Inserisci due numeri:");
  risposta1 = choise2.nextDouble();
  risposta2 = choise2.nextDouble();

  risultato = Math.max(risposta1, risposta2);

  System.out.println();
  System.out.println("Il Maggiore è: " + risultato);

  System.out.println();
  System.out.println("Vuoi tornare alle opzioni? y/n");

  option = choise.next();

  if (option.equals("y")) {
   calc();
  }

  else if (option.equals("n")) {
   max();
  }
  else {
   System.out.println("Risposta non valida!");
  }

 }

 public void min() { //returns the minimum between two numbers
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

  if (option.equals("y")) {
   calc();
  }

  else if (option.equals("n")) {
   min();
  }
  else {
   System.out.println("Risposta non valida!");
  }

 }

 public void sqrt() { //returns the square root of a number
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

  if (option.equals("y")) {
   calc();
  }
  else if (option.equals("n")) {
   sqrt();
  }
  else {
   System.out.println("Risposta non valida!");
  }
 }

 public void cos() { //return the cos of a number
  System.out.println();
  System.out.println("Coseno");
  System.out.println("Inserisci un angolo in gradi:");
  risposta1 = choise2.nextDouble();

  conversione = Math.toRadians(risposta1); //I convert the angle from degrees to radiants
  risultato = Math.cos(conversione); //cos of the number (in radiants)

  System.out.println();
  System.out.println("Il coseno di " + risposta1 + " è: " + risultato);

  System.out.println();
  System.out.println("Vuoi tornare alle opzioni? y/n");

  option = choise.next();

  if (option.equals("y")) {
   calc();
  }
  else if (option.equals("n")) {
   cos();
  }
  else {
   System.out.println("Risposta non valida!");
  }
 }

 public void sin() { //returns the sin of a number
  System.out.println();
  System.out.println("Seno");
  System.out.println("Inserisci un angolo in gradi");
  risposta1 = choise2.nextDouble();

  conversione = Math.toRadians(risposta1); //I convert the angle from degrees to radiants
  risultato = Math.sin(conversione); //sin of the number (in radiants)
  System.out.println();
  System.out.println("Il Seno di " + risposta1 + " è: " + risultato);

  System.out.println();
  System.out.println("Vuoi tornare alle opzioni? y/n");

  option = choise.next();

  if (option.equals("y")) {
   calc();
  }
  else if (option.equals("n")) {
   sin();
  }
  else {
   System.out.println("Risposta non valida!");
  }
 }

 public void toRadians() { //returns the conversion of the angle from degrees to radians
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
   calc();
  }
  else if (option.equals("n")) {
   toRadians();
  }
  else {
   System.out.println("Risposta non valida!");
  }
 }

 public void toDegrees() { //returns the conversion of an angle from radians to degrees

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
   calc();
  }
  else if (option.equals("n")) {
   toDegrees();
  }
  else {
   System.out.println("Risposta non valida!");
  }
 }

 public void pow() { //exponentiation
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
   calc();
  }
  else if (option.equals("n")) {
   pow();
  }
  else {
   System.out.println("Risposta non valida!");
  }
 }

} //calculator

