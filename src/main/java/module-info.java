module com.corse.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.corse.workshopjavafxjdbc to javafx.fxml;
    exports com.corse.workshopjavafxjdbc;
}