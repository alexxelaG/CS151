package Pages;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ViewAssetPage {

	private final VBox root;
	
	public ViewAssetPage() {
		
		root = new VBox(20);
		root.setStyle("-fx-padding: 10px;");
		
		
		
		
	}
	
	
	public Parent getRoot() {
        return root;
    }
	
}
