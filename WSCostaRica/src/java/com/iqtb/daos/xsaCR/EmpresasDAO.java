/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.daos.xsaCR;

import com.iqtb.conexion.HibernateUtil;
import com.iqtb.pojos.xsaCR.Empresas;
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
public class EmpresasDAO {
    private Transaction tx;
    private Session session;
    private static Logger logger = Logger.getLogger(EmpresasDAO.class);
    
    public List<Empresas> getTodos() {
        List<Empresas> listEmpresas = null;
        try {
            //logger.info("apunto de inicar operacion");
            iniciarOperacion();
            //logger.info("Operacion Iniciada ");
            Query query = session.createQuery("from Empresas");
            listEmpresas = query.list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            logger.error("Error al obtener las Empresas, ERROR: " + e.getMessage());
        } finally {
            cerrarSession();
        }
        if (listEmpresas != null && listEmpresas.size()>0) {
            //logger.info("Se encontraron: " + listToken.size() + " Token");
        } else {
            listEmpresas = null;
            logger.warn("No existen empresas");
        }
        return listEmpresas;
    }

    public Integer verificarEmpresa(String idNumero) {
        logger.info("Verificando idEmpresa para el idNumero: " + idNumero);
        List<Integer> listaIds = null;
        try {
            //logger.info("apunto de inicar operacion");
            iniciarOperacion();
            //logger.info("Operacion Iniciada ");
            String hql = "SELECT idEmpresa FROM Empresas where idNumero=:idNumero";
            Query q = session.createQuery(hql);
            q.setParameter("idNumero", idNumero);
            //logger.info("apunto de hacer q.list");
            listaIds = q.list();
            //logger.info("q.list Iniciada ");
            //logger.info("apunto de hacer this.tx.commit()");
            this.tx.commit();
            //logger.info("this.tx.commit() iniciado");
            if (listaIds != null && listaIds.size() > 0) {
                //logger.info(listaIds.get(0));
                return listaIds.get(0);
                
            } else {
                logger.info("No se obtuvo ningun idEmpresa para el idNumero: " + idNumero);
            }
        } catch (HibernateException e) {
            logger.error("No es posible verificar la empresa por idNumero: " + idNumero + " Error" + e);
            this.tx.rollback();
        } finally {
            cerrarSession();
        }
        return null;
    }
  
    
    private void iniciarOperacion() {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }

    private void cerrarSession() {
        if (session.isOpen()) {
            session.close();
        }
    }
    
}
