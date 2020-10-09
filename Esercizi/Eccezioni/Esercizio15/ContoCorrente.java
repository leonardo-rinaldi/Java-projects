package Esercizio15;

/*
    15- Un metodo che restituisce un valore particolare come codice di errore può, a volte,
        creare problemi. Chi lo utilizza potrebbe ignorare il codice di errore o trattarlo
        come un valore valido. In casi come questo, è meglio generare un'eccezione che gestire
        gli errori tramite valori di ritorno particolari. La classe riportata di seguito gestisce
        il saldo di un conto corrente e sfrutta un valore di ritorno particolare come codice di
        errore.

        public class ContoCorrente {
            private double saldo;

            public ContoCorrente() {
                saldo = 0;
            }

            public ContoCorrente(double depositoIniziale) {
                saldo = depositoIniziale;
            }

            public double getSaldo() {
                return saldo;
            }

            //Restituisce il nuovo saldo o -1 in caso di errore
            public double deposita(double somma) {
                if(somma > 0) {
                    saldo += somma;
                   } else {
                   return -1;
                  }
            return saldo;
            }

            //Restituisce il nuovo saldo o -1 in caso di errore
            public double ritira(double somma) {
                if((somma > saldo) || (somma < 0)) {
                    return -1;
                    } else {
                        saldo -= somma;
                        }
                     return saldo;
                   }
            }

       Riscrivere la classe in modo che generi eccezioni appropriate anzichè restituire -1
       come codice di errore. Si scriva del codice di prova che cerchi di ritirare e depositare
       somme non valide e gestisca le eccezzioni che vengono generate.
 */

public class ContoCorrente {
    private double saldo;

    public ContoCorrente() {
        saldo = 0;
    }

    public ContoCorrente(double depositoIniziale) {
        saldo = depositoIniziale;
    }

    public double getSaldo() {
        return saldo;
    }

    public double deposita(double somma) {
        try {
            if(somma > 0) {
                saldo += somma;
            } else {
                throw new Exception("Somma insufficiente!");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }

    public double ritira(double somma) {
        try {
            if((somma > saldo) || (somma < 0)) {
                throw new Exception("Saldo insufficiente");
            } else {
                saldo -= somma;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }
}
