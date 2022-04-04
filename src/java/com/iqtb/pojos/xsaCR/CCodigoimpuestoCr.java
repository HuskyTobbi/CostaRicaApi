package com.iqtb.pojos.xsaCR;
// Generated 4/04/2022 02:52:13 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CCodigoimpuestoCr generated by hbm2java
 */
public class CCodigoimpuestoCr  implements java.io.Serializable {


     private Integer idCodigoImpuesto;
     private String CCodigoImpuesto;
     private String descripcion;
     private Date fechaInicioV;
     private Date fechaFinV;

    public CCodigoimpuestoCr() {
    }

	
    public CCodigoimpuestoCr(Date fechaInicioV) {
        this.fechaInicioV = fechaInicioV;
    }
    public CCodigoimpuestoCr(String CCodigoImpuesto, String descripcion, Date fechaInicioV, Date fechaFinV) {
       this.CCodigoImpuesto = CCodigoImpuesto;
       this.descripcion = descripcion;
       this.fechaInicioV = fechaInicioV;
       this.fechaFinV = fechaFinV;
    }
   
    public Integer getIdCodigoImpuesto() {
        return this.idCodigoImpuesto;
    }
    
    public void setIdCodigoImpuesto(Integer idCodigoImpuesto) {
        this.idCodigoImpuesto = idCodigoImpuesto;
    }
    public String getCCodigoImpuesto() {
        return this.CCodigoImpuesto;
    }
    
    public void setCCodigoImpuesto(String CCodigoImpuesto) {
        this.CCodigoImpuesto = CCodigoImpuesto;
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

