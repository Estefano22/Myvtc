package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PantallaPrincipal {

    Formulario formulario = null;

    @FXML
    public void initialize(){

        var bitacora = new Bitacora("primer viaje","23-03-2021","25-03-2021","Madrid","Paris",3000F,"Tomates",15F,2500F,25.4F);

    }


    @FXML
    public void clikcarBitacora() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Formulario.fxml"));
            Pane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 600, 450);
            stage.setResizable(false);
            Formulario controller2 = loader.getController();
            controller2.enviarControllerPrincipal(this);
            // TODO Coger el controller y enviar this.
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void clikcarHistorico() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Historico.fxml"));
            Pane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 650, 500);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void recibirFormulario(Bitacora bitacora){

    bitacora.
    }


}