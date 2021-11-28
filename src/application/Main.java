package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
		
		stage.initStyle(StageStyle.DECORATED);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		//stage.setTitle("GeStosckk");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
