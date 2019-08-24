/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conexion.NewHibernateUtil;
import POJO.Habitacion;
import controladores.HabitacionController;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Samuel Barberena
 */
public class OpHabitacion{

    private static Session s = NewHibernateUtil.getSessionFactory().openSession();
    
    public void Save(Habitacion t) throws IOException {
        Transaction tx = s.beginTransaction();
        s.save(t);
        tx.commit();
    }
    
    public void Update(Habitacion t) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static List<Habitacion> Find() throws IOException {
        Criteria c = s.createCriteria(Habitacion.class).add(Restrictions.eq("estadoHab", "disponible"));       
        return c.list();
    }
    
    public Habitacion FindNumber(String n) throws IOException {
        Habitacion hab = new Habitacion();        
        Query q = s.createQuery("from Habitacion where numeroHab = :room");
        q.setParameter("room", n);
        
        if(q.list().size() == 1){
            hab = (Habitacion) q.list().get(0);
            JOptionPane.showInputDialog(null, " "+hab.getNumeroHab()+" - "+hab.getTipoHab());
        }else{
            JOptionPane.showInputDialog(null, "Sin resultado");
        }
        
        return hab;
    }

    public static List<Habitacion> Show() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    public static TableView<Habitacion> Fill(List<Habitacion> list) throws IOException{
//        JOptionPane.showConfirmDialog(null, "dentro de fill");
//        ObservableList<Habitacion> ol; 
//        TableView<Habitacion> th = new TableView<>();
//        ol = FXCollections.observableList(Find());
//        th.setItems(ol);
//        JOptionPane.showConfirmDialog(null, "agregando col");
//        HabitacionController.col_numero.setCellValueFactory(new PropertyValueFactory<>("numeroHab"));
//        JOptionPane.showConfirmDialog(null, "se agrego col_numero");
//        HabitacionController.col_tipo.setCellValueFactory(new PropertyValueFactory<>("tipoHab"));
//        HabitacionController.col_descripcion.setCellValueFactory(new PropertyValueFactory<>("descripcionHab"));
//        HabitacionController.col_capacidad.setCellValueFactory(new PropertyValueFactory<>("capacidadHab"));
//        HabitacionController.col_precio.setCellValueFactory(new PropertyValueFactory<>("precioHab"));
//        HabitacionController.col_estado.setCellValueFactory(new PropertyValueFactory<>("estadoHab"));
//        
//        return th;
//    }
    
}
