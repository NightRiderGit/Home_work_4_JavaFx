package com.example.home_work_4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller_home_4 {

    @FXML
    TextArea mainTextArea;

    @FXML
    TextField mainTextField;

    public void sendClick() {
        mainTextArea.appendText(mainTextField.getText() + "\n");
        mainTextField.clear();
    }

    public void enter(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER) {
            sendClick();
        }
    }

}