package Esempio;

import java.util.Scanner;

public class DividiPerZeroDemo {

    private int numeratore;
    private int denominatore;
    private double quoziente;

    public void fai() {
        try {
            System.out.println("Inserisci numeratore:");
            Scanner tastiera = new Scanner(System.in);
            numeratore = tastiera.nextInt();
            System.out.println("inserisci denominatore:");
            denominatore = tastiera.nextInt();

            if(denominatore == 0) {
                throw new DivisionePerZeroException();
            }
            quoziente = numeratore / (double)denominatore;
            System.out.println(numeratore + "/" + denominatore + " = " + quoziente);
        } catch(DivisionePerZeroException e) {
            System.out.println(e.getMessage());
            daiSecondaPossibilità();
        }

        System.out.println("Fine programma.");
    }

    public void daiSecondaPossibilità() {
        System.out.println("Tenta di nuovo.");
        System.out.println("Inserisci numeratore:");
        Scanner tastiera = new Scanner(System.in);
        numeratore = tastiera.nextInt();

        System.out.println("Inserisci denominatore:");
        System.out.println("accertati che il denominatore non sia zero.");
        denominatore = tastiera.nextInt();

        if(denominatore == 0) {
            System.out.println("Non posso dividere per zero");
            System.out.println("Poichè non posso fare ciò che chiedi,");
            System.out.println("il programma terminerà ora.");
            System.exit(0);
        }

        quoziente = ((double)numeratore) / denominatore;
        System.out.println(numeratore + "/" + denominatore + " = " + quoziente);
    }
    public static void main(String[] args) {
        DividiPerZeroDemo unaVolta = new DividiPerZeroDemo();
        unaVolta.fai();
    }
}
