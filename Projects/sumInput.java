/*
 *Sum of two numbers in input
 */

import java.util.Scanner;

public class sumInput {

 
 public static void main(String[]args ) {
 
  int x;
  int y;
  int z;
  
   System.out.println("Somma di due Numeri");
   System.out.println();
   System.out.println("Inserisci un numero x e y");
   Scanner var1 = new Scanner(System.in);
   Scanner var2 = new Scanner(System.in);
   x = var1.nextInt();
   y = var2.nextInt();
   z= x+y;
   
 
  System.out.println();
  System.out.println("Risultato: " + z);
 }
 }