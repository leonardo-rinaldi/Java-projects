/*
 * 
 * 
 */ 

public class GiuseppeFlavio {
 
  public static int ultimo ( int n) {
    
    TavolaRotonda tr = new TavolaRotonda ( n );
    
    while (tr.numeroDiCavalieri() > 1) {
      
      tr = tr.dopoUscitaCav();
    }
    return tr.cavConLaBrocca();
  }
  
  public static int test ( int n, int repeats) {
   
    int j = 0;
    
    long t0 = System.currentTimeMillis(); // start cronometro
    
    for (int i=0; i<repeats; i=i+1) {
      
      j = ultimo(n);
      
  }
    
    long t = System.currentTimeMillis(); //stop cronometro
    
    System.out.println( t-t0 );
    
    return j;
    
  }
  
} //class GiuseppeFlavio
