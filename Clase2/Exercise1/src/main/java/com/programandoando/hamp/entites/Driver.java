package com.programandoando.hamp.entites;

/**
 *
 * @author HAMP
 * * Relacion 1 - 1 
 */
public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
