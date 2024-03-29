package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1



/**
 * UsuariosRecepcion generated by hbm2java
 */
public class UsuariosRecepcion  implements java.io.Serializable {


     private Integer idUsuarioRecepcion;
     private Sucursales sucursales;
     private TiposCfd tiposCfd;
     private String nombre;
     private String usuario;
     private String passwd;
     private String homeftp;
     private String homesftp;

    public UsuariosRecepcion() {
    }

	
    public UsuariosRecepcion(Sucursales sucursales, TiposCfd tiposCfd, String nombre, String usuario, String passwd) {
        this.sucursales = sucursales;
        this.tiposCfd = tiposCfd;
        this.nombre = nombre;
        this.usuario = usuario;
        this.passwd = passwd;
    }
    public UsuariosRecepcion(Sucursales sucursales, TiposCfd tiposCfd, String nombre, String usuario, String passwd, String homeftp, String homesftp) {
       this.sucursales = sucursales;
       this.tiposCfd = tiposCfd;
       this.nombre = nombre;
       this.usuario = usuario;
       this.passwd = passwd;
       this.homeftp = homeftp;
       this.homesftp = homesftp;
    }
   
    public Integer getIdUsuarioRecepcion() {
        return this.idUsuarioRecepcion;
    }
    
    public void setIdUsuarioRecepcion(Integer idUsuarioRecepcion) {
        this.idUsuarioRecepcion = idUsuarioRecepcion;
    }
    public Sucursales getSucursales() {
        return this.sucursales;
    }
    
    public void setSucursales(Sucursales sucursales) {
        this.sucursales = sucursales;
    }
    public TiposCfd getTiposCfd() {
        return this.tiposCfd;
    }
    
    public void setTiposCfd(TiposCfd tiposCfd) {
        this.tiposCfd = tiposCfd;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPasswd() {
        return this.passwd;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getHomeftp() {
        return this.homeftp;
    }
    
    public void setHomeftp(String homeftp) {
        this.homeftp = homeftp;
    }
    public String getHomesftp() {
        return this.homesftp;
    }
    
    public void setHomesftp(String homesftp) {
        this.homesftp = homesftp;
    }




}


