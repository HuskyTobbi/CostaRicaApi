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
    private String mensaje;
    
    public TxtRespuesta(){
        
    }
    
    public TxtRespuesta(String respuesta, String mensaje){
        this.respuesta=respuesta;
        this.mensaje=mensaje;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
}
