/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.daos.xsaCR;

import com.iqtb.conexion.HibernateUtil;
import com.iqtb.pojos.xsaCR.Xmls;
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
public class XmlsDAO {
    
    private Transaction tx;
    private Session session;
    private static final Logger logger = Logger.getLogger(XmlsDAO.class);
    
    
    
    public Xmls getByIdArchivo(Integer idArchivo) {
        List<Xmls> listaXmls = null;
        try {
            iniciarOperacion();
            String hql = "from Xmls where idArchivo="+idArchivo;
            Query query = session.createQuery(hql);
            listaXmls = query.list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            logger.error("Error al obtener el Xml, ERROR: " + e.getMessage());
        } finally {
            cerrarSession();
        }
        if (listaXmls != null && listaXmls.size()>0) {
            logger.info("Se encontraron: " + listaXmls.size() + " Xmls");
            return listaXmls.get(0);
        } else {
            logger.warn("No hay items en listaXmls");
        }
        return null;
    }
    
    
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
