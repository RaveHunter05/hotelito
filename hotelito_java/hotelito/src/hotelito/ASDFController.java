/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelito;

import Conection.NewHibernateUtil;
import POJO.Habitacion;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ASDFController implements Initializable {

    @FXML
    private Button boton;
    @FXML
    private TextField texto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
//    SessionFactory factor;
//    factor  = NewHibernateUtil.getSessionFactory();
//    Session s;
//    s  = factor.openSession();
//
//    Criteria c;
//
//    c  = s.createCriteria(Habitacion.class);
//
//    for (Object habitacion
//
//    : c.list () 
//        ) {
//            Habitacion hc = (Habitacion) habitacion;
//        System.out.println(" - " + hc.getDescripcionHab() + " - " + hc.getIdHab());
//
//    }

    @FXML
    private void agregarTexto(ActionEvent event) {
//        SessionFactory factor=NewHibernateUtil.getSessionFactory();
//        Session s=factor.getCurrentSession();
//        Criteria c=(Criteria) s.createCriteria(Habitacion.class);
//        
//        for(Object habitacion : c.list()){
//            Habitacion hc= (Habitacion) habitacion;
//            System.out.println(" - " + hc.getDescripcionHab());
//        }

//    SessionFactory factor;
//    factor  = NewHibernateUtil.getSessionFactory();
//    Session s;
//    s  = factor.openSession();
//
//    Criteria c;

//    c  = s.createCriteria(Habitacion.class);
    SessionFactory factor= NewHibernateUtil.getSessionFactory();
    Session s=factor.openSession();
    
//    Query q=s.createSQLQuery("select * from habitacion");
//    
//    List l = q.list();
//    Iterator i=l.iterator();
//    
//    while(i.hasNext()){
//        Object[] ob=(Object[]) i.next();
//        System.out.println(" - " + ob[0] +" - "+ ob[1]+" - "+ ob[2]+" - "+ ob[3]+" - "+ ob[4]+" - "+ ob[5]);
//    }

Query q=s.createQuery("from Habitacion");

Iterator i=q.iterate();

while(i.hasNext()){
    Habitacion hbc=(Habitacion)i.next();
    System.out.println(hbc.getIdHab() + " - " + hbc.getDescripcionHab()+ " - "+ hbc.getNumeroHab());
}

    
   
    System.exit(0);
//    Criteria c=(Criteria) s.createCriteria(Habitacion.class);
//        
//        for(Object habitacion : c.list()){
//            Habitacion hc= (Habitacion) habitacion;
//            System.out.println(" - " + hc.getDescripcionHab());
//        }
        
        
        
        
    }
    
}
