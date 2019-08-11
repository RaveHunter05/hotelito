/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conection.NewHibernateUtil;
import Operaciones.DAO.IDaoModel;
import POJO.Cliente;
import POJO.Reservacion;
import java.io.IOException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Samuel Barberena
 */
public class OpReservacion implements IDaoModel<Reservacion> {
    
    Session s = NewHibernateUtil.getSessionFactory().openSession();
    
    @Override
    public void Save(Reservacion t) throws IOException {
        Transaction tx = s.beginTransaction();
        s.save(t);
        tx.commit();
    }

    @Override
    public void Update(Reservacion t) throws IOException {
        Transaction tx = s.beginTransaction();
        s.save(t);
        tx.commit();
    }

    @Override
    public List<Reservacion> Find() throws IOException {
        Query q = s.createQuery("from Reservacion");
        
        return q.list();
    }

    @Override
    public List<Reservacion> Show() throws IOException {
        Query q = s.createQuery("from Reservacion");
        
        return q.list();
    }
    
}
