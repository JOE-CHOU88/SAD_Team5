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

public class BuyerRegisterController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private TextField accountField;
	@FXML
	private TextField passwardField;
	@FXML
	private TextField checkPasswardField;
	@FXML
	private TextField emailField;
	@FXML
	private Label warningLabel;
	public void  switchtoLogin(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void  switchtoLogin_buyer(ActionEvent event) throws Exception{
		File buyerFile = new File("C:\\Users\\Danny\\git\\sad\\SAD_FinalProject\\src\\application\\BuyerInfo.txt");
		Scanner buyerScanner = new Scanner(buyerFile);
		String buyerAccount = buyerScanner.next();
		String buyerPassward = buyerScanner.next();
		String buyerEmail = buyerScanner.next();
		
		//Check if user has filled in all the info
		if(accountField.getText().equals("")) {
			warningLabel.setText("請輸入帳號");
			buyerScanner.close();
			return;
		}
		if(passwardField.getText().equals("")) {
			warningLabel.setText("請輸入密碼");
			buyerScanner.close();
			return;
		}
		if(checkPasswardField.getText().equals("")) {
			warningLabel.setText("請輸入確認密碼");
			buyerScanner.close();
			return;
		}
		if(emailField.getText().equals("")) {
			warningLabel.setText("請輸入信箱");
			buyerScanner.close();
			return;
		}
		
		//Other error handling
		if(accountField.getText().equals(buyerAccount)) {
			warningLabel.setText("帳號已被註冊");
			buyerScanner.close();
			return;
		}
		if(!passwardField.getText().equals(checkPasswardField.getText())) {
			warningLabel.setText("您輸入的兩個密碼並不相符");
			buyerScanner.close();
			return;
		}
		if(accountField.getText().equals(null)||emailField.getText().equals(null)) {
			warningLabel.setText("請輸入完整的個人資訊");
			buyerScanner.close();
			return;
		}
		if(passwardField.getText().equals(null)||checkPasswardField.getText().equals(null)) {
			warningLabel.setText("請輸入完整的個人資訊");
			buyerScanner.close();
			return;
		}
		warningLabel.setText("註冊成功，請返回登入介面");
		buyerScanner.close();
		/*
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		*/
	}
}
