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
public class Masseuse extends Team{
    private String Title;
    private int yearsExperience;

    public Masseuse() {
    }

    public Masseuse(String Title, int yearsExperience, int id, String name, String lastname, int age) {
        super(id, name, lastname, age);
        this.Title = Title;
        this.yearsExperience = yearsExperience;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
    
    public void setMassage()
    {
        System.out.println("Massage");   
    }
    
}
