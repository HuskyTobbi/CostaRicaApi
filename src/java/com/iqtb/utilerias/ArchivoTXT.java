/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.utilerias;

import com.iqtb.daos.xsaCR.DocumentosRecibidosDAO;
import com.iqtb.daos.xsaCR.EmpresasDAO;
import com.iqtb.daos.xsaCR.SucursalesDAO;
import com.iqtb.daos.xsaCR.XmlsDAO;
import com.iqtb.exceptions.ErrorAutenticacion;
import com.iqtb.exceptions.ErrorNoEmisor;
import com.iqtb.modelosAux.TxtArchivo;
import com.iqtb.modelosAux.Peticion;
import com.iqtb.modelosAux.Respuesta;
import com.iqtb.modelosAux.TxtRespuesta;
import com.iqtb.pojos.xsaCR.DocumentosRecibidos;
import com.iqtb.pojos.xsaCR.Sucursales;
import com.iqtb.pojos.xsaCR.Xmls;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.jdom.Content;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author macminidesarrollo
 */
public class ArchivoTXT {
    static Logger logger = Logger.getLogger(ArchivoTXT.class);
    private EmpresasDAO empresaDAO = new EmpresasDAO();
    String ArchivoTXTBase64 = null;
    
    ProcesarTXT procesarXML = null;
    private List<Respuesta> listaRespuesta;
    
    public ArchivoTXT(String ArchivoTXTBase64) {
        this.ArchivoTXTBase64 = ArchivoTXTBase64;
    }
    
    public String procesamientoSolicitud(){
        String errorGeneral = null;
        try {
            logger.info("Se recibio peticion: "+ArchivoTXTBase64);
            byte[] XMLRecibido = LibBase64.decode(this.ArchivoTXTBase64);
            if(XMLRecibido != null){
                String xml = new String(XMLRecibido, "UTF-8");
                this.procesarXML = new ProcesarTXT(new ByteArrayInputStream(XMLRecibido));
                List<Peticion> listaPeticiones = procesarXML.obtenerObjetosSolicitud();
                if(listaPeticiones != null && !listaPeticiones.isEmpty()){
                    this.listaRespuesta = new ArrayList<Respuesta>();
                    logger.info("Se encontraron peticiones");
                    for(Peticion peticionItem : listaPeticiones){
                        logger.info("procesando peticion");
                        insertarPeticion(peticionItem);
                        logger.info("terminando peticion");
                    }
                    return armarRepuesta();
                } else {
                    logger.warn("No se encontraron peticiones");
                    return "no se encontro ninguna peticion";
                }
            } else {
                return crearRespuestaVacio();
            }
            
        } catch (UnsupportedEncodingException ex) {
            logger.error("Error method procesamientoSolicitud UnsupportedEncodingException: "+ex);
            errorGeneral = "Error al recuperar la codificacion de la solicitud";
        } catch (JDOMException ex) {
            logger.error("Error method procesamientoSolicitud JDOMException: "+ex);
            errorGeneral = "Error al leer el XML de la solicitud enviada";
        } catch (ErrorAutenticacion ex) {
            logger.error("Surgieron errores de autenticacion: " + ex.getMessage());
            errorGeneral = ex.getMessage();
        } catch (ErrorNoEmisor ex) { 
            logger.error("Error, " + ex.getMessage());
            errorGeneral = "No es posible guardar el txt, debido a que no se coloco un NoEmisor correcto o registrado en BD";
        }
        
        return errorGeneral;
    }
    
    public void insertarPeticion(Peticion peticion) throws ErrorNoEmisor {
        if (peticion != null) {
            String NoEmisor = peticion.getNoEmisor();
            logger.info("Se obtuvo el NoEmisor: " + NoEmisor);
            if (NoEmisor != null) {
                Integer idEmpresa = this.empresaDAO.verificarEmpresa(NoEmisor);
                if (idEmpresa != null) {
                    logger.info("Se encontro el idEmpresa: "+idEmpresa);
                    logger.info("El Numero Emisor para procesar peticion es: " + NoEmisor);
                    procesarPeticion(peticion, null, NoEmisor, idEmpresa);
                } else {
                    throw new ErrorNoEmisor("El numero Emisor no se encuentra registrado en las Empresas Conocidas");
                    //procesarPeticion(peticion, null, NoEmisor, null);
                }
                
            } else {
                throw new ErrorNoEmisor("No se indico el NoEmisor del emisor al que se va a insertar");
            }
        } else {
            logger.info("peticion es nula");
        }
    }
    
    public String armarRepuesta() {
        if (this.listaRespuesta != null && !this.listaRespuesta.isEmpty()) {
            String cadenaRespuesta = this.procesarXML.crearRespuesta(this.listaRespuesta);
            try {
                logger.info("Cadena de respuesta: \n" + cadenaRespuesta);
                String cadBase64Respuesta = LibBase64.encode(cadenaRespuesta.getBytes("UTF-8"));
                return cadBase64Respuesta;
            } catch (UnsupportedEncodingException ex) {
                logger.error("ERROR encoding: " + ex.getMessage());
            }
        }
        logger.info("La lista nula, se retornarnulo");
        return null;
    }
    
    public void procesarPeticion(Peticion peticion, String error, String NoEmisor, Integer idEmpresa) {
        List<TxtArchivo> listaFacturasArchivo = peticion.getListaTxtArchivo();
        List<TxtRespuesta> listaTxtRespuesta = new ArrayList<TxtRespuesta>();
        if(idEmpresa != null){
            if (listaFacturasArchivo != null) {
                logger.info("La lista de facturas: " + listaFacturasArchivo.size());
                int auxContador = 0;
                logger.info("Se recibio la listaFactRespuesta de peticiones con tamanio: " + listaFacturasArchivo.size());
                for (TxtArchivo facturaArchivoItem : listaFacturasArchivo) {
                    try {
                        auxContador++;  
                        //logger.info("El tamano de la lista para la peticion con id[" + auxContador + "] ");
                        String txtBase64 = facturaArchivoItem.getArchivoTxt();
                        logger.info("txt en base64: " + txtBase64);
                        byte[] txtBytes = LibBase64.decode(txtBase64);
                        if(txtBytes != null ){
                            String txt = new String(txtBytes, "UTF-8");
                            if (txt != null && !txt.isEmpty()) {
                                txt = txt.trim();
                                txtBytes = txt.getBytes("UTF-8");
                                txt = new String(txtBytes, "UTF-8");
                            }
                            //String clave = facturaArchivoItem.getClave();
                            boolean isTxt = false;
                            //Hay que validar que realmente sea un .txt 
                            isTxt = true;
                            //por desarrollar

                            if (isTxt ) {
                            //if (isTxt && clave!= null && clave.length()==50) {
                                //logger.info("Se guardara archivo con Clave: "+clave);
                                //Guardar Txt
                                DocumentosRecibidos documentosRecibidoTemp = new DocumentosRecibidos();
                                Sucursales sucursal = new SucursalesDAO().getByIdEmpresa(idEmpresa);
                                documentosRecibidoTemp.setSucursales(sucursal);
                                documentosRecibidoTemp.setFechaRecepcion(new Date());
                                documentosRecibidoTemp.setArchivo(txt);
                                documentosRecibidoTemp.setEstado("NUEVO");
                                Integer idARCHIVO = new DocumentosRecibidosDAO().SaveOrUpdate(documentosRecibidoTemp);
                                if (idARCHIVO != null) {
                                    logger.info("DocumentoRecibido guardado con idARCHIVO: " + idARCHIVO);
                                    Thread.sleep(6500);
                                    DocumentosRecibidos archivoGenerado = new DocumentosRecibidosDAO().getByIdArchivo(idARCHIVO);
                                    if(archivoGenerado != null){
                                        logger.info("Se encontro documento recibido con estado diferente de NUEVO");
                                        if(archivoGenerado.getEstado().equals("GENERADO")){
                                            Xmls objXml = new XmlsDAO().getByIdArchivo(idARCHIVO);
                                            String xmlTimbrado = "";
                                            if(objXml != null){
                                                logger.info("Se encontro objXml se agrega xmlsf");
                                                if(objXml.getXmlSf() != null){
                                                    xmlTimbrado = objXml.getXmlSf();
                                                }
                                            } 
                                            TxtRespuesta txtResp = new TxtRespuesta("GENERADO", xmlTimbrado);
                                            listaTxtRespuesta.add(txtResp);
                                        }
                                        
                                        if(archivoGenerado.getEstado().equals("ERROR")){
                                            TxtRespuesta txtResp = new TxtRespuesta("ERROR",archivoGenerado.getError());
                                            listaTxtRespuesta.add(txtResp);
                                        }
                                    } else {
                                        logger.info("No se ha procesado o esta siendo procesado el nuevo documento recibido");
                                        TxtRespuesta txtResp = new TxtRespuesta("Guardado", "El documento sera procesado o esta siendo procesado");
                                        listaTxtRespuesta.add(txtResp);
                                    }
                                } else {
                                    logger.info("El DocumentoRecibido no pudo ser guardado correcamente");
                                    TxtRespuesta txtResp = new TxtRespuesta("No guardado", "El DocumentoRecibido no pudo ser guardado correctamente, intente mas tarde");
                                    listaTxtRespuesta.add(txtResp);
                                }
                            } else {
                                logger.info("El contenido erroneo del txt es: " + txt);
                                logger.info("Armando Respuesta erronea de contenido TXT");
                                TxtRespuesta txtResp = new TxtRespuesta("No guardado", "El txt No es base 64 o la clave es erronea");
                                listaTxtRespuesta.add(txtResp);
                            }
                        } else {
                            logger.info("El contenido ArchivoTxt del txt esta vacio");
                            logger.info("Armando Respuesta erronea de contenido TXT");
                            TxtRespuesta txtResp = new TxtRespuesta("No guardado", "El contenido ArchivoTxt del txt esta vacio");
                            listaTxtRespuesta.add(txtResp);
                        }
                    } catch (UnsupportedEncodingException ex) {
                        logger.error("Error de codificacion: " + ex.getMessage());
                    } catch (InterruptedException ex) {
                        logger.error("InterruptedException: " + ex);
                    }
                }
            } else {
                logger.info("La lista de Txt es nula");
            }
        } else {
            logger.info("El NoEmisor no corresponde a ninguna Empresa registrada");
            logger.info("Armando Respuesta erronea de contenido TXT");
            TxtRespuesta txtResp = new TxtRespuesta("No guardado", "El NoEmisor no corresponde a ninguna Empresa registrada");
            listaTxtRespuesta.add(txtResp);
        }
        logger.info("El tamano de la lista para la peticion con NoEmisor " + NoEmisor + " para responder es de: " + ((listaTxtRespuesta != null) ? Integer.valueOf(listaTxtRespuesta.size()) : "Vacia"));
        this.listaRespuesta.add(new Respuesta(NoEmisor, listaTxtRespuesta));
    }
    
    public static String crearRespuestaVacio() {
        Document docNuevo = new Document();
        org.jdom.Element respuesta = new org.jdom.Element("Respuesta");
        org.jdom.Element validar = new org.jdom.Element("Validar");
        org.jdom.Element txt = new org.jdom.Element("Txt");
        //Aqui se comienza a crear la respuesta
        txt.setAttribute("estado", "Error");
        txt.setAttribute("error", "La peticion es erronea o esta vacia");
        validar.addContent((Content) txt);
        respuesta.addContent((Content) validar);
        docNuevo.addContent((Content) respuesta);
        XMLOutputter xmloutputter = new XMLOutputter(Format.getPrettyFormat());
        
        try {
            String response = xmloutputter.outputString(docNuevo);
            logger.info("response: \n"+response);
            return LibBase64.encode(response.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            logger.error("UnsupportedEncodingException: "+ex);
            return "Peticion vacia";
        }
        
    }
}
