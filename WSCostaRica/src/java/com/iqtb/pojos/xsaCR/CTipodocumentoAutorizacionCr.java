package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CTipodocumentoAutorizacionCr generated by hbm2java
 */
public class CTipodocumentoAutorizacionCr  implements java.io.Serializable {


     private Integer idTipoDocumentoAutorizacion;
     private String CTipoDocumentoAutorizacion;
     private String descripcion;
     private Date fechaInicioV;
     private Date fechaFinV;

    public CTipodocumentoAutorizacionCr() {
    }

	
    public CTipodocumentoAutorizacionCr(Date fechaInicioV) {
        this.fechaInicioV = fechaInicioV;
    }
    public CTipodocumentoAutorizacionCr(String CTipoDocumentoAutorizacion, String descripcion, Date fechaInicioV, Date fechaFinV) {
       this.CTipoDocumentoAutorizacion = CTipoDocumentoAutorizacion;
       this.descripcion = descripcion;
       this.fechaInicioV = fechaInicioV;
       this.fechaFinV = fechaFinV;
    }
   
    public Integer getIdTipoDocumentoAutorizacion() {
        return this.idTipoDocumentoAutorizacion;
    }
    
    public void setIdTipoDocumentoAutorizacion(Integer idTipoDocumentoAutorizacion) {
        this.idTipoDocumentoAutorizacion = idTipoDocumentoAutorizacion;
    }
    public String getCTipoDocumentoAutorizacion() {
        return this.CTipoDocumentoAutorizacion;
    }
    
    public void setCTipoDocumentoAutorizacion(String CTipoDocumentoAutorizacion) {
        this.CTipoDocumentoAutorizacion = CTipoDocumentoAutorizacion;
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


