
package com.programandoando.hamp.singleton;

public class Logger {
    
    private static Logger log;    
    private String value;
    
    private Logger(){
        
    }
    
    public static Logger getInstance(){
        if(log==null){
            log=new Logger();
        }
        return log;
    }
    
    public void log(String msg)
    {
        System.out.println(msg);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
