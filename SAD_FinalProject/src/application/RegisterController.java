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
import javafx.collections.FXCollections;

public class RegisterController {
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
	private ChoiceBox identityBox;

	@FXML
	private void initialize(){
		//identityBox.getItems().add("1");
		identityBox.setItems(identityList);
	}
	
	public void  switchtoLogin(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void  switchtoLogin_buyer(ActionEvent event) throws Exception{
		File buyerFile = new File("\\SAD_FinalProjectsrc\\application\\BuyerInfo.txt");
		Scanner buyerScanner = new Scanner(buyerFile);
		String buyerAccount = buyerScanner.next();
		String buyerPassward = buyerScanner.next();
		String buyerEmail = buyerScanner.next();
		
		if(accountField.getText().equals(buyerAccount)) {
			warningLabel.setText("帳號已被註冊");
		}else if(passwardField.getText().equals(checkPasswardField.getText())) {
			warningLabel.setText("您輸入的兩個密碼並不相符");
		}else if(accountField.getText().equals(null)||emailField.getText().equals(null)) {
			warningLabel.setText("請輸入完整的個人資訊");
		}else if(passwardField.getText().equals(null)||checkPasswardField.getText().equals(null)) {
			warningLabel.setText("請輸入完整的個人資訊");
		}else {
			warningLabel.setText("註冊成功，請返回登入介面");
		}
		buyerScanner.close();
		initiatorScanner.close();
		/*
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		*/
	}
	
	public void  switchtoLogin_init(ActionEvent event) throws Exception{
		File initFile = new File("\\SAD_FinalProjectsrc\\application\\InitiatorInfo.txt");
		Scanner initScanner = new Scanner(buyerFile);
		String initAccount = buyerScanner.next();
		String initPassward = buyerScanner.next();
		String initEmail = buyerScanner.next();
		String initIdentity = buyerScanner.next();
		
		if(accountField.getText().equals(initAccount)) {
			warningLabel.setText("帳號已被註冊");
		}else if(passwardField.getText().equals(checkPasswardField.getText())) {
			warningLabel.setText("您輸入的兩個密碼並不相符");
		}else if(accountField.getText().equals(null)||emailField.getText().equals(null)) {
			warningLabel.setText("請輸入完整的個人資訊");
		}else if(passwardField.getText().equals(null)||checkPasswardField.getText().equals(null)) {
			warningLabel.setText("請輸入完整的個人資訊");
		}else {
			warningLabel.setText("註冊成功，請返回登入介面");
		}
		buyerScanner.close();
		initiatorScanner.close();
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
