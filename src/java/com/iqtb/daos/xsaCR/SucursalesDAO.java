/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.daos.xsaCR;

import com.iqtb.conexion.HibernateUtil;
import com.iqtb.pojos.xsaCR.Sucursales;
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
public class SucursalesDAO {
    
    private Transaction tx;
    private Session session;
    private static final Logger logger = Logger.getLogger(SucursalesDAO.class);
    
    
    public Sucursales getByIdEmpresa(Integer idEmpresa) {
        List<Sucursales> listSucursales = null;
        try {
            iniciarOperacion();
            String hql = "select s from Sucursales as s where s.empresas.idEmpresa="+idEmpresa;
            Query query = session.createQuery(hql);
            listSucursales = query.list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            logger.error("Error al obtener la Sucursal, ERROR: " + e.getMessage());
        } finally {
            cerrarSession();
        }
        if (listSucursales != null && listSucursales.size()>0) {
            logger.info("Se encontraron: " + listSucursales.size() + " Sucursales");
            return listSucursales.get(0);
        } else {
            logger.warn("No hay items en  listSucursales");
            return null;
        }
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
