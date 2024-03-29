package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PlantillasMuestra generated by hbm2java
 */
public class PlantillasMuestra  implements java.io.Serializable {


     private Integer idPlantilla;
     private Integer idTipoComprobante;
     private String nombre;
     private String plantilla;
     private String texto;
     private String encabezado;
     private String fondo;
     private String tipoUso;
     private Integer prioridad;
     private String imagenPrevia;
     private Boolean contieneMarketing;
     private String versionCfd;
     private String descripcion;
     private Set configuracionPlantillas = new HashSet(0);

    public PlantillasMuestra() {
    }

	
    public PlantillasMuestra(String nombre, String plantilla, String texto, String encabezado, String fondo) {
        this.nombre = nombre;
        this.plantilla = plantilla;
        this.texto = texto;
        this.encabezado = encabezado;
        this.fondo = fondo;
    }
    public PlantillasMuestra(Integer idTipoComprobante, String nombre, String plantilla, String texto, String encabezado, String fondo, String tipoUso, Integer prioridad, String imagenPrevia, Boolean contieneMarketing, String versionCfd, String descripcion, Set configuracionPlantillas) {
       this.idTipoComprobante = idTipoComprobante;
       this.nombre = nombre;
       this.plantilla = plantilla;
       this.texto = texto;
       this.encabezado = encabezado;
       this.fondo = fondo;
       this.tipoUso = tipoUso;
       this.prioridad = prioridad;
       this.imagenPrevia = imagenPrevia;
       this.contieneMarketing = contieneMarketing;
       this.versionCfd = versionCfd;
       this.descripcion = descripcion;
       this.configuracionPlantillas = configuracionPlantillas;
    }
   
    public Integer getIdPlantilla() {
        return this.idPlantilla;
    }
    
    public void setIdPlantilla(Integer idPlantilla) {
        this.idPlantilla = idPlantilla;
    }
    public Integer getIdTipoComprobante() {
        return this.idTipoComprobante;
    }
    
    public void setIdTipoComprobante(Integer idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPlantilla() {
        return this.plantilla;
    }
    
    public void setPlantilla(String plantilla) {
        this.plantilla = plantilla;
    }
    public String getTexto() {
        return this.texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getEncabezado() {
        return this.encabezado;
    }
    
    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }
    public String getFondo() {
        return this.fondo;
    }
    
    public void setFondo(String fondo) {
        this.fondo = fondo;
    }
    public String getTipoUso() {
        return this.tipoUso;
    }
    
    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }
    public Integer getPrioridad() {
        return this.prioridad;
    }
    
    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
    public String getImagenPrevia() {
        return this.imagenPrevia;
    }
    
    public void setImagenPrevia(String imagenPrevia) {
        this.imagenPrevia = imagenPrevia;
    }
    public Boolean getContieneMarketing() {
        return this.contieneMarketing;
    }
    
    public void setContieneMarketing(Boolean contieneMarketing) {
        this.contieneMarketing = contieneMarketing;
    }
    public String getVersionCfd() {
        return this.versionCfd;
    }
    
    public void setVersionCfd(String versionCfd) {
        this.versionCfd = versionCfd;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getConfiguracionPlantillas() {
        return this.configuracionPlantillas;
    }
    
    public void setConfiguracionPlantillas(Set configuracionPlantillas) {
        this.configuracionPlantillas = configuracionPlantillas;
    }




}


