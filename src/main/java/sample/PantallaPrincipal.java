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



    @FXML
    public void clikcarBitacora() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Formulario.fxml"));
            Pane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 600, 440);
            stage.setResizable(false);
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

}