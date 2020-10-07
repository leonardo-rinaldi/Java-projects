package Esercizio1;

public class OraNonContemplataException extends Exception{

   public OraNonContemplataException() {
       super("Ora sbagliatat");
   }

   public OraNonContemplataException(String messaggio) {
       super(messaggio);
   }
}
