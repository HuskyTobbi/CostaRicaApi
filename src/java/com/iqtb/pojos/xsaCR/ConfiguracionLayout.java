package com.iqtb.pojos.xsaCR;
// Generated 4/04/2022 02:52:13 PM by Hibernate Tools 4.3.1



/**
 * ConfiguracionLayout generated by hbm2java
 */
public class ConfiguracionLayout  implements java.io.Serializable {


     private Integer idLayout;
     private int idEmpresa;
     private String nombre;
     private String json;

    public ConfiguracionLayout() {
    }

    public ConfiguracionLayout(int idEmpresa, String nombre, String json) {
       this.idEmpresa = idEmpresa;
       this.nombre = nombre;
       this.json = json;
    }
   
    public Integer getIdLayout() {
        return this.idLayout;
    }
    
    public void setIdLayout(Integer idLayout) {
        this.idLayout = idLayout;
    }
    public int getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getJson() {
        return this.json;
    }
    
    public void setJson(String json) {
        this.json = json;
    }




}

