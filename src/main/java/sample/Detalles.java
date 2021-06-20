package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Detalles {


    ArrayList<Label> listadeLabel = new ArrayList();

    Bitacora bitacoraAux;

    @FXML
    Label labelTituloFormulario1, labelTituloFormulario2, labelTituloFormulario3, labelTituloFormulario4,labelTituloFormulario5,labelTituloFormulario6,labelTituloFormulario7,labelTituloFormulario8,labelTituloFormulario9, labelTituloFormulario10;


    public void initialize() {
        listadeLabel.add(labelTituloFormulario1);
        listadeLabel.add(labelTituloFormulario2);
        listadeLabel.add(labelTituloFormulario3);
        listadeLabel.add(labelTituloFormulario4);
        listadeLabel.add(labelTituloFormulario5);
        listadeLabel.add(labelTituloFormulario6);
        listadeLabel.add(labelTituloFormulario7);
        listadeLabel.add(labelTituloFormulario8);
        listadeLabel.add(labelTituloFormulario9);
        listadeLabel.add(labelTituloFormulario10);



    }


    public void recibirTareaHistorico(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(0);
        labelTituloFormulario1.setText(bitacoraAux.titulo);

    }

    public void recibirTareaHistorico2(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(1);
       labelTituloFormulario2.setText(bitacoraAux.salidaFecha);

    }
    public void recibirTareaHistorico3(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(2);
        labelTituloFormulario3.setText(bitacoraAux.destinoFecha);

    }
    public void recibirTareaHistorico4(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(3);
        labelTituloFormulario4.setText(bitacoraAux.salida);

    }
    public void recibirTareaHistorico5(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(4);
        labelTituloFormulario5.setText(bitacoraAux.destino);

    }
    public void recibirTareaHistorico6(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(5);
        labelTituloFormulario6.setText(String.valueOf(bitacoraAux.ingresos));

    }
    public void recibirTareaHistorico7(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(6);
        labelTituloFormulario7.setText(bitacoraAux.mercanciaTransportada);

    }
    public void recibirTareaHistorico8(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(7);
        labelTituloFormulario8.setText(String.valueOf(bitacoraAux.toneladas));

    }
    public void recibirTareaHistorico9(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(8);
        labelTituloFormulario9.setText(String.valueOf(bitacoraAux.distanciaConducida));

    }
    public void recibirTareaHistorico10(ArrayList<Bitacora> bitacora) {

        bitacoraAux = bitacora.get(9);
        labelTituloFormulario10.setText(String.valueOf(bitacoraAux.consumodeCombustible));

    }




}


