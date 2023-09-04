module com.example.dbdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.dbdemo to javafx.fxml;
    exports com.example.dbdemo;
}