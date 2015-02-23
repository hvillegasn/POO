/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programandoando.hamp.test;

import com.programandoando.hamp.entities.*;

/**
 *
 * @author HAMP
 */
public class MainRelation1n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student s1=new Student("Vanesa");
       Student s2=new Student("Patricia");
       Student s3=new Student("Andrea");
       
       Teacher t1=new Teacher("HAMP");
       
       Course c1=new Course("Programacion Web ");
       Course c2=new Course("Fundamento de Datos e Informacion");
       Course c3=new Course("Programacion I");
       
       t1.addCourse(c1);
       t1.addCourse(c2);
       t1.addCourse(c3);
       
       s1.addinCourse(c1);
       s2.addinCourse(c2);
       s3.addinCourse(c3);
       
        System.out.println(t1);
    }
    
}
