package zad1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SampleController {
	
    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;
    
    @FXML
    private TextField TextField3;

    @FXML
    private TextField TextField4;

    @FXML
    void ButtonExample(ActionEvent event) {

    	try
    	{
    		String text = TextField1.getText();
    		int numer =  Integer.parseInt(text);
    		TextField2.setText("Integer");
    	}
    	catch(NumberFormatException e) { TextField2.setText("Nie jest to Integer");}
    	
    	try
    	{
    		int numer[] =  {5,4};
    		TextField3.setText(numer[5]+"");
    	}
    	catch(ArrayIndexOutOfBoundsException e) { TextField3.setText("Zly indeks ");}
    	
    	try
    	{
    		int a;
    		String b="a";
    		a=Integer.parseInt(b);;
    	}
    	catch(Exception e) { TextField4.setText("Nieznany Blad");}
    }
}
