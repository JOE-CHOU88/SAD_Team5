module TestGUI {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	requires java.desktop;
	requires javafx.base;
}
