/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programandoando.hamp.entities;

import java.util.ArrayList;

/**
 *
 * @author HAMP
 */
public class Course {
    private String name;
    private ArrayList liststudent;
    private Teacher teacher;

    public Course(String name) {
        this.name = name;
        //Create liststudent
        liststudent=new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getListstudent() {
        return liststudent;
    }

    public void setListstudent(ArrayList liststudent) {
        this.liststudent = liststudent;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    public void addStudent(Student e)
    {
        liststudent.add(e);
    } 
    
    public void removeStudent(Student e){
        liststudent.remove(e);
    }
            
    @Override
    public String toString(){
     String cad="Course : "+getName()+":\n";
     cad+=" dictated by:"+teacher.getName()+":\n";
        for (int i=0;i<liststudent.size();i++) {
            cad+=((Student)liststudent.get(i)).toString();
            cad+='\n';
        }
        return cad;
    }
}
