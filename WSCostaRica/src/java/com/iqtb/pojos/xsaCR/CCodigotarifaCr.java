package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CCodigotarifaCr generated by hbm2java
 */
public class CCodigotarifaCr  implements java.io.Serializable {


     private Integer idCodigoTarifa;
     private String CCodigoTarifaImpuesto;
     private String descripcion;
     private Date fechaInicioV;
     private Date fechaFinV;

    public CCodigotarifaCr() {
    }

	
    public CCodigotarifaCr(Date fechaInicioV) {
        this.fechaInicioV = fechaInicioV;
    }
    public CCodigotarifaCr(String CCodigoTarifaImpuesto, String descripcion, Date fechaInicioV, Date fechaFinV) {
       this.CCodigoTarifaImpuesto = CCodigoTarifaImpuesto;
       this.descripcion = descripcion;
       this.fechaInicioV = fechaInicioV;
       this.fechaFinV = fechaFinV;
    }
   
    public Integer getIdCodigoTarifa() {
        return this.idCodigoTarifa;
    }
    
    public void setIdCodigoTarifa(Integer idCodigoTarifa) {
        this.idCodigoTarifa = idCodigoTarifa;
    }
    public String getCCodigoTarifaImpuesto() {
        return this.CCodigoTarifaImpuesto;
    }
    
    public void setCCodigoTarifaImpuesto(String CCodigoTarifaImpuesto) {
        this.CCodigoTarifaImpuesto = CCodigoTarifaImpuesto;
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


