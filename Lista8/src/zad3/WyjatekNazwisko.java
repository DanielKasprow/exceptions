package zad3;

public class WyjatekNazwisko extends Exception{
	String nazwisko;
	WyjatekNazwisko(String imie) {
	this.nazwisko=imie;
	}
	@Override
	public String getMessage() {return	"Nazwisko " + nazwisko +" jest niewlasciwe.";
	}

}
