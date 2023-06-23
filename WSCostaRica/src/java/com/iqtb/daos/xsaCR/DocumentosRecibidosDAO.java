/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.daos.xsaCR;

import com.iqtb.conexion.HibernateUtil;
import com.iqtb.pojos.xsaCR.DocumentosRecibidos;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author macminidesarrollo
 */
public class DocumentosRecibidosDAO {
    
    private Transaction tx;
    private Session session;
    private static final Logger logger = Logger.getLogger(DocumentosRecibidosDAO.class);
    
    
    
    public DocumentosRecibidos getByIdArchivo(Integer idArchivo) {
        List<DocumentosRecibidos> listDocumentosRecibidos = null;
        try {
            iniciarOperacion();
            String hql = "select dr from DocumentosRecibidos as dr where estado!='NUEVO' and idArchivo="+idArchivo;
            Query query = session.createQuery(hql);
            listDocumentosRecibidos = query.list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            logger.error("Error al obtener el DR, ERROR: " + e.getMessage());
        } finally {
            cerrarSession();
        }
        if (listDocumentosRecibidos != null && listDocumentosRecibidos.size()>0) {
            logger.info("Se encontraron: " + listDocumentosRecibidos.size() + " DocumentosRecibidos");
            return listDocumentosRecibidos.get(0);
        } else {
            logger.warn("No hay items en listDocumentosRecibidos");
        }
        return null;
    }
    
    
    public Integer SaveOrUpdate(DocumentosRecibidos documentoRecibido){
        
        //logger.info("Guardando Token");
        try {
            iniciarOperacion();
            session.saveOrUpdate(documentoRecibido);
            session.flush();
            session.refresh(documentoRecibido);
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            logger.error("Error al guardar documentoRecibido, ERROR: " + e.getMessage());
        } finally {
            cerrarSession();
        }
        if (documentoRecibido.getIdArchivo()!= null) {
            //logger.info("Se recupero el idToken: "+token.getIdToken());
            return documentoRecibido.getIdArchivo();
        } else {
            return null;
        }

    }//FIN GUARDAR TOKEN
    
    private void iniciarOperacion() {
        //logger.info("iniciandoOperacion TokenDAO");
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        //logger.info("Comenzando transaction TokenDAO");
    }

    private void cerrarSession() {
        if (session.isOpen()) {
            session.close();
        }
    }
}
