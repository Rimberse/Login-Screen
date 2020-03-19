package application;

import java.io.IOException;
//import java.net.URL;
//import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneSwitchingController {
	@FXML
	public void onButtonClicked(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("WaitingScene.fxml"));
			Scene scene = new Scene(root,500,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); 		// this methods returns the stage
		    stage.setScene(scene);
		    stage.setTitle("Logging In");
		    stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public void initialize(URL location, ResourceBundle resources) {
//	     
//	}
}