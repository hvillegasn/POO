package com.programandoando.hamp.test;

import com.programandoando.hamp.entites.Car;
import com.programandoando.hamp.entites.Driver;

/**
 *
 * @author HAMP.
 */
public class MainDriverCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Driver myDriver=new Driver("HAMP");
        Car myCar=new Car("AHJ-1050", myDriver);
        System.out.println("Driver is:"+myCar.getEnrollment());
        System.out.println("Car is:"+myCar.getDriver().getName());
    }
    
}
