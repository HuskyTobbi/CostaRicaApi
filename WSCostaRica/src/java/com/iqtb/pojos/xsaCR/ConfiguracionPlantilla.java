package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1



/**
 * ConfiguracionPlantilla generated by hbm2java
 */
public class ConfiguracionPlantilla  implements java.io.Serializable {


     private Integer idConfiguracion;
     private Empresas empresas;
     private PlantillasMuestra plantillasMuestra;

    public ConfiguracionPlantilla() {
    }

    public ConfiguracionPlantilla(Empresas empresas, PlantillasMuestra plantillasMuestra) {
       this.empresas = empresas;
       this.plantillasMuestra = plantillasMuestra;
    }
   
    public Integer getIdConfiguracion() {
        return this.idConfiguracion;
    }
    
    public void setIdConfiguracion(Integer idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }
    public Empresas getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }
    public PlantillasMuestra getPlantillasMuestra() {
        return this.plantillasMuestra;
    }
    
    public void setPlantillasMuestra(PlantillasMuestra plantillasMuestra) {
        this.plantillasMuestra = plantillasMuestra;
    }




}


