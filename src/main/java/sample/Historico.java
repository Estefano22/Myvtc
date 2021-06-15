package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Historico {

Formulario formulario = null;


@FXML
    Label labelTituloFormulario;


    @FXML
public void recibirFormulario(Bitacora bitacora){
    labelTituloFormulario.setText(bitacora.textFieldTitulo);


}


}
