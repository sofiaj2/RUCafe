module com.example.rucafeinterface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rucafeinterface to javafx.fxml;
    exports com.example.rucafeinterface;
}