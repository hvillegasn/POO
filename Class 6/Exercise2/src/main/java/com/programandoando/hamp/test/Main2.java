package com.programandoando.hamp.test;

import com.programandoando.hamp.dao.AbstractDAOFactory;
import com.programandoando.hamp.dao.DAO;
import com.programandoando.hamp.dao.FactoryType;
import com.programandoando.hamp.entities.*;

/**
 *
 * @author HAMP
 */
public class Main2 {

    public static void main(String[] args) {
        DAO<Developer> developerDAO = AbstractDAOFactory.getFactory(FactoryType.DAO_FACTORY).getDeveloperDAO();

        Developer dev = new Developer();
        dev.setDev_id(2);
        dev.setDev_name("Juan ");
        dev.setDev_lastname("Perez Rodriguez");
        
        Language lan = new Language();
        lan.setLan_id(44);
        dev.setLanguage(lan);

        dev = developerDAO.create(dev);
        
        System.out.println(developerDAO.find(2).toString());

    }

}
