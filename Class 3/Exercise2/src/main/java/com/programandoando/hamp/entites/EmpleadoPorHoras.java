package com.programandoando.hamp.entites;

/**
 *
 * @author HAMP
 */
public class EmpleadoPorHoras extends Empleado{
    
    private double sueldo;//sueldo por horas
    private double horas;//horas trabajadas por semana
    
    //Constructor con los 5 parametros
    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, 
            String numeroSeguroSocial,double sueldoPorHoras, double horasTrabajadas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        setSueldo(sueldoPorHoras);
        setHoras(horasTrabajadas);
    }

    //metodos set y get
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if(sueldo>=0.0)
           this.sueldo = sueldo;
        else
          throw new IllegalArgumentException("El sueldo debe ser  >=0.0");
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        //168= el total de horas en una semana.24*7=168
        if((horas>=0.0) && (horas<=168.0))
            this.horas = horas;
        else
           throw new IllegalArgumentException("Las horas trabajadas deber ser >=0.0 y <=168.0");
            
    }
    
     //Calcula los ingresos; sobrescribe el metodo abstracto ingreso en Empleado 
    @Override
    public double ingresos() {
        if(getHoras()<=40) {
            return getSueldo()*getHoras();
        }
        else {
            return 40*getSueldo()+(getHoras()-40)*getSueldo()*1.5;
        }
    }
    
    //Devuelve la representacion String de un objeto EmpleadoAsalariado
    @Override
    public String toString() {
        return "EmpleadoPorHoras:" + super.toString()+"-"+"sueldo por hora=" + getSueldo()
                +"-"+"horas trabajadas=" + getHoras();
    }
    
}
