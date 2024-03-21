package com.corse.workshopjavafxjdbc;

import com.corse.workshopjavafxjdbc.model.entities.Department;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class DepartmentListController implements Initializable {

    @FXML
    private TableView<Department> tableViewDepartment;

    @FXML
    private TableColumn<Department, Long> tableColumnId;

    @FXML
    private TableColumn<Department, String> tableColumnName;

    @FXML
    private Button btnNew;

    @FXML
    public void onBtnNewAction(){
        System.out.println("onBtnNewAction");
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        initializeNode();
    }

    public void initializeNode(){
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        Stage stage = (Stage) MainApplication.getMainScene().getWindow();
        tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
    }
}
