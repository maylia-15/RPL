module com.example.rpl {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rpl to javafx.fxml;
    exports com.example.rpl;
}