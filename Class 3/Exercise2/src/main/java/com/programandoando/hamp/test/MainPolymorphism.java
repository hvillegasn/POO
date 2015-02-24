/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programandoando.hamp.test;

import com.programandoando.hamp.entites.*;

/**
 *
 * @author HAMP
 */
public class MainPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Empleado e=new Empleado();==>NO ES CORRECTO 
        //Empleado e;//SI ES CORRECTO
        EmpleadoAsalariado esalariado = new EmpleadoAsalariado("n1", "a1", "111-111-111", 800);
        Empleado eporhoras = new EmpleadoPorHoras("n2", "a2", "222-222-222", 20, 30);
        //Estructura de Datos==> Arreglo
        Empleado[] empleados = new Empleado[2];
        empleados[0] = esalariado;
        empleados[1] = eporhoras;
        //Proceso de objeto de forma generica 
        for (Empleado objempleado : empleados) {
            System.out.println(objempleado);
            System.out.println("Ingresos:" + objempleado.ingresos());
            if (objempleado instanceof EmpleadoAsalariado) {
                EmpleadoAsalariado e = (EmpleadoAsalariado) objempleado;//ESPECIALIZACION
                System.out.println("Nombre" + e.getPrimerNombre());
                System.out.println("Salario" + e.getSalarioSemanal());
            }
        }
    }

}
