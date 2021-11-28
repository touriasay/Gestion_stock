package application;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.Parent;
//mport javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class WindowsControler implements Initializable {
	
	//Debut Fenêtre Connexion
	@FXML
	private Label label;
	
	@FXML
	private void handleClose(MouseEvent event){
		System.exit(0);
	}
	/*
	private void handleButtonAction(MouseEvent eventCon) throws IOException {
		Parent home = FXMLLoader.load(getClass().getResource("home.fxml"));
		
		
		
	}*/
	
	//Fin Fenêtre Connexion

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
