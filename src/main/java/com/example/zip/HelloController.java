package com.example.zip;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    private Button btnDownload;

    @FXML
    private Button btnUpload;

    @FXML
    private Button btnZip;

    @FXML
    private PasswordField inputPassword;

    @FXML
    private TextField uploadInput;

    @FXML
    private VBox paneGrid;

    @FXML
    private GridPane gridBox;

}