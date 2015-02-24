package com.programandoando.hamp.singleton;

import java.sql.Connection;


public class MainConexion {

   
    public static void main(String[] args) throws ClassNotFoundException {
        Connection cn1=Conexion.getInstance();
        Connection cn2=Conexion.getInstance();
        if(cn2!=null)
            System.out.println("OK");
        else
            System.out.println("Error");
        
    }
    
}
