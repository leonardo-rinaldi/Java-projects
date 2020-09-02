/*
 * 	5- Si crei una classe CalcoloPagamento che ha un attributo tariffa dato
 * 	   in Euro per ora. La classe dovrebbe anche avere un metodo calcolaPagamento(ore)
 * 	   che restituisce l'importo da pagare per un dato arco di tempo. 
 * 
 */

public class CalcoloPagamento {

	private double euro;
	
	public CalcoloPagamento() {
		euro = 0;
	}
	
	public CalcoloPagamento(double euro) {
		this.euro = euro;
	}
	
	public double calcolaPagamento(int ore) {
		return euro * ore;
	}
	
	public void setEuro(double euro) {
		this.euro = euro;
	}
	
	public double getEuro() {
		return euro;
	}
}
