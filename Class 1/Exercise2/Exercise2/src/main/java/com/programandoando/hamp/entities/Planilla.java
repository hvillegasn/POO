package com.programandoando.hamp.entities;
public class Planilla {
    //1
    private int horas,cargo,modalidad;
    
    //2
    private static int total;
    private static int tGerente;
    private static int tAdministrativo;
    private static int tJefe;
    private static int tOperario;
    
    private static int cMenos1200;
    private static int cEntre1200y2500;
    private static int cMas2500;
    
    //3
    static {
        total=0;
        tGerente=0;
        tAdministrativo=0;
        tJefe=0;
        tOperario=0;
    
        cMenos1200=0;
        cEntre1200y2500=0;
        cMas2500=0;
    }
    
    //4
    public Planilla(int horas,int cargo,int modalidad){
        this.horas=horas;
        this.cargo=cargo;
        this.modalidad=modalidad;
        total++;
        
        contadorCargos();
        contadorSueldo();
    }

    //5
    public double asignaPagoxHora(){
        switch(cargo){
            case 0: return 20;
            case 1: return 10;
            case 2: return 8;
            default: return 3.5;
        }
    }

    //6
    public double calculaBruto(){
        return this.horas*asignaPagoxHora();
    }
    
    public double asignaBonificacion(double bruto){
        switch(modalidad){
            case 0: return 0.2*bruto;
            default: return 0.05*bruto;
        }
    }
    
    public double calculaSueldo(){
        return calculaBruto()+asignaBonificacion(calculaBruto());
    }

    //7
    private void contadorCargos(){
        switch(cargo){
            case 0: tGerente++; break;
            case 1: tAdministrativo++; break;
            case 2: tJefe++; break;
            default: tOperario++;
        }
    }

    //8
    private void contadorSueldo(){
        if (calculaSueldo()<1200)
            cMenos1200++;
        else if (calculaSueldo()<=2500)
            cEntre1200y2500++;
        else 
            cMas2500++;
    }

    //9
    public static int getTotal(){ 
        return total;
    }
    public static int getTotalGerentes(){ 
        return tGerente;
    }
    public static int getTotalAdministrativo(){ 
        return tAdministrativo;
    }
    public static int getTotalJefes(){ 
        return tJefe;
    }
    public static int getTotalOperario(){ 
        return tOperario;
    }
    public static int getTotalmenor1200(){ 
        return cMenos1200;
    }
    public static int getTotalEntre1200y2500(){ 
        return cEntre1200y2500;
    }
    public static int getTotalmas2500(){ 
        return cMas2500;
    }
}
