package example.chap17_05_02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;

	public static void main(String[] args) {

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				handleBtn1Action(event);

			}

		});

		btn2.setOnAction(event -> handleBtn2Action(event));
		btn3.setOnAction(event -> handleBtn3Action(event));

	}

	protected void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼1 클릭");

	}

	protected void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼2 클릭");

	}

	protected void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼3 클릭");

	}

}
