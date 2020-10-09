package Esercizio14;

public class MessaggioTroppoLungoException extends Exception{

  public MessaggioTroppoLungoException() {
      super("Messaggio troppo lungo");
  }

  public MessaggioTroppoLungoException(String messaggio) {
      super(messaggio);
  }
}
