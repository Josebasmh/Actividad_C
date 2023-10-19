package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application{

	public void start(Stage stage) {
		stage.setTitle("PERSONA"); 
		FlowPane root;
		try {
			root = (FlowPane)FXMLLoader.load(getClass().getResource("/fxml/Persona.fxml"));
			Scene scene = new Scene(root,820,620); 
			stage.setScene(scene);
			stage.setMinHeight(620);
			stage.setMinWidth(820);
			stage.show();
		} catch (IOException e) {
			System.out.println("La ventana no se abrió correctamente.");
			e.printStackTrace();
		}
	}
		public static void main(String[] args) {
			launch(args);
		}
}