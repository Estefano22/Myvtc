package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Historico {

    PantallaPrincipal pantallaPrincipal;

    ArrayList<Label> listadeLabel = new ArrayList();
    @FXML
    Label labelTituloFormulario1, labelTituloFormulario2, labelTituloFormulario3, labelTituloFormulario4,labelTituloFormulario5,labelTituloFormulario6,labelTituloFormulario7,labelTituloFormulario8;


    @FXML
    public void recibirTareaHistorico(Bitacora bitacora){
        for (int i = 0; i< listadeLabel.size(); i++)
            labelTituloFormulario1.setText(bitacora.titulo);
            labelTituloFormulario2.setText(bitacora.titulo);
            labelTituloFormulario3.setText(bitacora.titulo);
            labelTituloFormulario4.setText(bitacora.titulo);
            labelTituloFormulario5.setText(bitacora.titulo);
            labelTituloFormulario6.setText(bitacora.titulo);
            labelTituloFormulario7.setText(bitacora.titulo);
            labelTituloFormulario8.setText(bitacora.titulo);


    }


}



