package com.programandoando.hamp.test;

import com.programandoando.hamp.model.ClienteModel;
import com.programandoando.hamp.entities.ClienteTO;

public class Main2 {

    public static void main(String[] args) {
                ClienteTO clienteTO = new ClienteTO();
		ClienteModel cliente = new ClienteModel();
		
		// Preparamos los datos
                clienteTO.setCodigo("00021");
		clienteTO.setPaterno("M");
		clienteTO.setMaterno("P");
		clienteTO.setNombre("HA");
		clienteTO.setDni("10459823");
		clienteTO.setCiudad("LIMA");
		clienteTO.setDireccion("LIMA");
		clienteTO.setTelefono("234457");
		clienteTO.setEmail("hmendo81@gmail.com");
		
		//Grabamos en la base de datos
		try {
			cliente.modificar(clienteTO);
			System.out.println("Proceso OK");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

    }
    
}
