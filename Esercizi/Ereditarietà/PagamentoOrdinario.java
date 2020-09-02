/*
 * 	6- Derivare una classe PagamentoOrdinario da CalcoloPagamento, come
 * 	   descritta nel precedente esercizio. Essa dovrebbe avere un costruttore
 * 	   che ha un parametro per la tariffa. Questa classe non ridefinisce alcun metodo.
 * 	   Si derivi poi una classe PagamentoStraordinario da CalcoloPagamento che ridefinisce
 * 	   il metodo calcolPagamento. Il nuovo metodo dovrebbe restituire l'importo restituendo
 * 	   dal metodo nella classe base moltiplicando per 1.5
 * 
 */

public class PagamentoOrdinario extends CalcoloPagamento {
	
	private double tariffa;
	
	public PagamentoOrdinario() {
		super();
		tariffa = 0;
	}
	
	public void setTariffa(double nuovaTariffa) {
		tariffa = nuovaTariffa;
	}
	
	public double getTariffa() {
		return tariffa;
	}
}
