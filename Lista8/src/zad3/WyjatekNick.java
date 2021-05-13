package zad3;

public class WyjatekNick extends Exception{
	String nick;
	WyjatekNick(String nick) {
	this.nick=nick;
	}
	@Override
	public String getMessage() {return	"Twoja nazwa" + nick +" jest niewlasciwa.";	
	}
}
