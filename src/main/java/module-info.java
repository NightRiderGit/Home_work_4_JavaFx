module com.example.home_work_4_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson_4_JavaFx to javafx.fxml;
    opens com.example.home_work_4 to javafx.fxml;
    exports com.example.lesson_4_JavaFx;
    exports com.example.home_work_4;
}