/*
 * 
 * Costruttori per creare "nuove" situazioni:
 * 
 * TavolaRotonda tr = new TavolaRotonda(n);  //n > 0
 * 
 * Metodi per acquisire informazioni sulla situazione modellata:
 * 
 * 
 * tr.numeroDiCavalieri() : int
 * tr.cavConLaBrocca ()     : int [etichetta, posizione]
 * ....
 * 
 * 
 * Metodo per generare una nuova situazione a partire da una situazione data:
 * 
 * tr.dopoUscitaCav()     : TavolaRotonda
 * 
 * 
 */

public class TavolaRotonda {
  
  private final IntSList cavalieri;
  
  
  public TavolaRotonda( int n ) { // n > 0
    
    cavalieri = range( 1, n);
  }
  
  public TavolaRotonda(IntSList cav) {
   cavalieri = cav; 
  }
  
  public int numeroDiCavalieri() {
    
    return cavalieri.length();
  }
  
  public int cavConLaBrocca() {
    
    return cavalieri.car();
  }
  
  public TavolaRotonda dopoUscitaCav() {
    
    IntSList listaDiUnElemento = IntSList.NULL_INTSLIST.con (cavalieri.car());
    IntSList listaCon2ElementiInMeno = cavalieri.cdr().cd(); 
    
    IntSList nuovaLista = listaCon2ElementiInMeno.append( listaDiUnElemento );
 
  return new TavolaRotonda( nuovaLista );
  }
  
  private static IntSLost range (int m, int n) {
   
    if (m > n) {
     return IntSList.NULL_INTLIST; 
    } else {
     return range(m+1,n).cons(m); 
    }
  }
  
} //class TavolaRotonda





