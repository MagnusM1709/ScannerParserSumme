
public class Parser {
	
	boolean fehler;
	
	List<Token> tokenliste;
	Token aktuellesToken;

	public Parser(List<Token> tokenliste) {
		this.tokenliste = tokenliste;
		

	}

	private Token nextToken() {
		tokenliste.next();
		return tokenliste.getContent();
	}

	public boolean parse() {
		this.tokenliste.toFirst();
		aktuellesToken = tokenliste.getContent();
		if (tokenliste.hasAccess() && pruefeS())

			return true;

		else
			return false;
	}

	public boolean pruefeS() {
		if (tokenliste.hasAccess() && (aktuellesToken.getTyp().equals("VAR"))) {
			aktuellesToken = nextToken();
			return pruefeA();
		} else return false;
	}

	public boolean pruefeA() {
		if (tokenliste.hasAccess() &&(aktuellesToken.getTyp().equals("PLUS"))) {
			aktuellesToken = nextToken();
			return pruefeV();
		} else if(!tokenliste.hasAccess()){
			return true;
		}else {
			return false;
		}
	}

	public boolean pruefeV() {
		if (tokenliste.hasAccess() &&  aktuellesToken.getTyp().equals("VAR")) {
			aktuellesToken = nextToken();
			return pruefeA();
		} else if(!tokenliste.hasAccess()){
			return true;
		}else {
			return false;
		}
	}

}
