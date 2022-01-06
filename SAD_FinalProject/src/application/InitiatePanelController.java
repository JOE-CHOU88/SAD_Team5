package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class InitiatePanelController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchtoInitiatorMainPagePanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("InitiatorMainPagePanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void uploadButtonAction(ActionEvent event) throws Exception{
		FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
        fileChooser.showOpenDialog(stage);
	}
}
