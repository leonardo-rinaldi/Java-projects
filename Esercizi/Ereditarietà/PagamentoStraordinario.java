/*
 * 	6- Derivare una classe PagamentoOrdinario da CalcoloPagamento, come
 * 	   descritta nel precedente esercizio. Essa dovrebbe avere un costruttore
 * 	   che ha un parametro per la tariffa. Questa classe non ridefinisce alcun metodo.
 * 	   Si derivi poi una classe PagamentoStraordinario da CalcoloPagamento che ridefinisce
 * 	   il metodo calcolPagamento. Il nuovo metodo dovrebbe restituire l'importo restituendo
 * 	   dal metodo nella classe base moltiplicando per 1.5
 * 
 */

public class PagamentoStraordinario extends CalcoloPagamento {

	public PagamentoStraordinario() {
		super();
	}
	
	public double calcolaPagamento(int ore) {
		double euro = getEuro();
		return euro * ore * 1.5;
	}
	
}
