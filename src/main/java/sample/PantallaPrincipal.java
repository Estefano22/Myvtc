package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;


public class PantallaPrincipal {

    Formulario formulario;
    Historico historico;

    // TODO Crear una lista de bit♣coras.
    ArrayList<Bitacora> listadeBitacoras  = new ArrayList();

    @FXML
    public void initialize(){

        Bitacora bitacora1 = new Bitacora("primer viaje","23-03-2021","25-03-2021","Madrid","Paris",3000F,"Tomates",15F,2500F,25.4F);
        Bitacora bitacora2 = new Bitacora("segundo viaje","26-04-2021","28-04-2021","Paris","Milano",2700F,"Sal",25F,2700F,28.5F);
        Bitacora bitacora3 = new Bitacora("tercer viaje","25-04-2021","27-04-2021","Strasburg","Valladolid",2340F,"Pescado",17F,1500F,20.4F);
        Bitacora bitacora4 = new Bitacora("cuarto viaje","25-04-2021","27-04-2021","Madrid","Valencia",1000F,"Naranjas",15F,400F,15.4F);
        Bitacora bitacora5 = new Bitacora("quinto viaje","24-05-2021","26-05-2021","Amsterdam","Brno",2700F,"Patatas",10F,1000F,20.4F);
        Bitacora bitacora6 = new Bitacora("sexto viaje","27-03-2021","29-03-2021","Strasburg","Paris",2500F,"Neumaticos",15F,2400F,23.4F);
        Bitacora bitacora7 = new Bitacora("septimo viaje","23-03-2021","25-03-2021","Calais","Madrid",3000F,"Materiales de construccion",20F,2000F,25.4F);
        Bitacora bitacora8 = new Bitacora("octavo viaje","23-03-2021","25-03-2021","Graz","Paris",3000F,"Palets",5F,2350F,25.4F);


        listadeBitacoras.add(bitacora1);
        listadeBitacoras.add(bitacora2);
        listadeBitacoras.add(bitacora3);
        listadeBitacoras.add(bitacora4);
        listadeBitacoras.add(bitacora5);
        listadeBitacoras.add(bitacora6);
        listadeBitacoras.add(bitacora7);
        listadeBitacoras.add(bitacora8);

        //Binder.binder.bitacora(bitacora1,bitacora2,bitacora3,bitacora4,bitacora5,bitacora6,bitacora7,bitacora8);


    }



    @FXML
    public void clikcarBitacora() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Formulario.fxml"));
            Pane root = (AnchorPane) loader.load();
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
    public void clikcarHistorico() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Historico.fxml"));
            Pane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 650, 500);
            historico = loader.getController();

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
        if (historico == null) {
            clikcarHistorico();
        }
        historico.recibirTareaHistorico(listadeBitacoras);


    }


}