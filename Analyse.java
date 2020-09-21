public class Analyse {
	// Attribute
	private String eingabe;
	// Bezugsobjekte
	private Scanner scanner;
	private Parser parser;

	List<Token> tokenliste;

	public Analyse(String eingabe) {
		this.eingabe = eingabe;
		tokenliste = new List<Token>();
		scanner = new Scanner(eingabe, tokenliste);
		analysiere();

	}

	public void analysiere()
	{
		scanner.scanne();
		if (scanner.getTokenliste() != null) {
			parser = new Parser(scanner.getTokenliste());
			if (parser.parse()){
				System.out.println("Erfolgreiches Parsing");
			}else System.out.println("kein erfolgreiches Parsing");
		}
	}
}
