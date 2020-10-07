package Esercizio2;

/*
    2- Scrivere un programma che permetta all'utente di calcolare il resto di una divisione
       fra due valori interi. Il resto della divisione x/y è x%y. Catturare l'eccezione causata
       da una divisione per zero.

 */

public class RestoDivisione {

    public static void main(String[] args) {
        RestoDivisione divisione = new RestoDivisione();
        System.out.println(divisione.resto(10, 3));
        System.out.println(divisione.resto(3, 0));
    }

    public static int resto(int x, int y) {
        int restoDivisione = 0;

        try {
            if(y == 0) {
                throw new Exception("Errore, divisione per zero");
            }
            restoDivisione = x % y;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return restoDivisione;
    }
}
