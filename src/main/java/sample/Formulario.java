package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Formulario {

    PantallaPrincipal pantallaPrincipal;


    @FXML
    public void initialize(){
    }

    @FXML
    TextField  TextFieldTitulo, TextFieldSalidaFecha, TextFieldDestinoFecha, TextFieldSalida,TextFieldDestino, TextFieldIngresos, TextFieldMercanciaTransportada, TextFieldToneladas,TextFieldKilometros, TextFieldLitros;

    @FXML
    Button BottonEnviar;


    @FXML
    public void onclickenviarFormulario(){
        Bitacora b = new Bitacora("Formulario1","23-03-2021","24-03-2021","Madrid","Paris",3000F,"Tomates",12F,2500F,14.3F);
        pantallaPrincipal.recibirFormulario(b);


// TODO llamar al controllerPantalla principal para llamar a una funcion que guarde la bitacora.
        // controllerPrincipal.enviarBitacora(new Bitacora(.....))
    }


    public void enviarControllerPrincipal(PantallaPrincipal pantallaPrincipal) {
        this.pantallaPrincipal = pantallaPrincipal;

    }
}



