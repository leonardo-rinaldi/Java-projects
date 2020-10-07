package Esercizio7;

public class GiàAttivataException extends Exception{

   public GiàAttivataException() {
       super("La carta è già stata attivata");
   }

   public GiàAttivataException(String messaggio) {
       super(messaggio);
   }
}
