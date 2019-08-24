/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conexion.NewHibernateUtil;
import POJO.Reservacion;
import java.io.IOException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Samuel Barberena
 */
public class OpReservacion{

    Session s = NewHibernateUtil.getSessionFactory().openSession();
    
    public void Save(Reservacion t) throws IOException {
        Transaction tx = s.beginTransaction();
        s.save(t);
        tx.commit();
    }

    public void Update(Reservacion t) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Reservacion> Find() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Reservacion> Show() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
