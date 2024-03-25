package application;
	
import Pages.HomeScreen;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// Create an instance of the homeScreen class to make a new scene
			HomeScreen homescreen = new HomeScreen(primaryStage);
			
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(new Scene(homescreen.getRoot(), 400, 400));
			primaryStage.setTitle("Brick by Brick");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
