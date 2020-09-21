
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Scanner {
	// Attribute
	private boolean fehler;
	// Bezugsobjekte
	private Token aktuellesToken;
	private String eingabe;
	private List<Token> tokenliste;

	public Scanner(String eingabe, List<Token> tokenliste) {
		this.eingabe = eingabe;
		this.tokenliste = tokenliste;
	}

	public void scanne() {
		char erster, zweiter;
		int pos = 0;

		while (eingabe.charAt(pos) != '#') {
			erster = eingabe.charAt(pos);
			if (erster == '+') {
				aktuellesToken = new Token("PLUS", "+");
			} else if (erster == 'x') {
				aktuellesToken = new Token("VAR", "x");
			} else if (erster == 'y') {
				aktuellesToken = new Token("VAR", "y");
			} else if (erster == 'z') {
				aktuellesToken = new Token("VAR", "z");
			} else {
				fehler = true;
				break;
			}
			pos++;
			tokenliste.append(aktuellesToken);
		}
		ausgabe(fehler);

	}

	private void ausgabe(boolean pFehler) {
		tokenliste.toFirst();
		if (pFehler == true || tokenliste.getContent() == null) {
			System.out.println("Lexikalische Analyse abgebrochen");
		} else {
			System.out.println("Lexikalische Analyse erfolgreich");
		}
	}

	public List<Token> getTokenliste() {
		if (fehler == false) {
			return tokenliste;
		} else
			return null;
	}

}
