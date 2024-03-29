package com.example.guessflags;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class fourthController {
    @FXML
    private Label scoreLabel;
    @FXML
    private Button firstButton;
    private int score = 0;
    private Stage stage;
    private Scene scene;

    public void choose(ActionEvent e){

        if(e.getSource().equals(firstButton)){
            score++;
        }
        scoreLabel.setText("Score: " + score);
    }

    public void next(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fifthScene.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
