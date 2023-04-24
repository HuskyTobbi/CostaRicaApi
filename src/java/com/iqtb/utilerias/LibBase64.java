/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.utilerias;

import java.io.UnsupportedEncodingException;
import org.apache.log4j.Logger;
import org.bouncycastle.util.encoders.Base64;

/**
 *
 * @author macminidesarrollo
 */
public class LibBase64 {
    static Logger logger = Logger.getLogger(LibBase64.class);
     public static String encode(byte[] dataToCode)  {
         try {
             return new String(Base64.encode(dataToCode), "UTF-8");
         } catch (UnsupportedEncodingException ex) {
             logger.error("Error method encode UnsupportedEncodingException: "+ex);
             return null;
         }
    }

    public static byte[] decode(String dataToDecode)  {
        //logger.info("dataToDecode: "+dataToDecode);
        String dataDecodeFix = verifyWBase64(dataToDecode.trim().replaceAll("\\s+", ""));
        //logger.info("dataDecodeFix: "+dataDecodeFix);
        byte [] respuesta = null;
        try {
            if(dataDecodeFix != null){
                respuesta = Base64.decode(dataDecodeFix.getBytes("UTF-8"));//dataDecodeFix.getBytes("UTF-8")  puede recibir una cadena
            } 
        } catch (UnsupportedEncodingException ex) {
            logger.error("Error method decode UnsupportedEncodingException: "+ex);
            return respuesta;
        }
        return respuesta;
    }

    private static String verifyWBase64(String dataToDecode) {
        int residuo = dataToDecode.length() % 4;
        switch (residuo) {
            case 2:
                //logger.info("case2");
                return dataToDecode + "=" + "=";
            case 3:
                //logger.info("case3");
                return dataToDecode + "=";
            case 1:
                //logger.info("case1");
                logger.error("La cadena Base64 es inválida, no es multiplo de 4 (residuo al dividir entre 4 es 1): @" + dataToDecode + "@");
                return null;
            case 0:
                if(dataToDecode != null && !dataToDecode.isEmpty()){
                    //logger.info("Se proceso peticion");
                } else {
                    logger.info("cadena Base64 vacia");
                    return null;
                }
                
        }
        return dataToDecode;
    }
}
