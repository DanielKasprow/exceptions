package zad3;

public class WyjatekImie extends Exception{
	String imie;
	WyjatekImie(String imie) {
	this.imie=imie;
	}
	@Override
	public String getMessage() {return	"Imie " + imie +" jest niewlasciwe.";
	}

}
