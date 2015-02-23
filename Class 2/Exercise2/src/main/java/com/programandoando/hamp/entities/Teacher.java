/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programandoando.hamp.entities;

import com.sun.javafx.collections.ArrayListenerHelper;
import java.util.ArrayList;

/**
 *
 * @author HAMP
 */
public class Teacher {
    private String name;
    private ArrayList listCourse;

    public Teacher(String name) {
        this.name = name;
        listCourse=new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addCourse(Course c){
        listCourse.add(c);
        c.setTeacher(this);
    }
    
    public void removeCourse(Course c)
    {
        listCourse.remove(c);
    }
     
    @Override
    public String toString()
    {
        String cad="Teacher :"+getName()+'\n';
        for (int i = 0; i < listCourse.size(); i++) {
            cad+='{';
            cad+='\n';
            cad+=((Course)listCourse.get(i)).toString();
            cad+='}';
            cad+='\n';
        }
        return cad;
    }
    
}
