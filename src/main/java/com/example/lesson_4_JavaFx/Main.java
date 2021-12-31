package com.example.lesson_4_JavaFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("sample1.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World"); // метод задает заголовок
        primaryStage.setScene(new Scene(root, 300, 275)); // метод позволяет настроить размер окна
        primaryStage.show(); // метод отображает форму на экране
    }

    public static void main(String[] args) {
        launch(args);
    }


//    public static void main(String[] args) {
//        launch();
//    }
}