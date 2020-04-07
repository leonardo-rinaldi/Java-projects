
public class StringSList {

	
	public static final StringSList NULL_STRINGLIST = new StringSList();
	
	private final boolean empty;   
	private final String first;
	private final StringSList rest;  
	
	public StringSList() {
		
		empty = true;
		first = " ";
		rest = null;
	}
	
	public StringSList(String e, StringSList sl) {
		
		empty = false;
		first = e;
		rest = sl;
		
	}
	
	public boolean isNull() {
		
		return empty;
	}
	
	public String car() {
		
		return first;
	}
	
	public StringSList cdr() {
		
		return rest;
		
	}
	
	public StringSList cons(String e) {
		
		return (new StringSList (e, this));
	}
	
	public int length() {
		
		if(isNull() ) {
			return 0;
		}
		else {
			return (1 + cdr().length());
		}
		
	}
	
	public String listRef(int k) {
		
		if (k == 0) {
			return car();
		}
		else {
			return cdr().listRef(k -1);
		}
	}
	
	public boolean equals( StringSList s1) {
		
		if ( isNull() ) {
			return (s1.isNull() );
		}
		else
			if(s1.isNull() ) {
				return false;
			}
			else 
				if(car() == s1.car() ) {
					return ( cdr().equals(s1.cdr()) ); 
				}
				else {
					return false;
				}
	}
	
	public StringSList append ( StringSList s1 ) {
		
		if ( isNull() ) {
			return s1;
		}
		else {
			return ( cdr().append(s1).cons(car()) );
		}
	}
	
	public StringSList reverse() {
		
		return reverseRec(NULL_STRINGLIST);
	}
	
	private StringSList reverseRec(StringSList rl) {
		
		if(this.isNull()) {
			return rl;
		}
	
	else {
		return cdr().reverseRec(rl.cons(car()));
	}
}
	
	public String toString() {
		if (this.empty) {

            return "(---)";

        } else if (rest.isNull()) {

            return "(" + this.first + ")";

        } else {

            String elements = "(" + this.first;
            StringSList restElements = this.rest;

            while (!restElements.isNull()) {

                elements += ", " + restElements.car();
                restElements = restElements.cdr();
            }

            return elements + ")";
        }
	}
	

} //class StringSLIst


