package com.programandoando.hamp.entites;

/**
 *
 * @author HAMP
 */
public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    //Constructor con tres parametros
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    //Metodos set y get
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    //Devuelve representacion String de un objeto Empleado
    @Override
    public String toString() {
        return "primerNombre=" + getPrimerNombre() 
                + "," + getApellidoPaterno() + ", numeroSeguroSocial=" + getNumeroSeguroSocial();
    }
    
    //Metodo abstracto sobreescrito por las subclases concretas
    public abstract double ingresos();//Aqui no hay implementacion    
}
