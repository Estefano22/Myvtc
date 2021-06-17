package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Historico {

    PantallaPrincipal pantallaPrincipal;


    @FXML
    Label labelTituloFormulario;


    @FXML
    public void recibirTareaHistorico(Bitacora bitacora){
        labelTituloFormulario.setText(bitacora.titulo);

    }


}



