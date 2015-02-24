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
public class Player extends Team{
    private int number;
    private String position;

    public Player() {
    }

    public Player(int number, String position, int id, String name, String lastname, int age) {
        super(id, name, lastname, age);
        this.number = number;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public void playerMatch()
    {
        System.out.println("Play a game 100%");
    }
    
    public void playerTraining()
    {
        System.out.println("Train 100% match");   
    }
}
