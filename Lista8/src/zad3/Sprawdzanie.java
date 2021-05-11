package zad3;

public class Sprawdzanie {

	static void sprawdzimie()
	{
		try
		{
		checkImie();
		}
		catch(WyjatekImie e)
		{
			SampleController.Imie=e.getMessage();
		}
	}
	static void sprawdznazwisko()
	{
		try
		{
		checkNazwisko();
		}
		catch(WyjatekNazwisko e)
		{
			SampleController.Nazwisko=e.getMessage();
		}
	}
	static void checkImie() throws WyjatekImie{
		String Imie = SampleController.Imie;

		int sprimie = Imie.length();

		if (Imie.charAt(0) > 64 && Imie.charAt(0) < 91) {
			sprimie--;
			for (int x = 1; x < Imie.length(); x++) {
				if (Imie.charAt(x) > 96 && Imie.charAt(x) < 123) {
					sprimie--;
				}
			}
		}
		if (sprimie == 0)
			SampleController.bImie = true;
		else
		{
			SampleController.bImie = false;
			throw new WyjatekImie(Imie);
		}
	}

	static void checkNazwisko() throws WyjatekNazwisko {
		String Nazwisko = SampleController.Nazwisko;
		int sprnazwisko = Nazwisko.length();
		if (Nazwisko.charAt(0) > 64 && Nazwisko.charAt(0) < 91) {
			sprnazwisko--;
			for (int x = 1; x < Nazwisko.length(); x++) {
				if (Nazwisko.charAt(x) > 96 && Nazwisko.charAt(x) < 123) {
					sprnazwisko--;
				}
			}
		}
		if (sprnazwisko == 0)
			SampleController.bNazwisko = true;
		else
		{
			SampleController.bNazwisko = false;
			throw new WyjatekNazwisko(Nazwisko);
		}
	}
}
