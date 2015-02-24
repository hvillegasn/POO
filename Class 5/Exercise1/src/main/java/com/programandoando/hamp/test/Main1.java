package com.programandoando.hamp.test;

import com.programandoando.hamp.model.ClienteModel;
import com.programandoando.hamp.entities.ClienteTO;


public class Main1 {

    public static void main(String[] args) {
                ClienteTO clienteTO = new ClienteTO();
		ClienteModel cliente = new ClienteModel();
		
		// Preparamos los datos
		clienteTO.setPaterno("M");
		clienteTO.setMaterno("P");
		clienteTO.setNombre("HA");
		clienteTO.setDni("10459823");
		clienteTO.setCiudad("LIMA");
		clienteTO.setDireccion("LIMA");
		clienteTO.setTelefono("234567");
		clienteTO.setEmail("hmendopu@hotmail.com");
		
		//Grabamos en la base de datos
		try {
			cliente.insertar(clienteTO);
			System.out.println("Codigo Generado: " + clienteTO.getCodigo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

    }
    
}
