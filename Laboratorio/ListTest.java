
public class ListTest {

	 public static void main(String[] args) {
	     
	      StringSList il = new StringSList();
	      
	     il = il.cons("gatto");
	     il = il.cons("topo");
	  
	   
	     
	     System.out.println( il );
	     System.out.println( il.isNull() );
	     System.out.println( il.reverse() );
	     System.out.println( il.length() );
	   }
}
