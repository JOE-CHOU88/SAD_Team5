package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BuyerAccountPanelController implements Initializable{
	private Stage stage;
	private Scene scene;
	private Parent root;
	public int total,org;
	public String keyword;
	
	public void  switchtoBuyerMainPagePanel(ActionEvent event) throws Exception{
		root = FXMLLoader.load(getClass().getResource("BuyerMainPagePanel.fxml"));
		stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML private Label bPassword;
	@FXML private Label bEmail;
	@FXML private Label bAccount;
	@FXML private Label bBalance;
	@FXML private Label original;
	@FXML private Label after;
	@FXML private Label bGoodinfo;
	@FXML private AnchorPane bGoodList;
	@FXML private Tab bRecordTab;
	@FXML private TextField chargeField;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1){
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Danny\\git\\sad\\SAD_FinalProject\\src\\application\\BuyerInfo.txt");
		Scanner scanner;
		int i=1;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()&&i<=5) {
				String info=scanner.next();
				switch(i) {
				case 1:
					bAccount.setText(info);
					i++;
					break;
				case 2:
					bPassword.setText(info);
					i++;
					break;
				case 3:
					bEmail.setText(info);
					i++;
					break;
				case 4:
					original.setText(info);
					bBalance.setText(info);
					org=Integer.parseInt(info);
					i++;
					break;
				case 5:
					if(info.equals(null)) {
						bGoodinfo.setText("您尚未下訂任何團購");
						}else {
							addGoodListPanel(info);
							}
					i++;
					}
				}
			scanner.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void addGoodListPanel(String info){
		File file = new File("");
		Scanner scanner;
		String result="";
		String path="";
		try {
			scanner = new Scanner(file);
			while(scanner.hasNext()) {
				String in=scanner.next();
				if(in.equals(info)) {
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
					path="C:\\Users\\Danny\\git\\sad\\SAD_FinalProject\\src\\"+path;
					FileInputStream pic=new FileInputStream(path);
					Image ig=new Image(pic);
					ImageView image=new ImageView(ig);
					image.setFitHeight(200);
					image.setFitWidth(200);
					Button button=new Button(result,image);
					button.autosize();
					//EventHandler<ActionEvent> eventh = new EventHandler<ActionEvent>() { 
			        //    public void handle(ActionEvent event) 
			        //    { 
			        //    	try {
					//			root = FXMLLoader.load(getClass().getResource("BuyerProductDetailPanel.fxml"));
					//			stage= (Stage) ((Node)(event).getSource()).getScene().getWindow();
				      //  		scene=new Scene(root);
				      //  		stage.setScene(scene);
				       // 		stage.show();
					//		} catch (IOException e) {
								// TODO Auto-generated catch block
					//			e.printStackTrace();
					//		}
			        //    } 
			        //};
			       // button.setOnAction(eventh);
					bGoodList.getChildren().add(button);
					bGoodList.setTopAnchor(button,30.0);
					bGoodList.setLeftAnchor(button,75.0);
					bRecordTab=new Tab();
					bRecordTab.setContent(bGoodList);
				}
			}
			scanner.close();
		} catch (FileNotFoundException ef) {
			// TODO Auto-generated catch block
			ef.printStackTrace();
		}
	}
	public void chargeCenter(ActionEvent event)throws Exception{
		if(chargeField.getText().isEmpty()){ //isBlank
			final Alert alert=new Alert(AlertType.ERROR,"請輸入加值金額");
			alert.setHeaderText("");
			alert.showAndWait();
		}else if(isNumeric(chargeField.getText())) {
			String amount=chargeField.getText();
			final Alert comfirm=new Alert(AlertType.CONFIRMATION,"加值金額："+amount,ButtonType.YES,ButtonType.CANCEL);
			comfirm.setTitle("加值確認");
			comfirm.setHeaderText("");
			comfirm.showAndWait();
			if(comfirm.getResult()==ButtonType.YES) {
				total=Integer.parseInt(amount)+Integer.parseInt(original.getText());
				after.setText("$"+Integer.toString(total));
				bBalance.setText(Integer.toString(total));
				updateBalance();
			}else{
				chargeField.clear();
			}
			chargeField.clear();
		}else {
			final Alert alert=new Alert(AlertType.ERROR,"請輸入加值金額");
			alert.setHeaderText("");
			alert.showAndWait();
			chargeField.clear();
		}
	}
	public static boolean isNumeric(String num) {
		for(int i=0;i<num.length();i++) {
			if(!Character.isDigit(num.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public void updateBalance() {
		StringBuffer string=new StringBuffer();
		try {
			File file = new File("C:\\Users\\Danny\\git\\sad\\SAD_FinalProject\\src\\application\\BuyerInfo.txt");
			BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf8"));
			while(br.ready()) {
				String brString=br.readLine();
				if(brString.length()>0) {
					int c=brString.charAt(0);
					if(c==65279) {
						brString=brString.substring(1,brString.length());
					}
					string.append(brString+" ");
				}
			}
			br.close();
			String txt=string.toString();
			txt=txt.replaceAll(Integer.toString(org),Integer.toString(total));
			try {
				BufferedWriter bw=new BufferedWriter(new FileWriter(file));
				int first=0;
				for(int i=0;i<txt.length();i++) {
					char a=txt.charAt(i);
					if(a==' ') {
						bw.write(txt.substring(first, i));
						bw.newLine();
						first=i+1;
					}
				}
				bw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

