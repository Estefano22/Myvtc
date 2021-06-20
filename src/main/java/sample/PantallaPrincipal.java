package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;


public class PantallaPrincipal {

    Formulario formulario;
    Detalles detalles;


    ArrayList<Bitacora> listadeBitacoras  = new ArrayList<>();


    @FXML
    public void clikcarBitacora() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Formulario.fxml"));
            Pane root = loader.load();
            stage.setTitle("Bitacora");
            Scene scene = new Scene(root, 600, 450);
            stage.setResizable(false);
            formulario = loader.getController();
            formulario.enviarControllerPrincipal(this);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void clikcarDetallesbitacora() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Detalles.fxml"));
            Pane root =  loader.load();
            stage.setTitle("Dettales Bitacora");
            Scene scene = new Scene(root, 600, 400);
            detalles = loader.getController();
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void recibirFormulario(Bitacora bitacora){
        listadeBitacoras.add(bitacora);
        detalles.recibirTareaHistorico(listadeBitacoras);
        detalles.recibirTareaHistorico2(listadeBitacoras);
        detalles.recibirTareaHistorico3(listadeBitacoras);
        detalles.recibirTareaHistorico4(listadeBitacoras);
        detalles.recibirTareaHistorico5(listadeBitacoras);
        detalles.recibirTareaHistorico6(listadeBitacoras);
        detalles.recibirTareaHistorico7(listadeBitacoras);
        detalles.recibirTareaHistorico8(listadeBitacoras);
        detalles.recibirTareaHistorico9(listadeBitacoras);
        detalles.recibirTareaHistorico10(listadeBitacoras);


    }

}