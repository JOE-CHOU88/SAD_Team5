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
	@FXML private Label Dinfo;
	@FXML private Label Ddescrip;
	@FXML private Label Dplace;
	@FXML private Label Dtype;
	@FXML private Label Dend;
	@FXML private Label Dtime;
	@FXML private Label Dstart;
	@FXML private Label Dnum;
	@FXML private Label Dprice;
	@FXML private Label Dtitle;
	//@FXML private ImageView picture;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1){
		File file = new File("/Users/ihsuan/eclipse-workspace/0101sad/src/application/goodlist.txt");
		Scanner scanner;
		int i=1;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNext()&&i<11) {
				String info=scanner.next();
				switch(i) {
				case 1:
					Dtitle.setText(info);
					i++;
					break;
				case 2:
					Dprice.setText(info);
					i++;
					break;
				case 3:
					Dnum.setText(info);
					i++;
					break;
				case 4:
					Dtype.setText(info);
					i++;
					break;
				case 5:
					String timeString=info;
					info=scanner.next();
					timeString+=" "+info;
					Dstart.setText(timeString);
					i++;
					break;
				case 6:
					String timeS=info;
					info=scanner.next();
					timeS+=" "+info;
					Dend.setText(timeS);
					i++;
					break;
				case 7:
					Dtime.setText(info);
					i++;
					break;
				case 8:
					Dplace.setText(info);
					i++;
					break;
				case 9:
					Dinfo.setText(info);
					i++;
					break;
				case 10:
					Ddescrip.setText(info);
					i++;
					break;
				//case 11:
				//	String path="/Users/ihsuan/eclipse-workspace/0101sad/src/"+info;//C:\\Users\\Danny\\git\\sad\\SAD_FinalProject\\src\\
					//FileInputStream pic=new FileInputStream(path);
					//Image ig=new Image(pic);
				//	picture.setImage(new Image(new FileInputStream(path)));
				//	picture.setFitHeight(200);
				//	picture.setFitWidth(200);
				//	break;
					}
				}
			scanner.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
