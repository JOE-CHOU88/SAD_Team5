package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BuyerProductDetailController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchtoBuyerMainPagePanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("BuyerMainPagePanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
