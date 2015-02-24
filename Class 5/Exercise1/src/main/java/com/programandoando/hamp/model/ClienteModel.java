package com.programandoando.hamp.model;

import com.programandoando.hamp.db.AccesoDB;
import com.programandoando.hamp.entities.*;
import java.sql.*;

public class ClienteModel {
    public void insertar(ClienteTO clienteTO)throws Exception{
        Connection cn=null;
        PreparedStatement ps=null;
        String sqlinsert=null;
        try {
            cn=AccesoDB.getConnection();
            //Manejo de transaccion a nivel de cliente.
            cn.setAutoCommit(false);
            clienteTO.setCodigo(ContadorModel.getContador("cliente"));
            sqlinsert = "insert into cliente(chr_cliecodigo,vch_cliepaterno,vch_cliematerno," +
		        "vch_clienombre,chr_cliedni,vch_clieciudad,vch_cliedireccion,vch_clietelefono," +
			"vch_clieemail) values(?,?,?,?,?,?,?,?,?)";
            ps=cn.prepareStatement(sqlinsert);
            ps.setString(1,clienteTO.getCodigo());
            ps.setString(2, clienteTO.getPaterno());
            ps.setString(3, clienteTO.getMaterno());
            ps.setString(4, clienteTO.getNombre());
            ps.setString(5, clienteTO.getDni());
            ps.setString(6, clienteTO.getCiudad());
            ps.setString(7, clienteTO.getDireccion());
            ps.setString(8, clienteTO.getTelefono());
            ps.setString(9, clienteTO.getEmail());           
            ps.executeUpdate();
            cn.commit();//Confirmacion del proceso
            ps.close();
        } catch (Exception e) { 
            cn.rollback();            
        }
    }
    
    public void modificar(ClienteTO clienteTO)throws Exception{
        Connection cn=null;
        CallableStatement cs=null;
        String sqlupdate=null,estado;
        try {
            cn=AccesoDB.getConnection();
            //Manejo de transaccion a nivel de servidor
            cn.setAutoCommit(true);            
            sqlupdate = "{call usp_actualiza_datos_cliente(?,?,?,?,?,?,?,?,?,?)}";
            cs=cn.prepareCall(sqlupdate);
            cs.registerOutParameter(1, java.sql.Types.VARCHAR);
            cs.setString(2, clienteTO.getCodigo());
            cs.setString(3, clienteTO.getPaterno());
            cs.setString(4, clienteTO.getMaterno());
            cs.setString(5, clienteTO.getNombre());
            cs.setString(6, clienteTO.getDni());
            cs.setString(7, clienteTO.getCiudad());
            cs.setString(8, clienteTO.getDireccion());
            cs.setString(9, clienteTO.getTelefono());
            cs.setString(10, clienteTO.getEmail());           
            cs.executeUpdate();            
            estado=cs.getString(1);//Recuperamos el valor del parametro de salida
            if(estado!=null) 
                throw new Exception(estado);            
            cs.close();
        } catch (Exception e) { 
            throw e;
        }
    }
    
}
