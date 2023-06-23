package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Sucursales generated by hbm2java
 */
public class Sucursales  implements java.io.Serializable {


     private Integer idSucursal;
     private Empresas empresas;
     private String tiposucursal;
     private String claveSucursal;
     private String email;
     private String idTipo;
     private String idNumero;
     private Integer idCertificadosSucursales;
     private String nombre;
     private String provincia;
     private String canton;
     private String distrito;
     private String otrasSenias;
     private String telefonoCodpais;
     private String numTelefono;
     private Set cfdses = new HashSet(0);
     private Set usuariosRecepcions = new HashSet(0);
     private Set configuracionesParametroses = new HashSet(0);
     private Set documentosRecibidoses = new HashSet(0);

    public Sucursales() {
    }

	
    public Sucursales(Empresas empresas, String tiposucursal, String idNumero) {
        this.empresas = empresas;
        this.tiposucursal = tiposucursal;
        this.idNumero = idNumero;
    }
    public Sucursales(Empresas empresas, String tiposucursal, String claveSucursal, String email, String idTipo, String idNumero, Integer idCertificadosSucursales, String nombre, String provincia, String canton, String distrito, String otrasSenias, String telefonoCodpais, String numTelefono, Set cfdses, Set usuariosRecepcions, Set configuracionesParametroses, Set documentosRecibidoses) {
       this.empresas = empresas;
       this.tiposucursal = tiposucursal;
       this.claveSucursal = claveSucursal;
       this.email = email;
       this.idTipo = idTipo;
       this.idNumero = idNumero;
       this.idCertificadosSucursales = idCertificadosSucursales;
       this.nombre = nombre;
       this.provincia = provincia;
       this.canton = canton;
       this.distrito = distrito;
       this.otrasSenias = otrasSenias;
       this.telefonoCodpais = telefonoCodpais;
       this.numTelefono = numTelefono;
       this.cfdses = cfdses;
       this.usuariosRecepcions = usuariosRecepcions;
       this.configuracionesParametroses = configuracionesParametroses;
       this.documentosRecibidoses = documentosRecibidoses;
    }
   
    public Integer getIdSucursal() {
        return this.idSucursal;
    }
    
    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }
    public Empresas getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }
    public String getTiposucursal() {
        return this.tiposucursal;
    }
    
    public void setTiposucursal(String tiposucursal) {
        this.tiposucursal = tiposucursal;
    }
    public String getClaveSucursal() {
        return this.claveSucursal;
    }
    
    public void setClaveSucursal(String claveSucursal) {
        this.claveSucursal = claveSucursal;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }
    public String getIdNumero() {
        return this.idNumero;
    }
    
    public void setIdNumero(String idNumero) {
        this.idNumero = idNumero;
    }
    public Integer getIdCertificadosSucursales() {
        return this.idCertificadosSucursales;
    }
    
    public void setIdCertificadosSucursales(Integer idCertificadosSucursales) {
        this.idCertificadosSucursales = idCertificadosSucursales;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getCanton() {
        return this.canton;
    }
    
    public void setCanton(String canton) {
        this.canton = canton;
    }
    public String getDistrito() {
        return this.distrito;
    }
    
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public String getOtrasSenias() {
        return this.otrasSenias;
    }
    
    public void setOtrasSenias(String otrasSenias) {
        this.otrasSenias = otrasSenias;
    }
    public String getTelefonoCodpais() {
        return this.telefonoCodpais;
    }
    
    public void setTelefonoCodpais(String telefonoCodpais) {
        this.telefonoCodpais = telefonoCodpais;
    }
    public String getNumTelefono() {
        return this.numTelefono;
    }
    
    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
    public Set getCfdses() {
        return this.cfdses;
    }
    
    public void setCfdses(Set cfdses) {
        this.cfdses = cfdses;
    }
    public Set getUsuariosRecepcions() {
        return this.usuariosRecepcions;
    }
    
    public void setUsuariosRecepcions(Set usuariosRecepcions) {
        this.usuariosRecepcions = usuariosRecepcions;
    }
    public Set getConfiguracionesParametroses() {
        return this.configuracionesParametroses;
    }
    
    public void setConfiguracionesParametroses(Set configuracionesParametroses) {
        this.configuracionesParametroses = configuracionesParametroses;
    }
    public Set getDocumentosRecibidoses() {
        return this.documentosRecibidoses;
    }
    
    public void setDocumentosRecibidoses(Set documentosRecibidoses) {
        this.documentosRecibidoses = documentosRecibidoses;
    }




}


