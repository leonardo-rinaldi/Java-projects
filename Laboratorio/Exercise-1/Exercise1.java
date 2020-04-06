/*From Scheme to Java
 * Rappresentazione ternaria bilanciata
 * 
 */

public class Exercise1 {

    public static void main(String[] args) {

        System.out.println(Exercise1.btr("+"));
        System.out.println(Exercise1.btr("+-"));
        System.out.println(Exercise1.btr("+."));
    }


    public static String btr(String btr) {

        int n = btr.length();

        char lsb = btr.charAt(n - 1);

        String pre = btr.substring(0, n - 1);


        if (n == 1) {                                   
            if (lsb == '+') { 
                return "+-"; 
            } else {
                return "+"; 
            }
        } else {
            if (lsb == '+') {
                return btr(pre) + '-';
            } else {
                if (lsb == '-') {
                    return pre + '.';
                } else {
                    return pre + '+';
                }
            }
        }

    }
}
