/*
 *	Programma ricorsivo per il conto alla rovescia
 */

public class ContoAllaRovesciaRicorsivo {

	public static void main(String[] args) {
		
		contoAllaRovescia(3);
	}
	
	public static void contoAllaRovescia(int num) {
		if(num <= 0) {
			System.out.println();
		} else {
			System.out.print(num);
			contoAllaRovescia(num -1);
		}
	}

}
