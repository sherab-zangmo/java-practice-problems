module com.example.contact_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contact_system to javafx.fxml;
    exports com.example.contact_system;
}