package com.programandoando.hamp.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        Logger logger_1=Logger.getInstance();
        Logger logger_2=Logger.getInstance();
        
        //logger_1.log("Hola Mundo!");
        logger_1.setValue("Hola Mundo!");
        System.out.println(logger_2.getValue());
        
    }
    
}
