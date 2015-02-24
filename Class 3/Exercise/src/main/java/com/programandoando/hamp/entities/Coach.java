/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programandoando.hamp.entities;

/**
 *
 * @author HAMP
 */
public class Coach extends Team{
    private String idFederation;

    public Coach() {
    }

    public Coach(String idFederation, int id, String name, String lastname, int age) {
        super(id, name, lastname, age);
        this.idFederation = idFederation;
    }

    public String getIdFederation() {
        return idFederation;
    }

    public void setIdFederation(String idFederation) {
        this.idFederation = idFederation;
    }
    
    public void directMatch()
    {
        System.out.println("Direct Match.");
    }
    
    public void directTraining(){
        System.out.println("Direct Training");
    }
}
