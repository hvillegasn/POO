/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.programandoando.hamp.dao;

import com.programandoando.hamp.dao.concret.XMLLanguageDAO;

/**
 *
 * @author Henry
 */
public class XMLDAOFactory extends AbstractDAOFactory{

    @Override
    public DAO getLanguageDAO() {
          return new XMLLanguageDAO();
    }

    @Override
    public DAO getDeveloperDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
