package com.programandoando.hamp.entities;
/**
 *
 * @author HAMP
 */
public class Developer {
    private int dev_id;
    private String dev_name;
    private String dev_lastname;
    
    private Language language=new Language();

    public Developer() {
    }

    public Developer(int dev_id, String dev_name, String dev_lastname,Language language) {
        this.dev_id = dev_id;
        this.dev_name = dev_name;
        this.dev_lastname = dev_lastname;
        this.language=language;
    }

    public int getDev_id() {
        return dev_id;
    }

    public void setDev_id(int dev_id) {
        this.dev_id = dev_id;
    }

    public String getDev_name() {
        return dev_name;
    }

    public void setDev_name(String dev_name) {
        this.dev_name = dev_name;
    }

    public String getDev_lastname() {
        return dev_lastname;
    }

    public void setDev_lastname(String dev_lastname) {
        this.dev_lastname = dev_lastname;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        String str = 	"NAME : " + this.getDev_name()+ "\n";
		str += 			"LAST NAME : " + this.getDev_lastname()+ "\n";
		str +=			this.getLanguage().toString();
		str +=			"\n.....................................\n";
		
		return str;
    }
}
