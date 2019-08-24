/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conexion.NewHibernateUtil;
import POJO.Usuario_Login;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Samuel Barberena
 */
public class OpLogin {

    public OpLogin() {
    }    
        
    Session s = NewHibernateUtil.getSessionFactory().openSession();
    
    
    
    public void Login(String user, String pass) {
        Query q = s.createQuery("from Usuario u where u.usernameUser = :user and u.passwordUser = :pass");
        q.setString("user", user);
        q.setString("pass", pass);           
        
        if(q.list().size() == 1){
            try {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                Parent root = FXMLLoader.load(getClass().getResource("/Vista/Habitacion.fxml"));
                
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setMaximized(true);
                stage.initStyle(StageStyle.UNDECORATED);

                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(OpLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto!");
        }            
    }
    
}
