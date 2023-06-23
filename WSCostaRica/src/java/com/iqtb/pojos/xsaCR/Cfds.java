package com.iqtb.pojos.xsaCR;
// Generated 21/06/2023 02:28:55 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cfds generated by hbm2java
 */
public class Cfds  implements java.io.Serializable {


     private Integer idCfd;
     private Clientes clientes;
     private Sucursales sucursales;
     private TiposCfd tiposCfd;
     private String serie;
     private Long folio;
     private String clave;
     private Date fecha;
     private Long numeroAprobacion;
     private Integer anioAprobacion;
     private BigDecimal subtotal;
     private BigDecimal descuento;
     private BigDecimal total;
     private String tipoMoneda;
     private BigDecimal tipoCambio;
     private BigDecimal totalImpuestos;
     private String estadoFiscal;
     private String estado;
     private Date fechaCancelacion;
     private Date fechaModificacion;
     private Integer idPlantilla;
     private Date fechaVencimiento;
     private String numeroCedulaEmisor;
     private String numeroCedulaReceptor;
     private Set documentosRecibidoses = new HashSet(0);

    public Cfds() {
    }

	
    public Cfds(Clientes clientes, Sucursales sucursales, TiposCfd tiposCfd, String clave, Date fecha, BigDecimal subtotal, BigDecimal total, Date fechaModificacion) {
        this.clientes = clientes;
        this.sucursales = sucursales;
        this.tiposCfd = tiposCfd;
        this.clave = clave;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.total = total;
        this.fechaModificacion = fechaModificacion;
    }
    public Cfds(Clientes clientes, Sucursales sucursales, TiposCfd tiposCfd, String serie, Long folio, String clave, Date fecha, Long numeroAprobacion, Integer anioAprobacion, BigDecimal subtotal, BigDecimal descuento, BigDecimal total, String tipoMoneda, BigDecimal tipoCambio, BigDecimal totalImpuestos, String estadoFiscal, String estado, Date fechaCancelacion, Date fechaModificacion, Integer idPlantilla, Date fechaVencimiento, String numeroCedulaEmisor, String numeroCedulaReceptor, Set documentosRecibidoses) {
       this.clientes = clientes;
       this.sucursales = sucursales;
       this.tiposCfd = tiposCfd;
       this.serie = serie;
       this.folio = folio;
       this.clave = clave;
       this.fecha = fecha;
       this.numeroAprobacion = numeroAprobacion;
       this.anioAprobacion = anioAprobacion;
       this.subtotal = subtotal;
       this.descuento = descuento;
       this.total = total;
       this.tipoMoneda = tipoMoneda;
       this.tipoCambio = tipoCambio;
       this.totalImpuestos = totalImpuestos;
       this.estadoFiscal = estadoFiscal;
       this.estado = estado;
       this.fechaCancelacion = fechaCancelacion;
       this.fechaModificacion = fechaModificacion;
       this.idPlantilla = idPlantilla;
       this.fechaVencimiento = fechaVencimiento;
       this.numeroCedulaEmisor = numeroCedulaEmisor;
       this.numeroCedulaReceptor = numeroCedulaReceptor;
       this.documentosRecibidoses = documentosRecibidoses;
    }
   
    public Integer getIdCfd() {
        return this.idCfd;
    }
    
    public void setIdCfd(Integer idCfd) {
        this.idCfd = idCfd;
    }
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
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
    public String getSerie() {
        return this.serie;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public Long getFolio() {
        return this.folio;
    }
    
    public void setFolio(Long folio) {
        this.folio = folio;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Long getNumeroAprobacion() {
        return this.numeroAprobacion;
    }
    
    public void setNumeroAprobacion(Long numeroAprobacion) {
        this.numeroAprobacion = numeroAprobacion;
    }
    public Integer getAnioAprobacion() {
        return this.anioAprobacion;
    }
    
    public void setAnioAprobacion(Integer anioAprobacion) {
        this.anioAprobacion = anioAprobacion;
    }
    public BigDecimal getSubtotal() {
        return this.subtotal;
    }
    
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
    public BigDecimal getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public String getTipoMoneda() {
        return this.tipoMoneda;
    }
    
    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
    public BigDecimal getTipoCambio() {
        return this.tipoCambio;
    }
    
    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
    public BigDecimal getTotalImpuestos() {
        return this.totalImpuestos;
    }
    
    public void setTotalImpuestos(BigDecimal totalImpuestos) {
        this.totalImpuestos = totalImpuestos;
    }
    public String getEstadoFiscal() {
        return this.estadoFiscal;
    }
    
    public void setEstadoFiscal(String estadoFiscal) {
        this.estadoFiscal = estadoFiscal;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Date getFechaCancelacion() {
        return this.fechaCancelacion;
    }
    
    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Integer getIdPlantilla() {
        return this.idPlantilla;
    }
    
    public void setIdPlantilla(Integer idPlantilla) {
        this.idPlantilla = idPlantilla;
    }
    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getNumeroCedulaEmisor() {
        return this.numeroCedulaEmisor;
    }
    
    public void setNumeroCedulaEmisor(String numeroCedulaEmisor) {
        this.numeroCedulaEmisor = numeroCedulaEmisor;
    }
    public String getNumeroCedulaReceptor() {
        return this.numeroCedulaReceptor;
    }
    
    public void setNumeroCedulaReceptor(String numeroCedulaReceptor) {
        this.numeroCedulaReceptor = numeroCedulaReceptor;
    }
    public Set getDocumentosRecibidoses() {
        return this.documentosRecibidoses;
    }
    
    public void setDocumentosRecibidoses(Set documentosRecibidoses) {
        this.documentosRecibidoses = documentosRecibidoses;
    }




}


