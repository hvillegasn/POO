/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programandoando.hamp.test;

import com.programandoando.hamp.entities.*;
import java.util.ArrayList;

/**
 *
 * @author HAMP
 */
public class MainInheritance {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Team> members= new ArrayList<Team>();
    
    public static void main(String[] args) {
        Coach c1=new Coach("28E3456",1,"Vicente","Del Bosque",61);
        Player p1=new Player(6,"Volante",2,"Andres","Iniesta",30);
        
        Masseuse m1=new Masseuse("Licenciado en Fisioterapia",18,3,"Raul","Martinez",40);
        
        members.add(c1);
        members.add(p1);
        members.add(m1);
        
        System.out.println("All members");
        for (Team objteam : members) {
            System.out.println(objteam.getName()+", "+objteam.getLastname());
            objteam.Concentration();
        }
    }
    
}
