package Esercizio10;

public class ContatoreNegativoException extends Exception{

   public ContatoreNegativoException() {
       super("Errore, numero persone inferiore a 0");
   }

   public ContatoreNegativoException(String messaggio) {
       super(messaggio);
   }
}
