/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conection.NewHibernateUtil;
import Operaciones.DAO.IDaoModel;
import POJO.Empleado;
import java.io.IOException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Samuel Barberena
 */
public class OpEmpleado implements IDaoModel<Empleado>{
    
    Session s = NewHibernateUtil.getSessionFactory().openSession();

    @Override
    public void Save(Empleado t) throws IOException {
        Transaction tx = s.beginTransaction();
        s.save(t);
        tx.commit();
    }

    @Override
    public void Update(Empleado t) throws IOException {
        Transaction tx = s.beginTransaction();
        s.update(t);
        tx.commit();
    }

    @Override
    public List<Empleado> Find() throws IOException {
        Query q = s.createQuery("from Cliente");
        
        return q.list();
    }

    @Override
    public List<Empleado> Show() throws IOException {
        Query q = s.createQuery("from Cliente");
        
        return q.list();
    }
    
}
