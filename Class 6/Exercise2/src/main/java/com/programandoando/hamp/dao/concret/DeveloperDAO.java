/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programandoando.hamp.dao.concret;

import com.programandoando.hamp.dao.AbstractDAOFactory;
import com.programandoando.hamp.dao.DAO;
import com.programandoando.hamp.dao.FactoryType;
import com.programandoando.hamp.entities.Developer;
import com.programandoando.hamp.entities.Language;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Henry
 */
public class DeveloperDAO extends DAO<Developer> {

    @Override
    public Developer find(int id) {
        Developer dev = new Developer();
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_READ_ONLY
                    ).executeQuery(
                            "SELECT * FROM developer WHERE dev_id = " + id
                    );
            if (result.first()) {
                dev = new Developer(
                        id,
                        result.getString("dev_name"),
                        result.getString("dev_lastname"),
                        new LanguageDAO().find(result.getInt("dev_lanid"))
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dev;
    }

    @Override
    public Developer create(Developer obj) {
        
        try {
            if (obj.getLanguage().getLan_id() == 0) {
                DAO<Language> languageDAO = AbstractDAOFactory.getFactory(FactoryType.DAO_FACTORY).getLanguageDAO();
                
                obj.setLanguage(languageDAO.create(obj.getLanguage()));
                System.out.println("id lan dentro del if=="+obj.getLanguage().getLan_id());
                System.out.println("Nombre La="+obj.getLanguage().getLan_name());
            }

            PreparedStatement prepare = this.connect
                    .prepareStatement(
                            "INSERT INTO developer (dev_name, dev_lastname, dev_lanid)"
                            + "VALUES(?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS
                    );
            
            prepare.setString(1, obj.getDev_name());
            prepare.setString(2, obj.getDev_lastname());
            prepare.setInt(3, obj.getLanguage().getLan_id());

            System.out.println("name=="+obj.getDev_name());
            System.out.println("id lan=="+obj.getLanguage().getLan_id());
            
            prepare.executeUpdate();
            ResultSet rs = prepare.getGeneratedKeys();
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("dev_id");
            }
            System.out.println("ID="+id);
            
            obj = this.find(id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;

    }

    @Override
    public Developer update(Developer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Developer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
