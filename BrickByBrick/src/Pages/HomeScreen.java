package Pages;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScreen {

	private final VBox root;
	private final HBox hbox;
	private final Stage primaryStage;
	
	public HomeScreen(Stage primaryStage) {
		
		this.primaryStage = primaryStage; // assigning the passed stage 
		hbox = new HBox(20);
		root = new VBox(20);
		root.setStyle("-fx-padding: 10px;");
		root.setAlignment(Pos.CENTER); // Align the VBox to the center
	
		root.setStyle("-fx-background-color: violet;"); // changes the color of the background 
		
		Label MainLabel = new Label("Welcome to Brick by Brick");
		Button createAssetCategoryButton = new Button("Create New Asset Category");

		
		hbox.getChildren().addAll(createAssetCategoryButton);
		hbox.setAlignment(Pos.CENTER);
		root.getChildren().addAll(MainLabel, hbox);
		
		
		createAssetCategoryButton.setOnAction(e -> {
			System.out.println("Welcome to the Create New Asset Category Page");
			
			CreateAsset createAsset = new CreateAsset();
			primaryStage.setScene(new Scene(createAsset.getRoot(), 400, 400));
			primaryStage.setTitle("Create an Asset");
		});
		
	
		
	}
	
	
	public Parent getRoot() {
        return root;
    }
	
}
