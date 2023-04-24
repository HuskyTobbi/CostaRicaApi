/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.servicios;

import com.iqtb.utilerias.ArchivoTXT;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.apache.log4j.Logger;

/**
 *
 * @author macminidesarrollo
 */
@WebService(serviceName = "RecepcionTXT")
public class RecepcionTXT {
    Logger logger =  Logger.getLogger(RecepcionTXT.class);
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "fileRequest")
    public String fileRequest(@WebParam(name = "EnviarTXT") String EnviarTXT) {
        if(EnviarTXT != null){
            return new ArchivoTXT(EnviarTXT).procesamientoSolicitud();
        } else {
            return "No se encontro Txt en el archivo base";
        }
    }
}
