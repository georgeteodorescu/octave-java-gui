package com.octavegui.octavegui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class WindowPreferences implements Initializable {
    @FXML
    private Spinner spinner3D;

    private void initSpinner() {
        spinner3D.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10)
        );
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initSpinner();
    }
}