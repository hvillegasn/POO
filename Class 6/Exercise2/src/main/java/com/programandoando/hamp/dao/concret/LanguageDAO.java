/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programandoando.hamp.dao.concret;

import com.programandoando.hamp.dao.DAO;
import com.programandoando.hamp.entities.Language;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Henry
 */
public class LanguageDAO extends DAO<Language> {

    @Override
    public Language find(int id) {
        Language lang = new Language();
        try {
            ResultSet result = this.connect
                    .createStatement(
                           
                    ).executeQuery(
                            "SELECT * FROM language WHERE lan_id = " + id
                    );
            if (result.first()) {
                lang = new Language(id, result.getString("lan_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lang;
    }

    @Override
    public Language create(Language obj) {
        try {
            PreparedStatement prepare = this.connect
                    .prepareStatement("INSERT INTO language (lan_id,lan_name) VALUES( ?,?)");
            
            prepare.setInt(1, obj.getLan_id());                      
            prepare.setString(2, obj.getLan_name());                      
            
            prepare.executeUpdate();
            obj = this.find(obj.getLan_id());

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;

    }

    @Override
    public Language update(Language obj) {
        try {

            this.connect
                    .createStatement().executeUpdate(
                            "UPDATE language SET lan_name = '" + obj.getLan_name() + "'"
                            + " WHERE lan_id = " + obj.getLan_id()
                    );

            obj = this.find(obj.getLan_id());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return obj;
    }

    @Override
    public void delete(Language obj) {
        try {

            this.connect
                    .createStatement().executeUpdate(
                            "DELETE FROM language WHERE lan_id = " + obj.getLan_id()
                    );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
