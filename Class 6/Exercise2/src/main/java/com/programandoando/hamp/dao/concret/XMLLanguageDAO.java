/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.programandoando.hamp.dao.concret;

import com.programandoando.hamp.entities.Language;
import com.programandoando.hamp.dao.DAO;

/**
 *
 * @author Henry
 */
public class XMLLanguageDAO extends DAO<Language>{

    @Override
    public Language find(int id) {
        return new Language(1, "Desde XML");
    }

    @Override
    public Language create(Language obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Language update(Language obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Language obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
