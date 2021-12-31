module com.example.home_work_4_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.home_work_4_javafx to javafx.fxml;
    exports com.example.home_work_4_javafx;
}