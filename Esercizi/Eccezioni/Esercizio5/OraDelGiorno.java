package Esercizio5;

/*
    5-  Scrivere una classe OraDelGiorno che usi le classi di eccezioni definite
        nell'esercizio precedente. Implementare un metodo setOra(stringaOra) che
        cambia ora l'ora se stringaOra corrisponde a un'ora valida. Altrimenti lancia
        un'eccezione del tipo approriato.
 */

import Esercizio4.OraNonValidaException;

public class OraDelGiorno {

    private int ora;
    private int minuti;
    private String ampm;

    public void setOra(String stringaOra) {
        String oraFormatoStringa = stringaOra.substring(0, 2);
        String minutiFormatoStringa = stringaOra.substring(3, 5);
        ampm = stringaOra.substring(6, stringaOra.length());
        String duePunti = stringaOra.substring(2);
        int oraIntero = Integer.parseInt(oraFormatoStringa);
        int minutiIntero = Integer.parseInt(minutiFormatoStringa);

        try {
            if(!(oraIntero >= 1 && oraIntero <= 12)) {
                throw new OraNonValidaException();
            } else {
                ora = oraIntero;
                minuti = minutiIntero;
            }

        } catch(OraNonValidaException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public void mostraOra() {
        System.out.println("Orario inserito:");
        System.out.println(ora + ":" + minuti + " " + ampm);
    }
}
