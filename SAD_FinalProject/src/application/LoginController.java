package application;

import java.io.File;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private TextField accountField;
	@FXML
	private TextField passwardField;
	@FXML
	private Label warningLabel;
	
	
	public void  switchtoBuyerRegister(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("BuyerRegister.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void  switchtoInitiatorRegister(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("InitiatorRegister.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void  switchtoMainPagePanel(ActionEvent event) throws Exception{
		File buyerFile = new File("SAD_FinalProject\\src\\application\\BuyerInfo.txt");
		Scanner buyerScanner = new Scanner(buyerFile);
		String buyerAccount = buyerScanner.next();
		String buyerPassward = buyerScanner.next();
		
		File initiatorFile = new File("SAD_FinalProject\\src\\application\\InitiatorInfo.txt");
		Scanner initiatorScanner = new Scanner(initiatorFile);
		String initiatorAccount = initiatorScanner.next();
		String initiatorPassward = initiatorScanner.next();
		
		if(accountField.getText().equals(buyerAccount) && passwardField.getText().equals(buyerPassward)) {
			root = FXMLLoader.load(getClass().getResource("BuyerMainPagePanel.fxml"));
			stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
			scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
		}else if(accountField.getText().equals(initiatorAccount) && passwardField.getText().equals(initiatorPassward)) {
			root = FXMLLoader.load(getClass().getResource("InitiatorMainPagePanel.fxml"));
			stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
			scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
		}else {
			warningLabel.setText("登入失敗。您尚未註冊!");
		}
		buyerScanner.close();
		initiatorScanner.close();
	}
}
