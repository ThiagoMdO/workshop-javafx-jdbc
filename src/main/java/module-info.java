module com.corse.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.corse.workshopjavafxjdbc to javafx.fxml;
    exports com.corse.workshopjavafxjdbc;
    opens com.corse.workshopjavafxjdbc.model.entities;
}
