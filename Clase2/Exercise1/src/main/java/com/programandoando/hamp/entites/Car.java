
package com.programandoando.hamp.entites;

/**
 *
 * @author HAMP
 * Relacion 1 - 1 
 */
public class Car {
    //Atribute instance
    private String enrollment;
    
    //Atribute reference Class Driver
    private Driver driver;

    public Car(String enrollment, Driver driver) {
        this.enrollment = enrollment;
        this.driver = driver;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
