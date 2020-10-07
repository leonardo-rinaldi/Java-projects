package Esercizio8;

/*
    Test della classe Razionale
 */

public class RazionaleTest {

    public static void main(String[] args) {
        Razionale numero = new Razionale(1, 1);
        System.out.println(numero.getNumeratore());
        System.out.println(numero.getDenominatore());
        numero.setDenominatore(0);
    }
}
