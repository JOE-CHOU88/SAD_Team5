package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InitiatorMainPagePanelController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void  switchtoInitiatorAccountPanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("InitiatorAccountPanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void  switchtoProductDetailPanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("InitiatorProductDetailPanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void  switchtoSearchResultPanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("InitiatorSearchResultPanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void  switchtoInitiatePanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("InitiatePanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
