/*
 * 	Test della classe Pagamento
 */

public class PagamentoTest {

	public static void main(String[] args) {
		
		PagamentoContanti pagamentoUno = new PagamentoContanti(30);
		PagamentoContanti pagamentoDue = new PagamentoContanti(20);
		
		System.out.println(pagamentoUno.dettagliPagamento());
		System.out.println(pagamentoDue.dettagliPagamento());
		
		PagamentoCartaDiCredito cartaUno = new PagamentoCartaDiCredito(40, "Mastercard", "12/22", 123456789);
		PagamentoCartaDiCredito cartaDue = new PagamentoCartaDiCredito(50, "Visa", "09/23", 987654321);
		
		System.out.println(cartaUno.dettagliPagamento());
		System.out.println(cartaDue.dettagliPagamento());
	}

}
