module es.unex.cum.bd.practica {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    

    opens es.unex.cum.bd.practica to javafx.fxml;
    exports es.unex.cum.bd.practica to javafx.graphics;
    
    opens es.unex.cum.bd.practica.controller to javafx.fxml;
    exports es.unex.cum.bd.practica.controller to javafx.fxml;
}
