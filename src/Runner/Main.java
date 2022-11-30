package Runner;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	
	private static Stage stg;
	
	@Override
	public void start(Stage primaryStage) 
	{ 
		try {
			stg=primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeScene(String string) throws IOException 
	{
		Parent root = FXMLLoader.load(getClass().getResource(string));
		//Scene scene = new Scene(root);
		stg.getScene().setRoot(root);
		stg.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	
	}
}
