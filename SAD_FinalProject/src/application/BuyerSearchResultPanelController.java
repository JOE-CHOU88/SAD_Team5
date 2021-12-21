package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BuyerSearchResultPanelController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void  switchtoBuyerAccountPanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("BuyerAccountPanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void  switchtoBuyerMainPagePanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("BuyerMainPagePanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void  switchtoProductDetailPanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("BuyerProductDetailPanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
