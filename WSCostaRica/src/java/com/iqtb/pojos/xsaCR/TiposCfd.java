package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TiposCfd generated by hbm2java
 */
public class TiposCfd  implements java.io.Serializable {


     private Integer idTipoCfd;
     private Empresas empresas;
     private String nombre;
     private String tipo;
     private String versionCfd;
     private Set foliosEmpresases = new HashSet(0);
     private Set cfdses = new HashSet(0);
     private Set documentosRecibidoses = new HashSet(0);
     private Set usuariosRecepcions = new HashSet(0);

    public TiposCfd() {
    }

	
    public TiposCfd(Empresas empresas) {
        this.empresas = empresas;
    }
    
    public TiposCfd(Integer idTipoCfd, String nombre){
        this.idTipoCfd = idTipoCfd;
        this.nombre = nombre;
    }
    
    public TiposCfd(Empresas empresas, String nombre, String tipo, String versionCfd, Set foliosEmpresases, Set cfdses, Set documentosRecibidoses, Set usuariosRecepcions) {
       this.empresas = empresas;
       this.nombre = nombre;
       this.tipo = tipo;
       this.versionCfd = versionCfd;
       this.foliosEmpresases = foliosEmpresases;
       this.cfdses = cfdses;
       this.documentosRecibidoses = documentosRecibidoses;
       this.usuariosRecepcions = usuariosRecepcions;
    }
   
    public Integer getIdTipoCfd() {
        return this.idTipoCfd;
    }
    
    public void setIdTipoCfd(Integer idTipoCfd) {
        this.idTipoCfd = idTipoCfd;
    }
    public Empresas getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getVersionCfd() {
        return this.versionCfd;
    }
    
    public void setVersionCfd(String versionCfd) {
        this.versionCfd = versionCfd;
    }
    public Set getFoliosEmpresases() {
        return this.foliosEmpresases;
    }
    
    public void setFoliosEmpresases(Set foliosEmpresases) {
        this.foliosEmpresases = foliosEmpresases;
    }
    public Set getCfdses() {
        return this.cfdses;
    }
    
    public void setCfdses(Set cfdses) {
        this.cfdses = cfdses;
    }
    public Set getDocumentosRecibidoses() {
        return this.documentosRecibidoses;
    }
    
    public void setDocumentosRecibidoses(Set documentosRecibidoses) {
        this.documentosRecibidoses = documentosRecibidoses;
    }
    public Set getUsuariosRecepcions() {
        return this.usuariosRecepcions;
    }
    
    public void setUsuariosRecepcions(Set usuariosRecepcions) {
        this.usuariosRecepcions = usuariosRecepcions;
    }




}

