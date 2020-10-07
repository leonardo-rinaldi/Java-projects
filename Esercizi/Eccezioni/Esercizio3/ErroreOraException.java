package Esercizio3;

/*
    3-  Scrivere una classe di eccezione per indicare che un'ora inserita da
        un utente non è valida. L'ora deve essere nel formato ore:minuti e
        seguita da "am" o "pm"
 */

public class ErroreOraException extends Exception{

    public ErroreOraException() {
        super("Ora non valida");
    }

    public ErroreOraException(String messaggio) {
        super(messaggio);
    }
}

