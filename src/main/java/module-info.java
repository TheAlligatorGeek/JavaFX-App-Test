module com.example.testanother {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testanother to javafx.fxml;
    exports com.example.testanother;
}