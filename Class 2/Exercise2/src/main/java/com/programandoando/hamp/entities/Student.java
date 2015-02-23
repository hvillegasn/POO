/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programandoando.hamp.entities;

import java.util.ArrayList;

/*
 *
 * @author HAMP
 */
public class Student {
    private String name;
    private ArrayList listCourse;

    public Student(String name) {
        this.name = name;
        listCourse=new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addinCourse(Course c){
        listCourse.add(c);
        c.addStudent(this);
    }
    
    public void removeinCourse(Course c){
        listCourse.remove(c);
        c.removeStudent(this);
    }
    
    @Override
    public String toString(){
      String cad="Student:"+getName()+"{";
      
        for (int i = 0; i < listCourse.size(); i++) {
            cad+=((Course)listCourse.get(i)).getName();
        }
        cad+='\n';
        return cad;
    }
}
