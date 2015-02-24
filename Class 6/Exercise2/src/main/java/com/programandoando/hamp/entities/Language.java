package com.programandoando.hamp.entities;
/**
 *
 * @author HAMP
 */
public class Language {
    private int lan_id;
    private String  lan_name;

    public Language() {
    }

    public Language(int lan_id, String lan_name) {
        this.lan_id = lan_id;
        this.lan_name = lan_name;
    }

    public int getLan_id() {
        return lan_id;
    }

    public void setLan_id(int lan_id) {
        this.lan_id = lan_id;
    }

    public String getLan_name() {
        return lan_name;
    }

    public void setLan_name(String lan_name) {
        this.lan_name = lan_name;
    }

    @Override
    public String toString() {
        return "LANGUAGE DE PROGRAMATION : " + this.lan_name;
    }
    
    
    
}
