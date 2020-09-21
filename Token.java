
/**
 * Beschreiben Sie hier die Klasse Token.
 * 
 * @author Oliver Scholle
 * @version 20.05.2015
 */
public class Token
{
    //Attribute
    private String wert;
    private String typ;
	
    public Token(String typ, String wert){
    	this.wert = wert;
    	this.typ = typ;
    }
    public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getWert() {
		return wert;
	}
	public void setWert(String wert) {
		this.wert = wert;
	}
    
    
  
    //Todo

}
