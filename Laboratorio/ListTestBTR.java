
public class ListTestBTR {

	public static void main(String[] args) {
	     
		System.out.println(lista("+-", 5));
	 
    
	   
}	
	
/*
 * Costruisce una lista di stringhe in notazione notazione ternaria bilanciata (BTR)
 */
	
	public static StringSList lista(String x, int n) {
		
		StringSList list = new StringSList();
		
		for(int i = n; i > 0; i--) {  //parte da 5 e va all'indietro fino a 1
			
			list = list.cons(x);   //le raggruppo insieme
			
			x = btr(x);   
		}
		
		return list.reverse();  //viene capovolta la stringa perchè parto da 5 per andare a 1 e quindi mi viene fuori al contrario
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
