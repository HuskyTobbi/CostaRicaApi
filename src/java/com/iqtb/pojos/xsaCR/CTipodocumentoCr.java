package com.iqtb.pojos.xsaCR;
// Generated 4/04/2022 02:52:13 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CTipodocumentoCr generated by hbm2java
 */
public class CTipodocumentoCr  implements java.io.Serializable {


     private Integer idTipoDocumento;
     private String CTipoDocumento;
     private String descripcion;
     private Date fechaInicioV;
     private Date fechaFinV;
     private Set documentosRecibidoses = new HashSet(0);

    public CTipodocumentoCr() {
    }

	
    public CTipodocumentoCr(Date fechaInicioV) {
        this.fechaInicioV = fechaInicioV;
    }
    public CTipodocumentoCr(String CTipoDocumento, String descripcion, Date fechaInicioV, Date fechaFinV, Set documentosRecibidoses) {
       this.CTipoDocumento = CTipoDocumento;
       this.descripcion = descripcion;
       this.fechaInicioV = fechaInicioV;
       this.fechaFinV = fechaFinV;
       this.documentosRecibidoses = documentosRecibidoses;
    }
   
    public Integer getIdTipoDocumento() {
        return this.idTipoDocumento;
    }
    
    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    public String getCTipoDocumento() {
        return this.CTipoDocumento;
    }
    
    public void setCTipoDocumento(String CTipoDocumento) {
        this.CTipoDocumento = CTipoDocumento;
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
    public Set getDocumentosRecibidoses() {
        return this.documentosRecibidoses;
    }
    
    public void setDocumentosRecibidoses(Set documentosRecibidoses) {
        this.documentosRecibidoses = documentosRecibidoses;
    }




}

