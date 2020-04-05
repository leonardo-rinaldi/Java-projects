/*
 * Calculate the VAT of a price
 */

import java.util.Scanner;

public class iva {

 
 public static float calcIva(float x, float y) {

        float z = (x * y) / 100;

        float h = x + z;

        return h;
    }

 public static void main(String[] args) {

     
      
         float g;
         float j;
         float result;   
         

         System.out.println("Calcolo IVA");
         System.out.println("");
         System.out.println("Prezzo senza IVA: ");

         Scanner var1 = new Scanner(System.in);
         g = var1.nextFloat();

         System.out.println("% IVA:");
         Scanner var2 = new Scanner(System.in);
         j = var2.nextFloat();

         result = calcIva(g, j);

         System.out.println();
         System.out.println("Prezzo con IVA: " + result);
          
     
    }
     
  }
     
     
      
     
      
      
     
    

    


