package com.programandoando.hamp.entities;

/**
 *
 * @author HAMP
 */
public class Factura implements PorPagar{

    private String numeroProd;
    private String descripcionProd;
    private int cantidad;
    private double precioporProducto;
    
    //Constructor con cuatro argumentos
    public Factura(String numeroProd, String descripcionProd, int cantidad, 
            double precioporProducto) {
        this.numeroProd = numeroProd;
        this.descripcionProd = descripcionProd;
        setCantidad(cantidad);
        setPrecioporProducto(precioporProducto);
    }
    
    //Metodos set y get

    public String getNumeroProd() {
        return numeroProd;
    }

    public void setNumeroProd(String numeroProd) {
        this.numeroProd = numeroProd;
    }

    public String getDescripcionProd() {
        return descripcionProd;
    }

    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad>0)
            this.cantidad = cantidad;
        else
            throw new IllegalArgumentException("Cantidad debe ser  >=0.0");
    }

    public double getPrecioporProducto() {
        return precioporProducto;
    }

    public void setPrecioporProducto(double precioporProducto) {
        if(precioporProducto>=0.0)
            this.precioporProducto = precioporProducto;
        else
            throw new IllegalArgumentException("El precio por producto debe ser  >=0.0"); 
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroProd=" + getNumeroProd() + ", descripcionProd=" + getDescripcionProd()
                + ", cantidad=" + getCantidad() + ", precioporProducto=" + getPrecioporProducto()+ '}';
    }
    
    
    //Metodo requerido para realizar el contrato con la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        return getCantidad()*getPrecioporProducto();//Calcula el costo total
    }
    
}
