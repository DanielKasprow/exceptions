package zad3;

import java.awt.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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
    private RadioButton RadioKobieta;

    @FXML
    private ToggleGroup Plec;
    
    @FXML
    private Button ButtonStworz;
    
    @FXML
    private Label ImieError;

    @FXML
    private Label NazwiskoError;

    @FXML
    private Label NickError;

    @FXML
    private Label EmailError;

    public static String Imie,Nazwisko,Nick,Email;
    
    public static boolean bImie=true,bNazwisko=true,bNick=true,bEmail=true;

    @FXML
    void Stworz(ActionEvent event) {
    	Imie= TextImie.getText();
    	Nazwisko= TextNazwisko.getText();
    	Nick= TextNick.getText();
    	Email= TextEmail.getText();
    	
    	Sprawdzanie.sprawdzimie();
    	Sprawdzanie.sprawdznazwisko();

    	
    	TextImie.setText(Imie);
    	TextNazwisko.setText(Nazwisko);
    }


}