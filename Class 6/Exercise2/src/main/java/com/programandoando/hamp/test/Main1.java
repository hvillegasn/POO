package com.programandoando.hamp.test;

import com.programandoando.hamp.dao.AbstractDAOFactory;
import com.programandoando.hamp.dao.DAO;
import com.programandoando.hamp.dao.FactoryType;
import com.programandoando.hamp.entities.Language;



/**
 *
 * @author HAMP
 */
public class Main1 {    
    public static void main(String[] args) {      

        //MySQL
        DAO<Language> languageDAO = AbstractDAOFactory.getFactory(FactoryType.DAO_FACTORY).getLanguageDAO();
        //XML
        //DAO<Language> languageDAO2 = AbstractDAOFactory.getFactory(FactoryType.XML_DAO_Factory).getLanguageDAO();

        Language lan = new Language();       
        
        lan.setLan_id(44);
        lan.setLan_name("Visual Basic");
        lan=languageDAO.create(lan);          
        
        //System.out.println(lan);

        System.out.println("\n Find of id :");        
        System.out.println(languageDAO.find(44).toString());
        
    }

}
