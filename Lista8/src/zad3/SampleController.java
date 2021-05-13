package zad3;

import java.awt.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class SampleController {

	   @FXML
	    private TextField TextImie;

	    @FXML
	    private TextField TextNazwisko;

	    @FXML
	    private TextField TextNick;

	    @FXML
	    private TextField TextEmail;

	    @FXML
	    private RadioButton RadioMezczyzna;

	    @FXML
	    private ToggleGroup GrupaPlec;

	    @FXML
	    private RadioButton RadioKobieta;

	    @FXML
	    private Button ButtonStworz;


    public static String Imie,Nazwisko,Nick,Email,Plectext;
    
    public static boolean bImie=true,bNazwisko=true,bNick=true,bEmail=true;
    
    @FXML
    void Stworz(ActionEvent event) {
    	Imie= TextImie.getText();
    	Nazwisko= TextNazwisko.getText();
    	Nick= TextNick.getText();
    	Email= TextEmail.getText();
    	
    	if(String.valueOf(RadioMezczyzna.isSelected()==true) == "true")
    		Plectext="Mezczyzna";
    	else
    		Plectext="Kobieta";
    	
    	Sprawdzanie.sprawdzimie(Plectext);
    	Sprawdzanie.sprawdznazwisko();
    	Sprawdzanie.sprawdznick();
    	Sprawdzanie.sprawdzemail();
    	
    	
    	TextImie.setText(Imie);
    	TextNazwisko.setText(Nazwisko);
    	TextNick.setText(Nick);
    	TextEmail.setText(Email);
    	
    	if(bImie==true && bNazwisko==true && bNick==true && bEmail==true)
    	{
    		ButtonStworz.setText("Gratulacje stworzyles konto");
    	}
    }
}