//test di oggetti di tipo IntSList

public class ListTest {
 
  public static void test () {  
  
    IntSList il = new IntSList();
    il = il.cons(5);
    il = il.cons(4);
 
  
    
    System.out.println( il );
  }
  
}

