/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conexion.NewHibernateUtil;
import POJO.Empleado;
import java.io.IOException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Samuel Barberena
 */
public class OpEmpleado{

    Session s = NewHibernateUtil.getSessionFactory().openSession();
    
    public void Save(Empleado t) throws IOException {
        Transaction tx = s.beginTransaction();
        s.save(t);
        tx.commit();
    }

    public void Update(Empleado t) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Empleado> Find() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Empleado> Show() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
