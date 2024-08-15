package com.octavegui.octavegui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.ResourceBundle;

public class SetPath implements Initializable {
    @FXML
    private ListView<String> listView;
    ObservableList<String> list=(ObservableList<String>) FXCollections.observableArrayList("C:\\Program Files\\GNU Octave\\Octave-8.1.0", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\clang32", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\clang32\\include", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\clang32\\lib", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\clang32\\share", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\clang64", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\clang64\\bin", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\clang64\\etc", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\clang64\\include", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\clang64\\share", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\notepad++\\autoCompletion", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\notepad++\\updater", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\var\\cache\\man", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\var\\cache\\pacman\\pkg", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\var\\empty", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\var\\log\\old", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\include\\python3.10\\cpython", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\include\\python3.10\\internal", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\pkgconfig", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\python3.10\\__pycache__", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\python3.10\\config-3.10-x86_64-msys\\__pycache__", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\python3.10\\curses\\__pycache__", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\python3.10\\turtledemo", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\pkcs11", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\perl5\\core_perl\\auto\\attributes", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\perl5\\core_perl\\auto\\Compress\\Raw\\Bzip2", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\perl5\\core_perl\\auto\\Compress\\Raw\\Zlib", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\perl5\\core_perl\\auto\\DB_File", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\perl5\\core_perl\\auto\\Filter\\Util\\Call", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\perl5\\core_perl\\auto\\IO", "C:\\Program Files\\GNU Octave\\Octave-8.1.0\\usr\\lib\\perl5\\core_perl\\auto\\GDBM_File");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.setItems(list);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
}