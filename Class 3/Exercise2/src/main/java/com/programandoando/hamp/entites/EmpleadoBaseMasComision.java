package com.programandoando.hamp.entites;

/**
 *
 * @author HAMP
 */
//extiende a EmpleadoPorComision
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
     public double salarioBase;//salario base por semana

     //constructor con seis parametros
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, double ventas, double tarifa,double salario) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventas, tarifa);
        setSalarioBase(salario);
    }

    //metodo set y get
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase>0.0)
            this.salarioBase = salarioBase;
        else
            throw new IllegalArgumentException("El salario base debe ser  >=0.0");
    }

    //Calcula los ingresos; sobreescribe el metodo ingresos en EmpleadoPorComision
    @Override
    public double ingresos() {
        return getSalarioBase()+super.ingresos();
    }
    
     @Override //indica que este metodo sobreescribe el metodo de la superclase 
    public String toString() {
        return "EmpleadoBaseMasComision:"+super.toString()+"-"+"salarioBase="+ getSalarioBase();
    }
    
}
