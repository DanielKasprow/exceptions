package zad3;

public class WyjatekEmail extends Exception{
	String email;
	WyjatekEmail(String email) {
	this.email=email;
	}
	@Override
	public String getMessage() {return	"Twoj email " + email +" jest niewlasciwy.";	
	}
}