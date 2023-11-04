module com.example.alogtraining {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.alogtraining to javafx.fxml;
    exports com.example.alogtraining;
}