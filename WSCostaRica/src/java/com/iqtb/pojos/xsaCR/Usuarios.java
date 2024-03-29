package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer idUsuario;
     private Roles roles;
     private String email;
     private String nombre;
     private String paterno;
     private String materno;
     private String passkey;
     private Integer fallidos;
     private String status;
     private String userId;
     private boolean notifiedExpiration;
     private String referencia;
     private Date dateExpirationUser;
     private Date lastPassChange;
     private Date fechaAlta;
     private Set usuariosEmpresases = new HashSet(0);

    public Usuarios() {
    }

	
    public Usuarios(Roles roles, String email, String passkey, String status, String userId, boolean notifiedExpiration) {
        this.roles = roles;
        this.email = email;
        this.passkey = passkey;
        this.status = status;
        this.userId = userId;
        this.notifiedExpiration = notifiedExpiration;
    }
    public Usuarios(Roles roles, String email, String nombre, String paterno, String materno, String passkey, Integer fallidos, String status, String userId, boolean notifiedExpiration, String referencia, Date dateExpirationUser, Date lastPassChange, Date fechaAlta, Set usuariosEmpresases) {
       this.roles = roles;
       this.email = email;
       this.nombre = nombre;
       this.paterno = paterno;
       this.materno = materno;
       this.passkey = passkey;
       this.fallidos = fallidos;
       this.status = status;
       this.userId = userId;
       this.notifiedExpiration = notifiedExpiration;
       this.referencia = referencia;
       this.dateExpirationUser = dateExpirationUser;
       this.lastPassChange = lastPassChange;
       this.fechaAlta = fechaAlta;
       this.usuariosEmpresases = usuariosEmpresases;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPaterno() {
        return this.paterno;
    }
    
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public String getMaterno() {
        return this.materno;
    }
    
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public String getPasskey() {
        return this.passkey;
    }
    
    public void setPasskey(String passkey) {
        this.passkey = passkey;
    }
    public Integer getFallidos() {
        return this.fallidos;
    }
    
    public void setFallidos(Integer fallidos) {
        this.fallidos = fallidos;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public boolean isNotifiedExpiration() {
        return this.notifiedExpiration;
    }
    
    public void setNotifiedExpiration(boolean notifiedExpiration) {
        this.notifiedExpiration = notifiedExpiration;
    }
    public String getReferencia() {
        return this.referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public Date getDateExpirationUser() {
        return this.dateExpirationUser;
    }
    
    public void setDateExpirationUser(Date dateExpirationUser) {
        this.dateExpirationUser = dateExpirationUser;
    }
    public Date getLastPassChange() {
        return this.lastPassChange;
    }
    
    public void setLastPassChange(Date lastPassChange) {
        this.lastPassChange = lastPassChange;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public Set getUsuariosEmpresases() {
        return this.usuariosEmpresases;
    }
    
    public void setUsuariosEmpresases(Set usuariosEmpresases) {
        this.usuariosEmpresases = usuariosEmpresases;
    }




}


