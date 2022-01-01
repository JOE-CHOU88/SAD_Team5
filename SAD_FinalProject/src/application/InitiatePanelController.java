package application;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class InitiatePanelController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private Button button;
	/*
	@FXML
	private void initialize(){
		button.setOnAction(
	            (EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
	                @Override
	                public void handle(final ActionEvent e) {
	                	FileChooser fileChooser = new FileChooser();
	                    FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
	                    fileChooser.getExtensionFilters().add(extFilter);
	                    File file = fileChooser.showOpenDialog(stage);
	                }
	            });
	}*/
	
	public void  switchtoInitiatorMainPagePanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("InitiatorMainPagePanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
