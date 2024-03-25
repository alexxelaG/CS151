package Pages;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateAsset {
    private final VBox assetInputs;
    private final HBox buttons;

    public CreateAsset() {
        assetInputs = new VBox(20);
        assetInputs.setStyle("-fx-padding: 10px;");

        buttons = new HBox(20);

        Label label = new Label("Create a new Asset Category");
        Button homePageButton = new Button("Return to Home page");
        Button finalizeAssetButton = new Button("Create Asset");
        
		assetInputs.setStyle("-fx-background-color: violet;"); // changes the color of the background 


        finalizeAssetButton.setOnAction(e -> {
            System.out.println("Asset Category Successfully Created");
        });

        homePageButton.setOnAction(e -> {
            System.out.println("Back to the Homepage");
            // No need to create a new Stage here, just get the current Stage
            Stage primaryStage = (Stage) homePageButton.getScene().getWindow();
            HomeScreen homeScreen = new HomeScreen(primaryStage);
            primaryStage.setScene(new Scene(homeScreen.getRoot(), 400, 400));
            primaryStage.setTitle("Home Page");
        });

        buttons.getChildren().addAll(homePageButton, finalizeAssetButton);
        buttons.setAlignment(Pos.CENTER);

        // create text field for the name of the asset
        Label assetNameLbl = new Label("Name of Asset Category");
        TextField assetName = new TextField();

        // Create text field for the description of the asset
        Label assetDescriptionLbl = new Label("Description of Asset Category");
        TextField description = new TextField();

        assetInputs.getChildren().addAll(label,assetNameLbl, assetName, assetDescriptionLbl, description, buttons);
    }

    public Parent getRoot() {
        return assetInputs;
    }
}
