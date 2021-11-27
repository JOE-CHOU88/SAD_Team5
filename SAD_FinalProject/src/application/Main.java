package application;

	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("MainPagePanel.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		JFrame frame = new JFrame("衣服團購系統");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 600);
		/*
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0,0,484,411);
		frame.getContentPane().add(scrollPane);
		*/
		InitiatePanel initiatePanel = new InitiatePanel();
		frame.add(initiatePanel);
		//scrollPane.add(initiatePanel);
		
		frame.setVisible(true);
	}
}
