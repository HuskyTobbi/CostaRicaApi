package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CUnidadmedidaCe generated by hbm2java
 */
public class CUnidadmedidaCe  implements java.io.Serializable {


     private Integer idUnidadMedida;
     private String CUnidadMedida;
     private String descripcion;
     private Date fechaInicioV;
     private Date fechaFinV;

    public CUnidadmedidaCe() {
    }

	
    public CUnidadmedidaCe(Date fechaInicioV) {
        this.fechaInicioV = fechaInicioV;
    }
    public CUnidadmedidaCe(String CUnidadMedida, String descripcion, Date fechaInicioV, Date fechaFinV) {
       this.CUnidadMedida = CUnidadMedida;
       this.descripcion = descripcion;
       this.fechaInicioV = fechaInicioV;
       this.fechaFinV = fechaFinV;
    }
   
    public Integer getIdUnidadMedida() {
        return this.idUnidadMedida;
    }
    
    public void setIdUnidadMedida(Integer idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }
    public String getCUnidadMedida() {
        return this.CUnidadMedida;
    }
    
    public void setCUnidadMedida(String CUnidadMedida) {
        this.CUnidadMedida = CUnidadMedida;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaInicioV() {
        return this.fechaInicioV;
    }
    
    public void setFechaInicioV(Date fechaInicioV) {
        this.fechaInicioV = fechaInicioV;
    }
    public Date getFechaFinV() {
        return this.fechaFinV;
    }
    
    public void setFechaFinV(Date fechaFinV) {
        this.fechaFinV = fechaFinV;
    }




}


