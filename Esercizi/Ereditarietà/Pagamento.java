/*
 * 	12- Si definisca una nuova classe Pagamento che contenga una variabile di istanza di
 * 		tipo double che memorizza l'importo del pagamento e si definiscano appropriati
 * 		metodi get e set. Si crei inoltre un metodo dettagliPagamento che visualizza una
 * 		frase in italiano per descrivere l'importo del pagamento.
 * 		Si definisca poi una classe PagamentoContanti che sia derivata da Pagamento. Questa
 * 		classe dovrebbe ridefinire il metodo dettagliPagamento per indicare che il pagamento
 * 		è in contanti. Si includano appropriati costruttori (o un unico costruttore).
 * 		Si definisca una classe PagamentoCartaDiCredito derivata da Pagamento. Questa classe
 * 		dovrebbe contenere le variabili di istanza per il nome sulla carta, la data di scadenza
 * 		e il numero della carta di credito. Si includano appropriati costruttori (o un unico
 * 		costruttore). Infine, si ridefinisca il metodo dettagliPagamento per includere tutte 
 * 		le informazioni della carta di credito oltre all'importo del pagamento.
 * 		Si crei un metodo main che crei almeno due oggetti di PagamentoContanti e due di
 * 		PagamentoCartaDiCredito con valori differenti e si invochi dettagliPagamento per ognuno
 * 		di essi.
 * 
 */

public class Pagamento {
	private double importoPagamento;
	
	public Pagamento() {
		importoPagamento = 0;
	}
	
	public Pagamento(double importo) {
		importoPagamento = importo;
	}
	
	public void setImporto(double importo) {
		importoPagamento = importo;
	}
	
	public double getImporto() {
		return importoPagamento;
	}
	
	public String dettagliPagamento() {
		return "Questi sono i dettagli del pagamento";
	}
}
