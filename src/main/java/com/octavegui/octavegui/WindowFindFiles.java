package com.octavegui.octavegui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class WindowFindFiles implements Initializable {

    @FXML
    private AnchorPane findFilesAnchorPane;

    @FXML
    protected void openFolderDirectory(ActionEvent event) {
        final DirectoryChooser dirchooser = new DirectoryChooser();

        Stage stage = (Stage) findFilesAnchorPane.getScene().getWindow();
        File file = dirchooser.showDialog(stage);

        if (file != null) {
            System.out.println("Path: " + file.getAbsolutePath());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
