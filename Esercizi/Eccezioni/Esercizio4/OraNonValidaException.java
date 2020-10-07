package Esercizio4;

/*
    4-  Derivare delle nuove classi di eccezioni da quella realizzata nell'esercizio
        precedente. Ogni nuova classe deve indicare il tipo d'errore. Per esempio,
        oraNonValidaException potrebbe essere usata per indicare che il valore inserito
        per l'ora non è un intero compreso tra 1 e 12.
 */

import Esercizio3.ErroreOraException;

public class OraNonValidaException extends ErroreOraException {

    public OraNonValidaException() {
        super("L'ora inserita non è compresa tra 1 e 12");
    }

    public OraNonValidaException(String messaggio) {
        super(messaggio);
    }
}
