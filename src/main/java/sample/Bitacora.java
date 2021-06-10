package sample;

public class Bitacora {


    public String salidaFechaHora;
    public String destinoFechaHora;
    public String salida;
    public String destino;
    public Float ingresos;
    public String mercanciaTransportada;
    public Float toneladas;
    public Float distanciaConducida;
    public Float consumodeCombustible;

    public Bitacora (String salidaFechaHora, String destinoFechaHora, String salida,  String destino, Float ingresos ,String mercanciaTransportada, Float toneladas, Float distanciaConducida, Float consumodeCombustible ){
        this.salidaFechaHora = salidaFechaHora;
        this.destinoFechaHora = destinoFechaHora;
        this.salida = salida;
        this.destino = destino;
        this.ingresos = ingresos;
        this.mercanciaTransportada = mercanciaTransportada;
        this.toneladas = toneladas;
        this.distanciaConducida = distanciaConducida;
        this.consumodeCombustible = consumodeCombustible;
    }

}
