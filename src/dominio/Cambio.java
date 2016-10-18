package dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whoami
 */
public enum Cambio {
    
    MANUAL("Manual"),
    AUTOMATICO("Automatico");
    
    private final String cambio;
    
    private Cambio(String cambio){
        this.cambio = cambio;
    }
        
    public String getCambio(){
        return cambio;
    }
    
    public Cambio verificaCambio(String cambio){
        
        if(cambio.equals(Cambio.AUTOMATICO.getCambio()))
            return Cambio.AUTOMATICO;
        
        else if(cambio.equals(Cambio.MANUAL.getCambio()))
            return Cambio.MANUAL;
        
        else{
            return null;
        }
    }
    
}
