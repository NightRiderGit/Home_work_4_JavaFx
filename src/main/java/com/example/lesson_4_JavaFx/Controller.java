package com.example.lesson_4_JavaFx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
//    @FXML
//    private Label welcomeText;

    @FXML
    TextArea mainTextArea;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }

    public void btnOneClickAction(ActionEvent actionEvent) {
        mainTextArea.appendText("1\n");
//        Button thisButton = (Button)actionEvent.getSource();
//        System.out.println(1);
    }
}