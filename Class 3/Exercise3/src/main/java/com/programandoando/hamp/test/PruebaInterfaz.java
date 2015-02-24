package com.programandoando.hamp.test;

import com.programandoando.hamp.entities.*;

public class PruebaInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PorPagar[] listaPorPagar=new PorPagar[4];
        
        //Llena el arreglo con objetos que implementan la interfaz PorPagar.
        listaPorPagar[0]=new Factura("01234","Asiento",2,375.00);
        listaPorPagar[1]=new Factura("56789","Llanta",4,79.95);
        listaPorPagar[2]=new EmpleadoAsalariado("Jhon","Smith","111-11-1111",800.0);
        listaPorPagar[3]=new EmpleadoAsalariado("Lisa","Barnes","888-88-8888",1200.0);
        
        System.out.println("Facturas y Empleados procesados en forma polimorfica");
        //Procesa en forma generica cada elemento en el arreglo de objetosPorPagar
        for (PorPagar objporPagar : listaPorPagar) {
            System.out.println(objporPagar);
            System.out.println("Monto a pagar:"+objporPagar.obtenerMontoPago());            
        }
    }
}
