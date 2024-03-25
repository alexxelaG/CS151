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
	
		
		Label MainLabel = new Label("Welcome to Brick by Brick");
		Button createAssetButton = new Button("Create Asset");
		Button viewAssetButton = new Button("View Asset");
		
		hbox.getChildren().addAll(createAssetButton, viewAssetButton);
		hbox.setAlignment(Pos.CENTER);
		root.getChildren().addAll(MainLabel, hbox);
		
		
		createAssetButton.setOnAction(e -> {
			//Form
			TextField input = new TextField(); 
			input.getText();
			// System.out.println(input.getText()); //debug txt input

			//Layout
			System.out.println("This is the createAssetButton");
			CreateAssetPage createAsset = new CreateAssetPage();
			primaryStage.setScene(new Scene(createAsset.getRoot(), 400, 400));
			primaryStage.setTitle("Create an Asset");
		});
		
		viewAssetButton.setOnAction(e -> {
			System.out.println("This is the viewAssetButton");
			
			ViewAssetPage viewAsset = new ViewAssetPage();
			primaryStage.setScene(new Scene(viewAsset.getRoot(), 400, 400));
			primaryStage.setTitle("View Assets");
		});
		
	}
	
	
	public Parent getRoot() {
        return root;
    }
	
}
