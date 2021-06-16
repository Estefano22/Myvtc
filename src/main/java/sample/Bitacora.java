package sample;

public class Bitacora {

    public String titulo;
    public String salidaFecha;
    public String destinoFecha;
    public String salida;
    public String destino;
    public Float ingresos;
    public String mercanciaTransportada;
    public Float toneladas;
    public Float distanciaConducida;
    public Float consumodeCombustible;

    public Bitacora (){

    };


    public Bitacora (String titulo, String salidaFecha, String destinoFecha, String salida,  String destino, Float ingresos ,String mercanciaTransportada, Float toneladas, Float distanciaConducida, Float consumodeCombustible ){

        this.titulo = titulo;
        this.salidaFecha = salidaFecha;
        this.destinoFecha = destinoFecha;
        this.salida = salida;
        this.destino = destino;
        this.ingresos = ingresos;
        this.mercanciaTransportada = mercanciaTransportada;
        this.toneladas = toneladas;
        this.distanciaConducida = distanciaConducida;
        this.consumodeCombustible = consumodeCombustible;
    }

}
