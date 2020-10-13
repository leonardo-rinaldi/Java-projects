package Esercizio19;

public class MeseException extends Exception {

    public MeseException() {
        super("Mese errato!");
    }

    public MeseException(String messaggio) {
        super(messaggio);
    }
}
