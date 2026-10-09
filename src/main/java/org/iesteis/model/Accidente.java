package org.iesteis.model;

public class Accidente {
    private int numExpediente;
    private String fecha;
    private String hora;
    private String localizacion;
    private int numero;
    private int codigoDistrito;
    private String distrito;
    private String tipoAccidente;
    private String estadoMeteorologico;
    private String tipoVehiculo;
    private String tipoPersona;
    private String rangoEdad;
    private String sexo;
    private String lesividad;
    private int coordenadaX;
    private int coordenadaY;
    private boolean positivaAlcohol;
    private boolean positivaDrogas;




    Accidente(int numExpediente, String fecha, String hora, String localizacion, int numero, int codigoDistrito, String distrito,
              String tipoAccidente, String estadoMeteorologico, String tipoVehiculo, String tipoPersona,
              String rangoEdad, String sexo, String lesividad, int coordenadaX, int coordenadaY, boolean positivaAlcohol,
              boolean positivaDrogas) {
        this.numExpediente = numExpediente;
        this.fecha = fecha;
        this.hora = hora;
        this.localizacion = localizacion;
        this.numero = numero;
        this.codigoDistrito = codigoDistrito;
        this.distrito = distrito;
        this.tipoAccidente = tipoAccidente;
        this.estadoMeteorologico = estadoMeteorologico;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoPersona = tipoPersona;
        this.rangoEdad = rangoEdad;
        this.sexo = sexo;
        this.lesividad = lesividad;
        this.coordenadaX= coordenadaX;
        this.coordenadaY = coordenadaY;
        this.positivaAlcohol = positivaAlcohol;
        this.positivaDrogas = positivaDrogas;

    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public int getNumero() {
        return numero;
    }

    public int getCodigoDistrito() {
        return codigoDistrito;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public String getEstadoMeteorologico() {
        return estadoMeteorologico;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getLesividad() {
        return lesividad;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public boolean isPositivaAlcohol() {
        return positivaAlcohol;
    }

    public boolean isPositivaDrogas() {
        return positivaDrogas;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodigoDistrito(int codigoDistrito) {
        this.codigoDistrito = codigoDistrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public void setEstadoMeteorologico(String estadoMeteorologico) {
        this.estadoMeteorologico = estadoMeteorologico;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setLesividad(String lesividad) {
        this.lesividad = lesividad;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public void setPositivaAlcohol(boolean positivaAlcohol) {
        this.positivaAlcohol = positivaAlcohol;
    }

    public void setPositivaDrogas(boolean positivaDrogas) {
        this.positivaDrogas = positivaDrogas;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "numExpediente=" + numExpediente +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", numero=" + numero +
                ", codigoDistrito=" + codigoDistrito +
                ", distrito='" + distrito + '\'' +
                ", tipoAccidente='" + tipoAccidente + '\'' +
                ", estadoMeteorologico='" + estadoMeteorologico + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", tipoPersona='" + tipoPersona + '\'' +
                ", rangoEdad='" + rangoEdad + '\'' +
                ", sexo='" + sexo + '\'' +
                ", lesividad='" + lesividad + '\'' +
                ", coordenadaX=" + coordenadaX +
                ", coordenadaY=" + coordenadaY +
                ", positivaAlcohol=" + positivaAlcohol +
                ", positivaDrogas=" + positivaDrogas +
                '}';
    }

}
