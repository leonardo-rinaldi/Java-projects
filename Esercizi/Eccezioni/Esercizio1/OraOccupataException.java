package Esercizio1;

public class OraOccupataException extends Exception {

  public OraOccupataException() {
      super("Quest'ora è già occupata");
  }

  public OraOccupataException(String messaggio) {
      super(messaggio);
  }

}
