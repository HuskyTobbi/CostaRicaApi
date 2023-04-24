/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.exceptions;

/**
 *
 * @author Valentin
 */
public class ErrorNoEmisor extends Exception{
    public ErrorNoEmisor()
      {
      }

      public ErrorNoEmisor(String message) {
        super(message);
      }

      public ErrorNoEmisor(Throwable cause)
      {
        super(cause);
      }

      public ErrorNoEmisor(String message, Throwable cause)
      {
        super(message, cause);
      }
}
