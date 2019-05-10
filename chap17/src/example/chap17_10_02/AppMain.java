package example.chap17_10_02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = (Parent) FXMLLoader.load(getClass().getResource("root1.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toString());

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
