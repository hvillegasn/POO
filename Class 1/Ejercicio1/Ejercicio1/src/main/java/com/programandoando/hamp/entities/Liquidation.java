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
public class Liquidation{//extends Object{
 
   //Atribute of instance
   private int category;
   private double average; 
   
   //private Employee objEmployee=NULL; Reference of Object
   
   //Constructor: Genesis   
   //Overload de constructors y method
   
   public Liquidation(int category, double average)
   {      
       this.category=category;
       this.average=average;    
   }    

  public Liquidation()
   {      
       this.category=1;
       this.average=3.1;    
   }    
  
   public int sum(int a,int b)
   { return a+b;}
   
   public float sum(float a,int b)
   { return a+b;}
   
   //Method access a data: set ( write: escritura ) y get ( read : lectura)

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
  
   
   //Method of User
   
   public double determineLiquidation(){       
       switch(getCategory())
       {
           case 0: return 550;
           case 1: return 500;
           case 2: return 400;
           default: return 450;
       }
   }   
   
   public double getDiscount(){
       if(getAverage()<=13.99)
           return 0;
       else if(getAverage()<=15.99)
           return 0.1*determineLiquidation();
       else if(getAverage()<=17.99)
           return 0.12*determineLiquidation();
       else
           return 0.15*determineLiquidation();
   }
   
   
   public double determineNewliquidation()
   {
       return determineLiquidation()-getDiscount();
   }  
    
}
