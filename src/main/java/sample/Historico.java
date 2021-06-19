package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Historico {

    PantallaPrincipal pantallaPrincipal;
    DetallesBitacora detallesBitacora;
    Formulario formulario;

    ArrayList<Label> listadeLabel = new ArrayList();
    Bitacora bitacoraAux;
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

    public void recibirTareaHistorico(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(8);
        labelTituloFormulario1.setText(bitacoraAux.titulo);
        //for (int i = 0; i < listadeLabel.size(); i++)
        //  listadeLabel.get(i).setText(bitacora.get(i).titulo);

    }





           /* public  void rellenarLabel(String titulo){
        labelTituloFormulario1.setText(titulo);



         }*/






}


