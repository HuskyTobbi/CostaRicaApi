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
public class TxtArchivo {
     //factura (una Peticion puede tener varios nodos factura)
    private String archivoTxt;
    private String clave;
    
    public TxtArchivo(String archivoTxt, String clave){
        this.archivoTxt = archivoTxt;
        this.clave = clave;
    }

    public String getArchivoTxt() {
        return archivoTxt;
    }

    public void setArchivoTxt(String archivoTxt) {
        this.archivoTxt = archivoTxt;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
