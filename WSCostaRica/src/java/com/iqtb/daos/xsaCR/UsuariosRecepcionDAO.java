/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqtb.daos.xsaCR;

import com.iqtb.conexion.HibernateUtil;
import com.iqtb.pojos.xsaCR.UsuariosRecepcion;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Joaquin
 */
public class UsuariosRecepcionDAO {

    private Transaction tx;
    private Session session;
    Logger logger = Logger.getLogger("UsuariosRecepcionDAO");

    public UsuariosRecepcionDAO() {
        
    }

     public UsuariosRecepcion getUsuarioRecepcion(String usuario) {
        List<UsuariosRecepcion> listUsuariosRecepcion = null;
        try {
            iniciarOperacion();
            String hql = "from UsuariosRecepcion as u where usuario='" + usuario + "'";
            Query q = session.createQuery(hql);
            listUsuariosRecepcion = q.list();
            tx.commit();
            if(listUsuariosRecepcion != null && !listUsuariosRecepcion.isEmpty()){
                return listUsuariosRecepcion.get(0);
            }
        } catch (HibernateException e) {
            tx.rollback();
            logger.error("Error al obtener el Usuario Recepcion, ERROR: " + e.getMessage());
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
        return null;
    }
    
    public List<UsuariosRecepcion> getUsuariosByRFC(String rfc) {
        List<UsuariosRecepcion> result = null;
        try {
            iniciarOperacion();
            String hql = "from UsuariosRecepcion as u where u.sucursales.empresas.rfc ='" + rfc + "'";
            Query q = session.createQuery(hql);
            result = q.list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            logger.error("Error al obtener los Usuarios Recepcion, ERROR: " + e.getMessage());
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
        return result;
    }

    public List<UsuariosRecepcion> getUsuariosNomina() {
        List<UsuariosRecepcion> result = null;
        try {
            iniciarOperacion();
            String hql = "from UsuariosRecepcion as u where u.tiposCfd.nombre like 'NOMINA%'";
            Query q = session.createQuery(hql);
            result = q.list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            logger.error("Error al obtener los  Usuarios Recepcion de Archivos, ERROR: " + e.getMessage());
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
        return result;
    }
    
    public List<UsuariosRecepcion> getUsuariosRecepcion() {
        List<UsuariosRecepcion> result = null;
        try {
            iniciarOperacion();
            String hql = "from UsuariosRecepcion as u";
            Query q = session.createQuery(hql);
            result = q.list();
            for (UsuariosRecepcion u : result) {
                 Hibernate.initialize(u.getTiposCfd());
                 Hibernate.initialize(u.getSucursales().getEmpresas());
            }
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            logger.error("Error al obtener  los Usuarios Recepcion, ERROR: " + e.getMessage());
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
        return result;
    }
    
    
    
     public List<UsuariosRecepcion> getUsuariosRecepcionByPass(String usuario) {
        List<UsuariosRecepcion> result = null;
        try {
            iniciarOperacion();
            String hql = "from UsuariosRecepcion as u where usuario='"+usuario+"'";
            Query q = session.createQuery(hql);
            result = q.list();
            for (UsuariosRecepcion u : result) {
                 Hibernate.initialize(u.getTiposCfd());
                 Hibernate.initialize(u.getSucursales().getEmpresas());
            }
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            logger.error("Error al obtener los Usuarios  Recepcion, ERROR: " + e.getMessage());
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
        return result;
    }
  
    
    private void iniciarOperacion() throws HibernateException {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }
}
