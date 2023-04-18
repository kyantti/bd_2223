package es.unex.cum.bd.practica.controller;

import java.io.IOException;

import es.unex.cum.bd.practica.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("/es/unex/cum/bd/practica/view/secondary");
    }
}
