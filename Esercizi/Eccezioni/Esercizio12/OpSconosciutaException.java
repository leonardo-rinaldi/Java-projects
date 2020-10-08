package Esercizio12;

public class OpSconosciutaException extends Exception {

   public OpSconosciutaException() {
      super("opSconosciutaException");
   }

   public OpSconosciutaException(char op) {
       super(op + " è un operatore sconosciuto.");
   }

   public OpSconosciutaException(String messaggio) {
       super(messaggio);
   }
}
