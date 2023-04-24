package com.iqtb.pojos.xsaCR;
// Generated 4/04/2022 02:52:13 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Servidores generated by hbm2java
 */
public class Servidores  implements java.io.Serializable {


     private Integer idServidor;
     private String nombre;
     private String host;
     private String ipVirtual;
     private short timeout;
     private String estado;
     private Integer tipo;
     private String keyServidor;
     private String keyXsa;
     private Set servicioses = new HashSet(0);

    public Servidores() {
    }

	
    public Servidores(String nombre, String host, String ipVirtual, short timeout, String estado) {
        this.nombre = nombre;
        this.host = host;
        this.ipVirtual = ipVirtual;
        this.timeout = timeout;
        this.estado = estado;
    }
    public Servidores(String nombre, String host, String ipVirtual, short timeout, String estado, Integer tipo, String keyServidor, String keyXsa, Set servicioses) {
       this.nombre = nombre;
       this.host = host;
       this.ipVirtual = ipVirtual;
       this.timeout = timeout;
       this.estado = estado;
       this.tipo = tipo;
       this.keyServidor = keyServidor;
       this.keyXsa = keyXsa;
       this.servicioses = servicioses;
    }
   
    public Integer getIdServidor() {
        return this.idServidor;
    }
    
    public void setIdServidor(Integer idServidor) {
        this.idServidor = idServidor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }
    public String getIpVirtual() {
        return this.ipVirtual;
    }
    
    public void setIpVirtual(String ipVirtual) {
        this.ipVirtual = ipVirtual;
    }
    public short getTimeout() {
        return this.timeout;
    }
    
    public void setTimeout(short timeout) {
        this.timeout = timeout;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Integer getTipo() {
        return this.tipo;
    }
    
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    public String getKeyServidor() {
        return this.keyServidor;
    }
    
    public void setKeyServidor(String keyServidor) {
        this.keyServidor = keyServidor;
    }
    public String getKeyXsa() {
        return this.keyXsa;
    }
    
    public void setKeyXsa(String keyXsa) {
        this.keyXsa = keyXsa;
    }
    public Set getServicioses() {
        return this.servicioses;
    }
    
    public void setServicioses(Set servicioses) {
        this.servicioses = servicioses;
    }




}


