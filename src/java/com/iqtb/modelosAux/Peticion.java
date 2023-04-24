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
public class Peticion {
    //private String idTransaccion;    
    //private String tipoTransaccion;
    //private String fechaTransaccion;
    private String NoEmisor;    
    private List<TxtArchivo> listaTxtArchivo;

    public Peticion(String NoEmisor) {
        this.NoEmisor = NoEmisor;
    }

    public String getNoEmisor() {
        return NoEmisor;
    }

    public void setNoEmisor(String NoEmisor) {
        this.NoEmisor = NoEmisor;
    }

    public List<TxtArchivo> getListaTxtArchivo() {
        return listaTxtArchivo;
    }

    public void setListaTxtArchivo(List<TxtArchivo> listaTxtArchivo) {
        this.listaTxtArchivo = listaTxtArchivo;
    }
        
}
