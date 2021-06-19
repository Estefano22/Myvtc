package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DetallesBitacora {

    PantallaPrincipal pantallaPrincipal;
    Formulario formulario;
    Historico historico;

    @FXML
    Label labelDetallesBitacoraSalida, labelDetallesBitacoraDestino, labelDetallesBitacoraIngresos,labelDetallesBitacoraMercancia,labelDetallesBitacoraKilometros;




    public void detallesBitacora(Bitacora bitacora){
        labelDetallesBitacoraSalida.setText(bitacora.salida);
        labelDetallesBitacoraDestino.setText(bitacora.destino);
        labelDetallesBitacoraIngresos.setText(String.valueOf(bitacora.ingresos));
        labelDetallesBitacoraMercancia.setText(bitacora.mercanciaTransportada);
        labelDetallesBitacoraKilometros.setText(String.valueOf(bitacora.distanciaConducida));


    }
    @FXML
    public void clikcarLabel1(){

        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/DetallesBitacora.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root,650,500);
            stage.setScene(scene);
            historico  = loader.getController();
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }


}
