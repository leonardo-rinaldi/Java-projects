//quarta lezione java

//nome dei mattoni fondamentali in scheme:
//lista vuota: null
//accedere al primo elemento della lista: car
//accedere agli altri elementi: cdr
//sapere se una lista è vuota: null?
//dato un elemento e una lista costruisce una lista più grande: cons

//in java non esiste il concetto della lista vuota, dobbiamo crearlo
//costruttore: elemento per costruire un oggetto nuovo, si usa new


//esempio protocollo:
//qui sotto il. si riferisce alla lista

// IntSList il = new IntSList()   //null
// il.isNull() : boolean         //null?
// il.car() : int                //car
// il.cdr() : IntSList           //cdr
// il.cons(n) : IntSList         //cons

/* Esempi:
 * 
 * (new IntSList() ).cons ( 5 ) --> (5) mi restituisce l'unico elemento che è 5
 * 
 * oppure:
 * 
 * IntSList il = new IntSList();
 * il.isNull()  --> true  li chiedo subito dopo aver creato la lista se è vuota
 * 
 * il = il.cons(5);
 * il.isNull() --> false  perchè ha l'elemento 5 dentro
 * 
 * il --> (5)
 * 
 * il = il.cons(4);
 * 
 * il --> (4 5)
 * 
 * 
 * comandi scheme:
 * 
 * length  ---> lunghezza 
 * list-ref ----> elemento in una data posizionde della lista
 * equal?
 * append
 * rever ----> rovesciamento della lista
 * 
 * li mettiamo nella forma della programmazione orientata agli oggetti:
 * 
 * il.length() : int (sono interi)
 * il.listRef(i) : int 
 * il.equal(cl)  : boolean
 * il.append(cl) : IntSList (lista di interi)
 * il.reverse()  : IntSList
 * 
 */

public class IntSList{
  
  public static final IntSList NULL_INTLIST = new IntSList();
    
  
  private final boolean empty;   //con final abbiamo creato degli oggetti non modificabili, immutabili
  private final int first;
  private final IntSList rest;  //resto della lista
  
  
  public IntSList() {  //definizione costruttore
  
    empty = true;
    first = 0;
    rest = null;   //in java significa nessun oggetto
  }  
  
  public IntSList( int f, IntSList r ) {
  
     
    empty = false;
    first = f;
    rest = r;
  }
  
  public boolean isNull() {   //quando definisco un protocollo è pubblico e non si usa static
  
    return empty;
  }  
  
  public int car() {  //int = intero
  
    return first;
  }         
  
  public IntSList cdr() {
  
    return rest;
  }
  
  public IntSList cons( int n ) {
  
    return ( new IntSList(n, this) ); //this fa riferimento alla lista che stai utilizzando tramite la classe che hai creato
  }
  
  public int length() {
    
    if (isNull() ) {  //potevo scrivere anche this.isNull
      return 0;
    } else {
       return (1 +  cdr().length() );  //potevo scrivere anche this.cdr
    }
  
  public int listRef( int i ) {
    
    if ( i == 0 ) {
     return car(); 
    } else {
     return ( cdr().listRef(i-1) ); 
    }
    
  }
  
  public boolean equals(IntSList cl) {
    
    if ( isNull() ) {
    return ( cl.isNull() );
    } else if ( cl.isNull() ) {
      return false;
    } else if ( car() == cl.car() ) {
      return ( cdr().equals(cl.cdr()) );
    } else {
      return false;
  }
 }
  
  public IntSList append( IntSList ql) {
    
    if ( isNull() ) {
      return q1;
    } else {
    return ( cdr().append(q1)).cons(car()) );
  }
}
  
  public IntSList reverse() {
    
   return reverseRec( NULL_INTLIST );
  }
  
  private IntSList reverseRec( IntSList rl) {
    
    if ( isNull() {
      return rl;
    } else {
    return (reverseRec cdr().reverseRec( rl.cons(car())) );
    }
  }
  
  public String toString(){  //lo trasforma in stringa, lo restituisce in forma stringa
  
    if ( empty ) {
      return "()" ;
    } else if ( rest.isNull() ) {
      return "(" + first + ")";
    } else {
      String rep = "(" + first;
      IntSList r = rest;
      while ( !r.isNull() ) {
        rep = rep + ", " + r.car();
        r = r.cdr();
      }
      return ( rep + ")" );
  }
 
  }
  
  
} // class IntSList











