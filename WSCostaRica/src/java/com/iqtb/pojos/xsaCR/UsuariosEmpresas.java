package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1



/**
 * UsuariosEmpresas generated by hbm2java
 */
public class UsuariosEmpresas  implements java.io.Serializable {


     private UsuariosEmpresasId id;
     private Empresas empresas;
     private Usuarios usuarios;

    public UsuariosEmpresas() {
    }

    public UsuariosEmpresas(UsuariosEmpresasId id, Empresas empresas, Usuarios usuarios) {
       this.id = id;
       this.empresas = empresas;
       this.usuarios = usuarios;
    }
   
    public UsuariosEmpresasId getId() {
        return this.id;
    }
    
    public void setId(UsuariosEmpresasId id) {
        this.id = id;
    }
    public Empresas getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }




}

