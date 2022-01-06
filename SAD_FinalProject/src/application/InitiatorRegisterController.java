package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class InitiatorRegisterController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private ObservableList<String> identityList = FXCollections.observableArrayList("個人", "零售商", "製造商");
	//private ChoiceBox<String> identity=new ChoiceBox<String>();
	//private String [] identityArray= {"個人", "零售商", "製造商"};
	
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
	@FXML
	private ChoiceBox<String> identityBox;

	@FXML
	private void initialize(){
		//identityBox.getItems().add("1");
		identityBox.setItems(identityList);
		//identityBox.setValue("Choose an identity");
	}
	
	public void  switchtoLogin(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	public void  switchtoLogin_init(ActionEvent event) throws Exception{
		File buyerFile = new File("SAD_FinalProject\\src\\application\\InitiatorInfo.txt");
		File initFile = new File("SAD_FinalProject\\src\\application\\InitiatorInfo.txt");
		Scanner initScanner = new Scanner(initFile);
		String initAccount = initScanner.next();
		String initPassward = initScanner.next();
		String initEmail = initScanner.next();
		String initIdentity = initScanner.next();
		
		//Check if user has filled in all the info
		if(accountField.getText().equals("")) {
			warningLabel.setText("請輸入帳號");
			initScanner.close();
			return;
		}
		if(passwardField.getText().equals("")) {
			warningLabel.setText("請輸入密碼");
			initScanner.close();
			return;
		}
		if(checkPasswardField.getText().equals("")) {
			warningLabel.setText("請輸入確認密碼");
			initScanner.close();
			return;
		}
		if(emailField.getText().equals("")) {
			warningLabel.setText("請輸入信箱");
			initScanner.close();
			return;
		}
		if(identityBox.getValue().equals("Choose an identity")) {
			warningLabel.setText("請選擇身分");
			initScanner.close();
			return;
		}
		
		//Other error handling
		if(accountField.getText().equals(initAccount)) {
			warningLabel.setText("帳號已被註冊");
			initScanner.close();
			return;
		}
		if(!passwardField.getText().equals(checkPasswardField.getText())) {
			warningLabel.setText("您輸入的兩個密碼並不相符");
			initScanner.close();
			return;
		}
		if(accountField.getText().equals(null)||emailField.getText().equals(null)) {
			warningLabel.setText("請輸入完整的個人資訊");
			initScanner.close();
			return;
		}
		if(passwardField.getText().equals(null)||checkPasswardField.getText().equals(null)) {
			warningLabel.setText("請輸入完整的個人資訊");
			initScanner.close();
			return;
		}

		warningLabel.setText("註冊成功，請返回登入介面");
		initScanner.close();
	}
	
	//@Override
	/*public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		identity.getItems().addAll(identityArray);
	}
	public void choiceBox() {
		identity.getItems().addAll(identityArray);
	}*/
}
