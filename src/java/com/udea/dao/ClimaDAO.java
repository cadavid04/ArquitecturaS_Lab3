/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.persistencia.Clima;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author itManager
 */
public class ClimaDAO {
     public void ingresarClima(Clima p) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;

        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(p);
            tx.commit();
            session.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException("No se pudo guardar el clima");
        }
    }
    
    public String consultarClima(int codigo){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Clima p = (Clima) session.get(Clima.class, codigo);
        session.close();
        if(p != null){
            return "la información para este clima es " + 
                    p.getDia() + " "+ 
                    p.getHumedad() + " "+ 
                    p.getId() + " "+ 
                    p.getProbabilidadprecipitacion() + " "+ 
                    p.getTemperatura() + " "+ 
                    p.getTipoNubosidad();
        }else{
            return "Clima no existe";
        }
    }
    
    public List<Clima> verClimas(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Clima");
        List<Clima> lista = query.list();
        return lista;
    }

}
