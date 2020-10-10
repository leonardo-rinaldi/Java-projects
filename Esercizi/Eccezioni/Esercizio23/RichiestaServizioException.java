package Esercizio23;

public class RichiestaServizioException extends Exception{

   public RichiestaServizioException() {
       super("Nome non presente nella lista");
   }

   public RichiestaServizioException(String messaggio) {
       super(messaggio);
   }
}
