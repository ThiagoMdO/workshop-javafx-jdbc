package com.corse.workshopjavafxjdbc;

import com.corse.workshopjavafxjdbc.gui.util.Constraints;
import com.corse.workshopjavafxjdbc.model.entities.Department;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentFormController implements Initializable {

    private Department entity;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private Label labelErrorName;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnCancel;

    public void setEntity(Department entity) {
        this.entity = entity;
    }

    @FXML
    public void onBtnSaveAction() {
        System.out.println("onBtnSaveAction");
    }

    @FXML
    public void onBtnCancelAction() {
        System.out.println("onBtnCancelAction");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeNodes();
    }

    public void initializeNodes() {
        Constraints.setFieldInteger(txtId);
        Constraints.setTextFieldMaxLength(txtName, 30);
    }

    public void updateFormData() {
        if (entity == null) throw new IllegalStateException("Entity was null");
        txtId.setText(String.valueOf(entity.getId()));
        txtName.setText(entity.getName());
    }
}
