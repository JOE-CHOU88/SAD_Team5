package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class Controller {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private ChoiceBox<String> identity=new ChoiceBox<String>();
	private String [] identityArray= {"a","b","c"};

	public void  switchtoLogin(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void  switchtoMainPagePanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("MainPagePanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void  switchtoInitiatorAccountPanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("InitiatorAccountPanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	//@Override
	/*public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		identity.getItems().addAll(identityArray);
	}*/
	public void choiceBox() {
		identity.getItems().addAll(identityArray);
	}
}
