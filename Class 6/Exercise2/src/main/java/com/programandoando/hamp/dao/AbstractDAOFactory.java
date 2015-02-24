/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.programandoando.hamp.dao;

public abstract class AbstractDAOFactory {

	//public abstract DAO getPartnerDAO();
	public abstract DAO getDeveloperDAO();
	public abstract DAO getLanguageDAO();

	
	public static AbstractDAOFactory getFactory(FactoryType type){
		
		if(type.equals(type.DAO_FACTORY)) 
			return new DAOFactory();
		
		if(type.equals(type.XML_DAO_Factory))
			return new XMLDAOFactory();
		
		return null;
	}
	
}