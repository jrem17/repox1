package com.cerberus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

// TT --
public class HelloWorld extends Application {
	/*
	 * (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	public void start(Stage stage) {
		
		Label message = new Label("Hello, JavaFX!");
		message.setFont(new Font(100));
		stage.setScene(new Scene(message));
		stage.setTitle("Hello");
		stage.show();
	}

	
}
