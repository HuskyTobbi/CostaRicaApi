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
    
    //public TxtArchivo(String archivoTxt, clave){
    public TxtArchivo(String archivoTxt){
        this.archivoTxt = archivoTxt;
    }

    public String getArchivoTxt() {
        return archivoTxt;
    }

    public void setArchivoTxt(String archivoTxt) {
        this.archivoTxt = archivoTxt;
    }
    
}
