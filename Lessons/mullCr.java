public class mullCr {

    public static void main(String[] args) {
        System.out.println(mullCr(2, 2, 0));
        System.out.println(mullCr(725, 152, 0));
    }

    /*
        Versione iterattiva della procedura Scheme ricorsiva mull-rec
        (Algoritmo del contadino russo)
     */

    public static int mullCr(int m, int n, int p) {
        while(!(n == 0)) {
            if(even(n)) {
                m = m * 2;
                n = (int)n / 2;
            } else {
                p = p + m;
                n = (int)n / 2;
                m = m * 2;

            }
        }
        return p;
    }

    public static boolean even(int n) {
        boolean risultato;
        if(n % 2 == 0) {
            risultato = true;
        } else {
            risultato = false;
        }
        return risultato;
    }

}
