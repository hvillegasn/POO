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
                    .createStatement().executeQuery(
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
            
            PreparedStatement prepare = this.connect
                    .prepareStatement(
                            "INSERT INTO developer (dev_id,dev_name, dev_lastname, dev_lanid)"
                            + "VALUES(?,?, ?, ?)");
            prepare.setInt(1, obj.getDev_id());
            prepare.setString(2, obj.getDev_name());
            prepare.setString(3, obj.getDev_lastname());
            prepare.setInt(4, obj.getLanguage().getLan_id());
            
            prepare.executeUpdate();
            obj = this.find(obj.getDev_id());

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
