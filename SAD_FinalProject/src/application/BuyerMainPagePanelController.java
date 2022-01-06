package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BuyerMainPagePanelController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchtoBuyerAccountPanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("BuyerAccountPanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchtoProductDetailPanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("BuyerProductDetailPanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchtoBuyerSearchResultPanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("BuyerSearchResultPanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchtoLoginPanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
//	@FXML private Label password;
//	@FXML private Label email;
//	@FXML private Label account;
//	@FXML private Label balance;
//	@FXML private Label goodinfo;
//	@FXML private AnchorPane goodList;
//	@FXML private Tab recordTab;
//	
//	public void initialize(URL arg0, ResourceBundle arg1){
//		// TODO Auto-generated method stub
//		File file = new File("C:\\\\Users\\\\Danny\\\\git\\\\sad\\\\SAD_FinalProject\\\\src\\\\application\\\\goodList.txt");
//		Scanner scanner;
//		int i=1;
//		try {
//			scanner = new Scanner(file);
//			while(scanner.hasNextLine()&&i<=5) {
//				String info=scanner.next();
//				switch(i) {
//				case 1:
//					account.setText(info);
//					i++;
//					break;
//				case 2:
//					password.setText(info);
//					i++;
//					break;
//				case 3:
//					email.setText(info);
//					i++;
//					break;
//				case 4:
//					balance.setText(info);
//					i++;
//					break;
//				case 5:
//					if(info.equals(null)) {
//						goodinfo.setText("您尚未發起任何團購");
//					}else {
//						showInfo(info);
//					}
//					i++;
//				}	
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
}
