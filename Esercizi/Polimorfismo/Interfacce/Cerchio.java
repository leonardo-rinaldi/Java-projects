/*
 * Una classe che rapresenta cerchi
 */

public class Cerchio implements Misurabile{
	private double raggio;
	
	public Cerchio(double ilRaggio) {
		raggio = ilRaggio;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * raggio;
	}
	
	public double getCirconferenza() {
		return getPerimetro();
	}
	
	public double getArea() {
		return Math.PI * raggio * raggio;
	}
}
