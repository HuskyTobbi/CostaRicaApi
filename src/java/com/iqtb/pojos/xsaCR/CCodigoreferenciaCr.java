package com.iqtb.pojos.xsaCR;
// Generated 4/04/2022 02:52:13 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CCodigoreferenciaCr generated by hbm2java
 */
public class CCodigoreferenciaCr  implements java.io.Serializable {


     private Integer idCodigoReferencia;
     private String CCodigoReferencia;
     private String descripcion;
     private Date fechaInicioV;
     private Date fechaFinV;

    public CCodigoreferenciaCr() {
    }

	
    public CCodigoreferenciaCr(Date fechaInicioV) {
        this.fechaInicioV = fechaInicioV;
    }
    public CCodigoreferenciaCr(String CCodigoReferencia, String descripcion, Date fechaInicioV, Date fechaFinV) {
       this.CCodigoReferencia = CCodigoReferencia;
       this.descripcion = descripcion;
       this.fechaInicioV = fechaInicioV;
       this.fechaFinV = fechaFinV;
    }
   
    public Integer getIdCodigoReferencia() {
        return this.idCodigoReferencia;
    }
    
    public void setIdCodigoReferencia(Integer idCodigoReferencia) {
        this.idCodigoReferencia = idCodigoReferencia;
    }
    public String getCCodigoReferencia() {
        return this.CCodigoReferencia;
    }
    
    public void setCCodigoReferencia(String CCodigoReferencia) {
        this.CCodigoReferencia = CCodigoReferencia;
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


