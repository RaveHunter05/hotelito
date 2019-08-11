/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conection.NewHibernateUtil;
import Operaciones.DAO.IDaoModel;
import POJO.Cliente;
import java.io.IOException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Samuel Barberena
 */
public class OpClientes implements IDaoModel<Cliente> {
    
    Session s = NewHibernateUtil.getSessionFactory().openSession();        

    @Override
    public void Save(Cliente t) throws IOException {
        Transaction tx = s.beginTransaction();
        s.save(t);
        tx.commit();
    }

    @Override
    public void Update(Cliente t) throws IOException {
        Transaction tx = s.beginTransaction();
        s.update(t);
        tx.commit();
    }

    @Override
    public List<Cliente> Find() throws IOException {
        Query q = s.createQuery("from Cliente");
        
        return q.list();
    }

    @Override
    public List<Cliente> Show() throws IOException {
        Query q = s.createQuery("from Cliente");
        
        return q.list();
    }

    
}
