module com.example.fx_lesson2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx_lesson2 to javafx.fxml;
    exports com.example.fx_lesson2;
}