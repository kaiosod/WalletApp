module com.example.walletapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.walletapp to javafx.fxml;
    exports com.example.walletapp;
}