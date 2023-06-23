/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.utilerias;

import com.iqtb.daos.xsaCR.UsuariosRecepcionDAO;
import com.iqtb.exceptions.ErrorAutenticacion;
import com.iqtb.modelosAux.TxtArchivo;
import com.iqtb.modelosAux.Peticion;
import com.iqtb.modelosAux.Respuesta;
import com.iqtb.modelosAux.TxtRespuesta;
import com.iqtb.pojos.xsaCR.UsuariosRecepcion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import net.sourceforge.lightcrypto.PBECrypt;
import org.apache.log4j.Logger;
import org.bouncycastle.crypto.DataLengthException;
import org.jdom.Document;
import org.dom4j.Element;
import org.jdom.Content;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author macminidesarrollo
 */
public class ProcesarTXT {

    static Logger logger = Logger.getLogger(ProcesarTXT.class);

    Document document;

    Document docNuevo;

    Element validacionResultado;

    Element resultado;

    public ProcesarTXT(InputStream archivoXML) throws JDOMException {
        SAXBuilder builder = new SAXBuilder();
        try {
            logger.debug("Creando el builder: ");
            this.document = builder.build(archivoXML);
            logger.info("El documento: " + this.document.toString());
        } catch (JDOMException ex) {
            logger.error("Error en JDOM: " + ex.getMessage());
            logger.error("La causa: " + ex.getCause());
            logger.error("La localizacion: " + ex.getLocalizedMessage());
            throw new JDOMException(ex.getMessage());
        } catch (IOException ex) {
            logger.error("Error en IOEception: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            archivoXML = null;
        }
    }

    public List<Peticion> obtenerObjetosSolicitud() throws ErrorAutenticacion {
        org.jdom.Element principalRoot = this.document.getRootElement();
        List<org.jdom.Element> listaHijos = principalRoot.getChildren();
        if (listaHijos != null && !listaHijos.isEmpty()) {
            List<Peticion> listaPeticiones = new ArrayList<Peticion>();
            for (org.jdom.Element peticion : listaHijos) {
                String usuario = peticion.getAttributeValue("Usuario");
                logger.info("usuario: " + usuario);
                String password = peticion.getAttributeValue("Contrasena");
                logger.info("contrasenia: " + password);
                if (usuario == null || usuario.isEmpty() || password == null || password.isEmpty()) {
                    logger.info("El usuario y/o la contrasena se encuentran vacias");
                    throw new ErrorAutenticacion("El usuario y/o la contrasena se encuentran vacias");
                }
                UsuariosRecepcion objUsuarioBd = verificarUsuarioBd(usuario, password);
                if (objUsuarioBd != null) {
                    String NoEmisor = peticion.getAttributeValue("NoEmisor").trim();
                    logger.info("El numero Emisor para la peticion: " + NoEmisor);
                    Peticion objetoPeticion = new Peticion(NoEmisor);
                    List<org.jdom.Element> listaArchivos = peticion.getChildren("Txt");
                    if (listaArchivos != null && !listaArchivos.isEmpty()) {
                        List<TxtArchivo> listaTxtArchivo = new ArrayList<>();
                        logger.info("Los hijos de Txt son: " + listaArchivos.size());
                        int nofactura = 0;
                        Iterator<org.jdom.Element> iterator = listaArchivos.iterator();
                        if (iterator.hasNext()) {
                            org.jdom.Element txt = iterator.next();
                            nofactura++;
                            List<org.jdom.Element> listaHijosT = txt.getChildren();
                            if (listaHijosT != null && !listaHijosT.isEmpty()) {
                                String archivoTxt = null;
                                //String clave = null;
                                for (org.jdom.Element hijoArchivo : listaHijosT) {
                                    logger.info("Recorriendo la lista de Hijos  de Txt [" + nofactura + "]");
                                    
                                    if (hijoArchivo.getName().equals("ArchivoTxt")){
                                        logger.info("Dentro del nodo Txt se encontro atributo [ArchivoTxt]");
                                        archivoTxt = listaHijosT.get(0).getAttributeValue("ArchivoTxt");
                                        //clave = listaHijosT.get(0).getAttributeValue("Clave");
                                    }
                                }
                                //if (archivoTxt != null && clave != null) {
                                if (archivoTxt != null) {
                                    logger.info("agregando archivoTxt");
                                    //listaTxtArchivo.add(new TxtArchivo(archivoTxt, clave));
                                    listaTxtArchivo.add(new TxtArchivo(archivoTxt));
                                    archivoTxt = null;

                                }
                            }
                        }
                        logger.info("Agregando el Archivo " + listaTxtArchivo.size() + " para el NoEmisor: " + NoEmisor);
                        objetoPeticion.setListaTxtArchivo(listaTxtArchivo);
                        logger.info("termino de recorrer los nodos Validar");
                    } else {
                        logger.info("La lista de Txt es nula");
                    }
                    objetoPeticion.setUsuarioRecepcion(objUsuarioBd);
                    listaPeticiones.add(objetoPeticion);
                    continue;
                }
                logger.warn("El usuario no se encuentra registrado, por favor revisar");
                throw new ErrorAutenticacion("El usuario no se encuentra registrado, por favor revisar");
            }
            logger.info("La lista de peticiones es: " + ((listaPeticiones != null) ? Integer.valueOf(listaPeticiones.size()) : "Esta vacio"));
            return listaPeticiones;
        }
        logger.info("No existen hijos para este nodo Validar");
        return null;
    }

    

    
    
    
    private UsuariosRecepcion verificarUsuarioBd(String usuario, String passVerificar) throws ErrorAutenticacion {
        UsuariosRecepcionDAO oUsuariosRecepcionDAO = new UsuariosRecepcionDAO();
        UsuariosRecepcion oUsuariosRecepcion = null;
        String usuarioBd;
        String passBd;

        usuario = usuario.trim();
        passVerificar = passVerificar.trim();
        oUsuariosRecepcion = oUsuariosRecepcionDAO.getUsuarioRecepcion(usuario);
        if (oUsuariosRecepcion != null) {
            usuarioBd = oUsuariosRecepcion.getUsuario();
            //passBd = oUsuariosRecepcion.getPasswd();
            passBd = oUsuariosRecepcion.getPasswd();
            logger.info("El usuario[" + usuarioBd + "<-> " + passBd + "] se encuentra en Bd.");
            if (usuario.equals(usuarioBd)) {
                logger.info("El usuario[" + usuario + "] se encuentra en Bd.");
                String pass_Des = desencryPwd(passBd);
                if (passVerificar.equals(pass_Des)) {
                    logger.info("la contrasena es valida para el usuario[" + usuario + "], continua la revision");
                    return oUsuariosRecepcion;
                } else {
                    logger.info("La contrasena es invalida para el usuario[" + usuario + "], pass: " + passVerificar);
                    throw new ErrorAutenticacion("La contrasena es incorrecta");
                }
            }

        }
        return null;

    }

    private String desencryPwd(String pwd) {
        logger.debug("obteniendo la contrasena");
        if (pwd == null || pwd.trim().length() == 0) {
            return "";
        }
        try {
            return PBECrypt.decrypt(new StringBuffer(pwd.trim().replace("%2B", "+")), new StringBuffer("password")).toString();
        } catch (IOException ex) {
            logger.error("Error al recibir password: " + ex.getMessage());
            return null;
        } catch (DataLengthException ex) {
            logger.error("Error la contrasena no contiene el formato necesario: " + ex.getMessage());
            return null;
        } catch (net.sourceforge.lightcrypto.CryptoException ex) {
            java.util.logging.Logger.getLogger(ProcesarTXT.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String crearRespuesta(List<Respuesta> listaRespuesta) {
        Document docNuevo = new Document();
        //logger.info("El tamano de respuestas es: " + listaRespuesta.size());
        org.jdom.Element respuesta = new org.jdom.Element("Respuesta");
        for (Respuesta respuestaItem : listaRespuesta) {
            org.jdom.Element validar = new org.jdom.Element("Validar");
            validar.setAttribute("NoEmisor", respuestaItem.getNoEmisor()+"");
            List<TxtRespuesta> listaTxtRespuesta = respuestaItem.getListaTxtRespuesta();
            if (listaTxtRespuesta != null && !listaTxtRespuesta.isEmpty()) {
                //logger.info("El tamano de la lista de txtRespuesta para la transaccion: " + respuestaItem.getListaTxtRespuesta().size());
                for (TxtRespuesta objTxtRespuesta : listaTxtRespuesta) {
                    org.jdom.Element factura = new org.jdom.Element("Txt");
                    //Aqui se comienza a crear la respuesta
                    factura.setAttribute("estado",objTxtRespuesta.getRespuesta());
                    if(objTxtRespuesta.getMensaje()!= null && !objTxtRespuesta.getMensaje().isEmpty()){
                        factura.setAttribute("mensaje",objTxtRespuesta.getMensaje());
                    }
                    validar.addContent((Content) factura);
                }
            } else {
                logger.warn("La lista de facturas esta vacia");
            }
            respuesta.addContent((Content) validar);
        }
        docNuevo.addContent((Content) respuesta);
        XMLOutputter xmloutputter = new XMLOutputter(Format.getPrettyFormat());
        return xmloutputter.outputString(docNuevo);
    }
    
}
