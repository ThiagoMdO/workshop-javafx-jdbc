package com.corse.workshopjavafxjdbc;

import com.corse.workshopjavafxjdbc.gui.util.Alerts;
import com.corse.workshopjavafxjdbc.model.services.DepartmentService;
import com.corse.workshopjavafxjdbc.model.services.SellerService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

public class MainController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction() {
        loadView("SellerList.fxml", (SellerListController controler) -> {
            controler.setSellerServices(new SellerService());
            controler.updateTableView();
        });
    }

    @FXML
    public void onMenuItemDepartmentAction() {
        loadView("DepartmentList.fxml", (DepartmentListController controler) -> {
            controler.setDepartmentServices(new DepartmentService());
            controler.updateTableView();
        });
    }

    @FXML
    public void onMenuItemAboutAction() {
        loadView("About.fxml", x -> {});
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private synchronized <T> void loadView(String absoluteName, Consumer<T> initializationAction) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = loader.load();

            Scene mainScene = MainApplication.getMainScene();
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVBox.getChildren());

            T controler = loader.getController();
            initializationAction.accept(controler);

        } catch (IOException e) {
            Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), Alert.AlertType.ERROR);
        }
    }



}
