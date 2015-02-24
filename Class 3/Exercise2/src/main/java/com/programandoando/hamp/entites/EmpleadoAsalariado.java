package com.programandoando.hamp.entites;

/**
 *
 * @author HAMP
 */
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, 
            String numeroSeguroSocial,double salarios) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        setSalarioSemanal(salarios);        
    }

   
    //Metodos set y get
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    
    public void setSalarioSemanal(double salarioSemanal) {
        if(salarioSemanal>=0.0) 
            this.salarioSemanal = salarioSemanal;
        else
            throw new IllegalArgumentException("El salario semanal debe ser  >=0.0");
    }
    
    //Calcula los ingresos; sobrescribe el metodo abstracto ingreso en Empleado 
    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }
    
    //Devuelve la representacion Strin de un objeto EmpleadoAsalariado
    @Override
    public String toString() {
        return "EmpleadoAsalariado:" + super.toString()+"-"+"salarioSemanal=" + getSalarioSemanal();
    }
    
}
