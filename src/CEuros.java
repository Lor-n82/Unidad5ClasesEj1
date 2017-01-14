/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class CEuros {
    
    private double cambios;
    
    //constructores
    public CEuros(){
        cambios=0.92;
    }
    public CEuros(double cambio){
        cambios=cambio;
    }
    
    public double dolaresToEuros(double dol){
            double euros=dol*cambios;
        return euros;
    }
    public double eurosToDolares(double eur){
        return eur/cambios;
    }
}
