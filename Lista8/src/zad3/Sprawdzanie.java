package zad3;

public class Sprawdzanie {

	static void sprawdzimie(String plec) {
		try {
			checkImie(plec);
		} catch (WyjatekImie e) {
			SampleController.Imie = e.getMessage();
		}
	}

	static void sprawdznazwisko() {
		try {
			checkNazwisko();
		} catch (WyjatekNazwisko e) {
			SampleController.Nazwisko = e.getMessage();
		}
	}

	static void sprawdznick() {
		try {
			checkNick();
		} catch (WyjatekNick e) {
			SampleController.Nick = e.getMessage();
		}
	}

	static void sprawdzemail() {
		try {
			checkEmail();
		} catch (WyjatekEmail e) {
			SampleController.Email = e.getMessage();
		}
	}

	static void checkImie(String plec) throws WyjatekImie {
		String Imie = SampleController.Imie;

		int sprimie = Imie.length();
		if (sprimie > 2) {
			if (Imie.charAt(0) > 64 && Imie.charAt(0) < 91) {
				sprimie--;
				for (int x = 1; x < Imie.length(); x++) {
					if (Imie.charAt(x) > 96 && Imie.charAt(x) < 123) {
						sprimie--;
					}
				}
			} else {
				SampleController.bImie = false;
				throw new WyjatekImie(Imie);
			}
		}
		if (sprimie == 0&&Imie.length()>2) {
			String endImie = Imie.substring(Imie.length() - 3, Imie.length());

			if ((endImie.equals("usz") || endImie.substring(endImie.length() - 2, endImie.length()).equals("ek"))
					&& (plec.equals("Mezczyzna"))) {
				endImie = Imie.substring(Imie.length() - 2, Imie.length());
				SampleController.bImie = true;
			}

			else {
				endImie = Imie.substring(Imie.length() - 2, Imie.length());
				if ((endImie.equals("ta") || endImie.equals("na")) && (plec.equals("Kobieta"))) {
					SampleController.bImie = true;
				} else {
					SampleController.bImie = false;
					throw new WyjatekImie(Imie);
				}
			}
		} else {
			SampleController.bImie = false;
			throw new WyjatekImie(Imie);
		}

	}

	static void checkNazwisko() throws WyjatekNazwisko {
		String Nazwisko = SampleController.Nazwisko;
		int sprnazwisko = Nazwisko.length();
		if (sprnazwisko != 0) {
			if (Nazwisko.charAt(0) > 64 && Nazwisko.charAt(0) < 91) {
				sprnazwisko--;
				for (int x = 1; x < Nazwisko.length(); x++) {
					if (Nazwisko.charAt(x) > 96 && Nazwisko.charAt(x) < 123) {
						sprnazwisko--;
					}
				}
			} else {
				SampleController.bNazwisko = false;
				throw new WyjatekNazwisko(Nazwisko);
			}
			if (sprnazwisko == 0)
				SampleController.bNazwisko = true;
			else {
				SampleController.bNazwisko = false;
				throw new WyjatekNazwisko(Nazwisko);
			}
		} else {
			SampleController.bNazwisko = false;
			throw new WyjatekNazwisko(Nazwisko);
		}
	}

	static void checkNick() throws WyjatekNick {
		String Nick = SampleController.Nick;
		boolean odpNick = false;
		if (Nick.length() > 5) {
			for (int i = 0; i < Nick.length(); i++) {
				if (Character.isDigit(Nick.charAt(i)))
					odpNick = true;
			}
		}
		if (odpNick == false) {
			SampleController.bNick = false;
			throw new WyjatekNick(Nick);
		}
	}

	static void checkEmail() throws WyjatekEmail {
		String Email = SampleController.Email;
		boolean odpEmail = false;
		if (Email.length() > 8) {
			String endEmail = Email.substring(Email.length() - 7, Email.length());
			if (endEmail.equals("@gra.pl"))
				odpEmail = true;

		}
		if (odpEmail == false) {
			SampleController.bNick = false;
			throw new WyjatekEmail(Email);
		}
	}
}
