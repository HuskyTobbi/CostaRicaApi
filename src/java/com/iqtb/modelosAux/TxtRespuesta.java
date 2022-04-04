/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.modelosAux;

/**
 *
 * @author macminidesarrollo
 */
public class TxtRespuesta {
    private String respuesta;
    private String error;
    
    public TxtRespuesta(){
        
    }
    
    public TxtRespuesta(String respuesta, String error){
        this.respuesta=respuesta;
        this.error=error;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
}
