package es.unex.cum.bd.practica.controller;

import java.io.IOException;

import es.unex.cum.bd.practica.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("/es/unex/cum/bd/practica/view/primary");
    }
}