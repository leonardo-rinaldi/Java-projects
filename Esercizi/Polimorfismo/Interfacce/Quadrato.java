/*
 * Una classe che rappresenta quadrati 
 */

public class Quadrato implements Misurabile {
	private double lato;
	
	public Quadrato(double ilLato) {
		super();
		lato = ilLato;
	}
	
	public double getArea() {
		return lato * lato;
	}
	
	public double getPerimetro() {
		return lato * 4;
	}
}
