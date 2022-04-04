/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.modelosAux;

import java.util.List;

/**
 *
 * @author macminidesarrollo
 */
public class Respuesta {
    private String NoEmisor;//rfc del receptor
    private List<TxtRespuesta> listaTxtRespuesta;    

    public Respuesta(String NoEmisor, List<TxtRespuesta> listaTxtRespuesta) {
        this.NoEmisor = NoEmisor;
        this.listaTxtRespuesta = listaTxtRespuesta;
    }

    public String getNoEmisor() {
        return NoEmisor;
    }

    public void setNoEmisor(String NoEmisor) {
        this.NoEmisor = NoEmisor;
    }

    
    
    public List<TxtRespuesta> getListaTxtRespuesta() {
        return listaTxtRespuesta;
    }

    public void setListaTxtRespuesta(List<TxtRespuesta> listaTxtRespuesta) {
        this.listaTxtRespuesta = listaTxtRespuesta;
    }
    
}
