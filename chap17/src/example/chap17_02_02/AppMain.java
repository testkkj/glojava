package example.chap17_02_02;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {

	public void AppMain() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": AppMain() ȣ��");

	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": init() ȣ��");

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + ": start() ȣ��");

	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": stop() ȣ��");

	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": AppMain() ȣ��");
		launch(args);

	}
}
