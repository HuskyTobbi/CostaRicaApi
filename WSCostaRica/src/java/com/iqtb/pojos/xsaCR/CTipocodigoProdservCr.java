package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CTipocodigoProdservCr generated by hbm2java
 */
public class CTipocodigoProdservCr  implements java.io.Serializable {


     private Integer idTipoCodigoProdserv;
     private String CTipoCodigoProdserv;
     private String descripcion;
     private Date fechaInicioV;
     private Date fechaFinV;

    public CTipocodigoProdservCr() {
    }

	
    public CTipocodigoProdservCr(Date fechaInicioV) {
        this.fechaInicioV = fechaInicioV;
    }
    public CTipocodigoProdservCr(String CTipoCodigoProdserv, String descripcion, Date fechaInicioV, Date fechaFinV) {
       this.CTipoCodigoProdserv = CTipoCodigoProdserv;
       this.descripcion = descripcion;
       this.fechaInicioV = fechaInicioV;
       this.fechaFinV = fechaFinV;
    }
   
    public Integer getIdTipoCodigoProdserv() {
        return this.idTipoCodigoProdserv;
    }
    
    public void setIdTipoCodigoProdserv(Integer idTipoCodigoProdserv) {
        this.idTipoCodigoProdserv = idTipoCodigoProdserv;
    }
    public String getCTipoCodigoProdserv() {
        return this.CTipoCodigoProdserv;
    }
    
    public void setCTipoCodigoProdserv(String CTipoCodigoProdserv) {
        this.CTipoCodigoProdserv = CTipoCodigoProdserv;
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


