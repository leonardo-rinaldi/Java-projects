/*
 * 	10- Si crei una classe CifrarioACombinazione che implementa l'interfaccia
 * 		CodificatoreMessaggio, come descritta nell'Esercizio 8. Il costruttore
 * 		dovrebbe avere un parametro intero chiamato n. Si definisca il metodo
 * 		codifica così che il messaggio sia combinato n volte. Per eseguire una
 * 		singola combinazione, si divide il messaggio a metà e poi si prendono
 * 		i caratteri da ognuna delle due metà in modo alternato. Per esempio,
 * 		se il messaggio è abcdefghi, le metà abcde e fghi. Il messaggio
 * 		combinato è afbgchdie. 
 * 		
 */

public class CifrarioCombinazione implements CodificatoreMessaggio {
	
	private int n;
	
	public CifrarioCombinazione(int n) {
		this.n = n;
	}
	
	public String codifica(String messaggio) {
		String messaggioCodificato = messaggio;
		for(int i = 0; i < n; i++) {
			messaggioCodificato = combinazione(messaggioCodificato);
		}
		return messaggioCodificato;
	}
	
	/*
	 * Metodo per dividere il messaggio in due sottostringhe e
	 * codificarlo
	 */
	
	public String combinazione(String messaggio) {	// alla fine togli static
		String parola = "";
		double lunghezzaMessaggio = messaggio.length();		//trovo la lunghezza della stringa
		double metà = lunghezzaMessaggio / 2;			//trovo la metà della stringa
		int metàArrotondato = (int)Math.ceil(metà);		//arrotonda all'intero maggiore
		String stringaUno = messaggio.substring(0, metàArrotondato);	//prima sotto stringa
		String stringaDue = messaggio.substring(metàArrotondato, messaggio.length());	//seconda sotto stringa
		
		if(stringaUno.length() == stringaDue.length()) {
			parola = lunghezzaPari(stringaUno, stringaDue);
		} else {
			parola = lunghezzaDispari(stringaUno, stringaDue);
		}
		return parola;
	}
	
	/*
	 * Metodo nel caso entrambe le sotto stringhe abbiano la
	 * stessa lunghezza
	 */
	
	private String lunghezzaPari(String stringaUno, String stringaDue) {
		String parola = "";
		for(int i = 0; i < stringaUno.length(); i++) {
			String letteraUno = stringaUno.substring(i, i+1);
			String letteraDue = stringaDue.substring(i, i+1);
			
			String unione = letteraUno + letteraDue;
			parola = parola + unione;
		}
		return parola;
	}
	
	/*
	 * Metodo nel caso le due sotto stringhe abbiano lunghezze
	 * diverse.
	 */
	
	private String lunghezzaDispari(String stringaUno, String stringaDue) {
		String parola = "";
		String letteraUno = "";
		String letteraDue = "";
		String unione = "";
		for(int i = 0; i < stringaUno.length(); i++) {
			
			if(i == stringaUno.length() - 1) {
				letteraUno = stringaUno.substring(i);
				unione = letteraUno;
			    parola = parola + unione;
			} else {
				letteraUno = stringaUno.substring(i, i+1);
				letteraDue = stringaDue.substring(i, i+1);
				
				unione = letteraUno + letteraDue;
				parola = parola + unione;
			}
		}
		return parola;
	}
}
