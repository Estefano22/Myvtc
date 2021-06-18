package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Historico {

    PantallaPrincipal pantallaPrincipal;

    ArrayList<Label> listadeLabel = new ArrayList();
    @FXML
    Label labelTituloFormulario1, labelTituloFormulario2, labelTituloFormulario3, labelTituloFormulario4,labelTituloFormulario5,labelTituloFormulario6,labelTituloFormulario7,labelTituloFormulario8;


    public void initialize() {
        listadeLabel.add(labelTituloFormulario1);
        listadeLabel.add(labelTituloFormulario2);
        listadeLabel.add(labelTituloFormulario3);
        listadeLabel.add(labelTituloFormulario4);
        listadeLabel.add(labelTituloFormulario5);
        listadeLabel.add(labelTituloFormulario6);
        listadeLabel.add(labelTituloFormulario7);
        listadeLabel.add(labelTituloFormulario8);

    }

    @FXML
    public void recibirTareaHistorico(ArrayList<Bitacora> bitacora) {

        for (int i = 0; i < listadeLabel.size(); i++) {
            listadeLabel.get(i).setText(bitacora.get(i).titulo);
        }
    }
}
