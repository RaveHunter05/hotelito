/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conexion.NewHibernateUtil;
import POJO.Cliente;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Samuel Barberena
 */
public class OpCliente{

    Session s = NewHibernateUtil.getSessionFactory().openSession();

    public OpCliente() {
    }       
    
    public void Save(Cliente t) throws IOException { 
        Transaction tx = s.beginTransaction();
        s.save(t);
        tx.commit();
        s.close();
    }

    public void Update(Cliente t) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Cliente> Find() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Cliente> Show() throws IOException {
        Criteria c = s.createCriteria(Cliente.class);                
        return c.list();
    }
 
}
