package com.programandoando.hamp.dao;

import com.programandoando.hamp.entities.Developer;
import com.programandoando.hamp.entities.Language;
import com.programandoando.hamp.dao.concret.DeveloperDAO;
import com.programandoando.hamp.dao.concret.LanguageDAO;

/**
 *
 * @author Henry
 */
public class DAOFactory extends AbstractDAOFactory{

 
    public DAO<Developer> getDeveloperDAO() {
        return new DeveloperDAO();
    }

    public  DAO<Language> getLanguageDAO() {
        return new LanguageDAO();
    }

   
}
