module com.example.stcs_webv {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.stcs_webv to javafx.fxml;
    exports com.example.stcs_webv;
}