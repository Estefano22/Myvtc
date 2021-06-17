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

        try {
            Bitacora b = new Bitacora();
            b.titulo = TextFieldTitulo.getText();
            b.salidaFecha = TextFieldSalidaFecha.getText();
            b.destinoFecha = TextFieldDestinoFecha.getText();
            b.salida = TextFieldSalida.getText();
            b.destino = TextFieldDestino.getText();
            b.ingresos = Float.valueOf(TextFieldIngresos.getText());
            b.mercanciaTransportada = TextFieldMercanciaTransportada.getText();
            b.toneladas = Float.valueOf(TextFieldToneladas.getText());
            b.distanciaConducida = Float.valueOf(TextFieldKilometros.getText());
            b.consumodeCombustible = Float.valueOf(TextFieldLitros.getText());
            pantallaPrincipal.recibirFormulario(b);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ha fallado la creaci♥n de la bit♣cora");
        }

        //bitacoraRecibida = new Bitacora(bitacora.textFieldTitulo,bitacora.salidaFecha,bitacora.destinoFecha,bitacora.salida,bitacora.destino,bitacora.ingresos,bitacora.mercanciaTransportada,bitacora.toneladas,bitacora.distanciaConducida,bitacora.consumodeCombustible);
        // Bitacora b = new Bitacora("primer viaje","23-03-2021","24-03-2021","Madrid","Paris",3000F,"Tomates",12F,2500F,14.3F);
        //pantallaPrincipal.recibirFormulario(b);

    }


    public void enviarControllerPrincipal(PantallaPrincipal pantallaPrincipal) {
        this.pantallaPrincipal = pantallaPrincipal;


    }
}



