/*
 * calculate the percentage of a number 
 */

import java.util.Scanner;

public class percentage {
 
 public static float perc(float x, float y) {
  
  return (x * y) / 100;
 }

 
 public static void main(String[]args ) {
  
  float g; 
  float h;
  float result;
   
  
  System.out.println("Programma per la percentuale di due numeri.");
  System.out.println();
  System.out.println("Inserisci il totale:");
  
  Scanner var1 = new Scanner(System.in);
  g = var1.nextFloat();
  
  
  
  System.out.println("Inserisci la percentuale:");
  Scanner var2 = new Scanner(System.in);
  h=var2.nextFloat();
  
  result = perc(g, h);
  
  System.out.println();
  System.out.println("Risultato: " + result);
  
 
 }
}
