/* This program with 3 words in input (subject, verb and complement),  
 * returns a sentence with the right articles for the subject and the complement.
 * It also conjugates the verb.
 * 
 * Originally this program was written with Scheme for an exercise at university, 
 * but i rewrote it with Java to exercise me with this language.
 * 
 * To try this program you can use this examples:
 * 
 * 
 * sentence.Frase("gatto", "cacciare" , "topi") -----> "il gatto caccia i topi"
 * sentence.Frase("mucca" , "mangiare" , "fieno") -----> "la mucca mangia il fieno"
 * sentence.Frase("mamma", "chiamare" , "figlie") -----> "la mamma chiama le figlie"
 */


public class sentence {


//adds the article

 public static String articoli(final String x) {          

  final String strA = x.substring(0, x.length());

  if (x.endsWith("i")) {

   return ("i " + strA);
  } else if (x.endsWith("o")) {

   return ("il " + strA);
  } else if (x.endsWith("a")) {

   return ("la " + strA);
   
  } else if (x.endsWith("e")) {
   return ("le " + strA);
   
  } else {

   return x;
  }
 }

 //conjugate the verb

 public static String verbo(final String y, final String z) {                    


  final String strV = z.substring(0, z.length() - 3);

  if (y.endsWith("o")) {

   return (strV + "a");
   
  } else if (y.endsWith("a")) {
   return (strV + "a");
   
  } else if (y.endsWith("eri")) {
   return (strV + "ono");
   
  } else if (y.endsWith("i")) {
   return (strV + "ano");
   
  } else if (y.endsWith("e")) {
   return (strV + "ono");
   
  } else if (y.endsWith("co")) {
   return (strV + "e");
   
  } else {
   return z;
  }
 }

//compose the sentence

 public static String frase(final String t, final String y, final String z) {             

  final String h = articoli(t) + " " + verbo(t, y) + " " + articoli(z);

  return h;
 }


} //public class
