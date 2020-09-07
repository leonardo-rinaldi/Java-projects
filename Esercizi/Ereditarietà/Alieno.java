/*
 *	14- Il seguente frammento di codice è stato progettato da J. Hacker per un video
 *		game. La classe Alieno rappresenta un mostro, mentra la classe GruppoAlieni 
 *		rappresenta un gruppo di alieni e quanti danni questi possono infliggere. Le
 *		definizioni di tali classi sono fornite di seguito:
 *
 * 		public class Alieno {
 * 			public static final int ALIENO_SERPENTE = 0;
 * 			public static final int ALIENO_ORO = 1;
 * 			public static final int ALIENO_UOMO_MARSHMALLOW = 2;
 * 			public int tipo;
 * 			public int salute;
 * 			public String nome;
 * 
 * 			public Alieno(int tipo, int salute, String nome) {
 * 				this.tipo = tipo;
 * 				this.salute = salute;
 * 				this.nome = nome;
 *			}
 *		}
 *
 *		public class GruppoAlieni {
 *			private Alieno[] alieno;
 *
 *			public GruppoAlieni(int alieniNum) {
 *				alieno = new Alieno[alieniNum];
 *			}
 *
 *			public void aggiungiAlieno(Alieno nuovoAlieno, int indice) {
 *				alieno[indice] = nuovoAlieno;
 *			}
 *
 *			public Alieno[] getAlieni() {
 *				return alieno;
 *			}
 *
 *			public int calcolaDanno() {
 *				int danno = 0;
 *				for(int i = 0; i < alieno.length; i++) {
 *					if(alieno[i].tipo == Alieno.ALIENO_SERPENTE) {
 *						danno +=10;
 *					}
 *					else if(alieno[i].tipo == Alieno.ALIENO_ORCO) {
 *						danno += 6;
 *					}
 *					else if(alieno[i].tipo == Alieno.ALIENO_UOMO_MARSHMALLOW) {
 *						danno +=1;
 *					}
 *				}
 *				return danno;
 *			}
 *		}
 *
 *		Il codice non è molto orientato agli oggetti e non supporta l'information hiding
 *		nella classe Alieno. Si riscriva il codice in moda da usare l'ereditarietà per
 *		rappresentare i differenti tipi di alieni al posto del parametro "tipo". Si riscriva
 *		anche la classe Alieno per nascondere le variabili di istanza e per creare un metodo
 *		getDanno per ogni classe derivata e che restituisca il danno inflitto dall'alieno.
 *		Infine si riscriva il metodo calcolaDanno e si scriva un metodo main che provi i codici.
 *	 
 * 
 */

public class Alieno {

	private int salute;
	private String nome;
	
	public Alieno() {
		salute = 0;
		nome = "";
	}
	
	public Alieno(int salute, String nome) {
		this.salute = salute;
		this.nome = nome;
	}
	
	public void setSalute(int salute) {
		this.salute = salute;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getSalute() {
		return salute;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getDanno() {
		return 0;
	}
	
	public int calcolaDanno() {
		return getDanno();
	}
}
