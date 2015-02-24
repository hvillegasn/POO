package com.programandoando.hamp.entites;

/**
 *
 * @author HAMP
 */
public class EmpleadoPorComision extends Empleado{

    private double ventasBrutas;//ventas totales por semana
    private double tarifaComision;//porcentaje de comision
    
    //constructor con cinco parametros
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, 
            String numeroSeguroSocial,double ventas,double tarifa) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        setVentasBrutas(ventas);
        setTarifaComision(tarifa);        
    }

    //metodo set y get
    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if(ventasBrutas>=0)
            this.ventasBrutas = ventasBrutas;
        else
           throw new IllegalArgumentException("Las ventas brutas deben ser >=0.0"); 
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if(tarifaComision>0.0 && tarifaComision<1.0)
            this.tarifaComision = tarifaComision;
        else
            throw new IllegalArgumentException("La tarifa de comision debe ser >0.0");
    }

    //Calcula los ingresos; sobrescribe el metodo abstracto ingreso en Empleado  
    @Override
    public double ingresos() {
        return getTarifaComision()*getVentasBrutas();
    }
    
    //Devuelve la representacion String de un objeto EmpleadoAsalariado
    @Override
    public String toString() {
        return "EmpleadoPorComision:" + super.toString()+"-"
                +"ventas brutas=" +getVentasBrutas()
                +"-"+"tarifa de comision=" +getTarifaComision();
    }
}
