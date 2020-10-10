package Esercizio13;

/*
    Test della classe CronometroGiri
 */

import java.util.Calendar;

public class CronometroGiriTest {

    public static void main(String[] args) {

        CronometroGiri gara = new CronometroGiri(5);
        gara.parti();
        gara.marcaGiro();
        gara.getDurataUltimoGiro();
        System.out.println("TempoTotale: " + gara.getTempoTotale());
        System.out.println("GiriRimanenti: " + gara.getGiriRimanenti());

        System.out.println();
        gara.marcaGiro();
        gara.getDurataUltimoGiro();
        System.out.println("TempoTotale: " + gara.getTempoTotale());
        System.out.println("GiriRimanenti: " + gara.getGiriRimanenti());

        System.out.println();
        gara.marcaGiro();
        gara.getDurataUltimoGiro();
        System.out.println("TempoTotale: " + gara.getTempoTotale());
        System.out.println("GiriRimanenti: " + gara.getGiriRimanenti());

        System.out.println();
        gara.marcaGiro();
        gara.getDurataUltimoGiro();
        System.out.println("TempoTotale: " + gara.getTempoTotale());
        System.out.println("GiriRimanenti: " + gara.getGiriRimanenti());
    }
}
