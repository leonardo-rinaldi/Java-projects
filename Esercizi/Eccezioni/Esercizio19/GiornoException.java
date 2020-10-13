package Esercizio19;

public class GiornoException extends Exception{

    public GiornoException() {
        super("Giorno errato!");
    }

    public GiornoException(String messaggio) {
        super(messaggio);
    }
}
