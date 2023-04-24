/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.exceptions;

/**
 *
 * @author macminidesarrollo
 */
public class ErrorAutenticacion extends Exception{
    public ErrorAutenticacion() {
    }

    public ErrorAutenticacion(String message) {
        super(message);
    }

    public ErrorAutenticacion(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorAutenticacion(Throwable cause) {
        super(cause);
    }
}
