/*This program, given a string in binary notation, 
* returns a string with the next binary value 
*(sum 1 to the current binary number).
*
*To try this program you can use this examples:
*
*BinaryRepresentation.binSucc("0000") -----> "0001"
*BinaryRepresentation.binSucc("0110") -----> "0111"
*BinaryRepresentation.binSucc("0") -----> "1"
*BinaryRepresentation.binSucc("1") -----> "10" 
*BinaryRepresentation.binSucc("1111") -----> "10000"
*BinaryRepresentation.binSucc("001") -----> "010"
*
*/

public class BinaryRepresentation {
 
  public static String binSucc (String x) {

    
    if (x.equals("1")) {                                         //basic cases
    return "10";
    }
    
   else if (x.equals("0")) {
    return "1";
    }
    
   else if (x.endsWith("0")) {
     return (x.substring(0, x.length() -1) + "1");
   }
   
   else if (x.endsWith("1")) {
     return (binSucc (x.substring(0, x.length() -1)) + "0");     //recursive step
   }
   
   else {
     
      return x;
    }
    
  }
}

