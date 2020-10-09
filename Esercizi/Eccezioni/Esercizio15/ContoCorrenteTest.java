package Esercizio15;

/*
    Test della classe ContoCorrente
 */

public class ContoCorrenteTest {

    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente();
        System.out.println("Saldo: " + conto.deposita(10));
        conto.deposita(-1);
        System.out.println("Saldo: " + conto.ritira(2));
        conto.ritira(100);
    }
}
