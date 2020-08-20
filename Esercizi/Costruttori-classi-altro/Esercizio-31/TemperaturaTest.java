/*
 *	Test della classe Temperatura 
 */

public class TemperaturaTest {

	public static void main(String[] args) {
		
		Temperatura tempUno = new Temperatura(100, 'C');
		Temperatura tempDue = new Temperatura(210, 'F');
		
		System.out.println("Gradi Fahrenheint: " + tempUno.getFahrenheit(tempUno.getGradi()));
		System.out.println("Gradi Celsius: " + tempDue.getCelsius(tempDue.getGradi()));
		
		System.out.println(tempUno.equalsTemperatura(tempDue));
		System.out.println(tempUno.minore(tempDue));
		System.out.println(tempUno.maggiore(tempDue));
	}

}
