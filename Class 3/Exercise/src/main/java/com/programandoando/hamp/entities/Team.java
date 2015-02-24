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
public class Team {
    protected int id;
    protected String name;
    protected String lastname;
    protected int age;

    public Team() {
        this.id=1;
        this.name="Leonel";
        this.lastname="Messi";
        this.age=28;
    }

    public Team(int id, String name, String lastname, int age) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void Concentration(){
        System.out.println("Concentration before the match");
    }
    
    public void Travel(){
        System.out.println("travel to the stadium");
    }
}
