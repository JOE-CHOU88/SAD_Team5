package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class InitiatorAccountPanelController implements Initializable {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void  switchtoInitiatorMainPagePanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("InitiatorMainPagePanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML private Label password;
	@FXML private Label email;
	@FXML private Label account;
	@FXML private Label balance;
	@FXML private Label goodinfo;
	@FXML private AnchorPane goodList;
	@FXML private Tab recordTab;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1){
		// TODO Auto-generated method stub
		File file = new File("C:\\\\Users\\\\Danny\\\\git\\\\sad\\\\SAD_FinalProject\\\\src\\\\application\\\\InitiatorInfo.txt");
		Scanner scanner;
		int i=1;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()&&i<=5) {
				String info=scanner.next();
				switch(i) {
				case 1:
					account.setText(info);
					i++;
					break;
				case 2:
					password.setText(info);
					i++;
					break;
				case 3:
					email.setText(info);
					i++;
					break;
				case 4:
					balance.setText(info);
					i++;
					break;
				case 5:
					if(info.equals(null)) {
						goodinfo.setText("您尚未發起任何團購");
					}else {
						showInfo(info);
					}
					i++;
				}	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void showInfo(String keyword){
		File file = new File("C:\\\\Users\\\\Danny\\\\git\\\\sad\\\\SAD_FinalProject\\\\src\\\\application\\\\goodList.txt");
		Scanner scanner;
		String result="";
		String path="";
		try {
			scanner = new Scanner(file);
			while(scanner.hasNext()) {
				String in=scanner.next();
				if(in.equals(keyword)) {
					result+="標題："+in+"\n";
					for(int j=0;j<12;j++) {
						in=scanner.next();
						switch(j) {
						case 0:
							result+="單價：$"+in+"\n";
							break;
						case 1:
							result+="數量門檻："+in+"\n";
							break;
						case 5:
							result+="結束時間："+in;
							break;
						case 6:
							result+=" "+in;
							break;
						case 11:
							path=in;
							break;
						}
					}
					path="C:\\\\Users\\\\Danny\\\\git\\\\sad\\\\SAD_FinalProject\\\\src\\\\"+path;
					FileInputStream pic=new FileInputStream(path);
					Image ig=new Image(pic);
					ImageView image=new ImageView(ig);
					image.setFitHeight(200);
					image.setFitWidth(200);
					Button button=new Button(result,image);
					button.autosize();
					//EventHandler<ActionEvent> eventh = new EventHandler<ActionEvent>() { 
			          //  public void handle(ActionEvent event) 
			            //{ 
			            //	try {
						//		root = FXMLLoader.load(getClass().getResource("InitiatorProductDetailPanel.fxml"));
						//		stage= (Stage) ((Node)(event).getSource()).getScene().getWindow();
				        //		scene=new Scene(root);
				        //		stage.setScene(scene);
				        //		stage.show();
						//	} catch (IOException e) {
						//		// TODO Auto-generated catch block
						//		e.printStackTrace();
						//	}
			            //} 
			        //};
			        //button.setOnAction(eventh);
					goodList.getChildren().add(button);
					goodList.setTopAnchor(button,30.0);
					goodList.setLeftAnchor(button,100.0);
					recordTab=new Tab();
					recordTab.setContent(goodList);
				}
			}
			scanner.close();
		} catch (FileNotFoundException ef) {
			// TODO Auto-generated catch block
			ef.printStackTrace();
		}
	}
	
}

