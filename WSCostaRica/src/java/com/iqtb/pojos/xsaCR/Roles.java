package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Roles generated by hbm2java
 */
public class Roles  implements java.io.Serializable {


     private Integer idRol;
     private String nombre;
     private String tipo;
     private String uso;
     private Set usuarioses = new HashSet(0);
     private Set rolesOpcioneses = new HashSet(0);

    public Roles() {
    }

	
    public Roles(String nombre, String tipo, String uso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.uso = uso;
    }
    public Roles(String nombre, String tipo, String uso, Set usuarioses, Set rolesOpcioneses) {
       this.nombre = nombre;
       this.tipo = tipo;
       this.uso = uso;
       this.usuarioses = usuarioses;
       this.rolesOpcioneses = rolesOpcioneses;
    }
   
    public Integer getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
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
    public String getUso() {
        return this.uso;
    }
    
    public void setUso(String uso) {
        this.uso = uso;
    }
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }
    public Set getRolesOpcioneses() {
        return this.rolesOpcioneses;
    }
    
    public void setRolesOpcioneses(Set rolesOpcioneses) {
        this.rolesOpcioneses = rolesOpcioneses;
    }




}


