/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conection.NewHibernateUtil;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author user
 */
public class LoginController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private TextField email;
    @FXML
    private TextField password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void entrar(ActionEvent event) throws IOException {
//        Insertar
//        Empleado empleado=new Empleado();
//        empleado.setCedulaEm("123132145");
//        empleado.setPrinombreEmp("Pedro alv");
//        empleado.setPriapellidoEmp("sadf");
//        empleado.setFotoEmp("askdlfjañlskdj");
//        empleado.setNacimientoEmp(Date.from(Instant.now()));
//        empleado.setTelefonoEmp("25421380");
//        empleado.setEmailEmp("el_morromeco@yahoo.es");
//        empleado.setCargoEmp("zepol");

        ingresar();

//        como insertar
//        s.beginTransaction();
//        s.save(empleado);
//        
//        s.getTransaction().commit();
//        Como hacer select
//        Query q=s.createQuery("select idEmp, prinombreEmp, priapellidoEmp from Empleado");
//        List list=q.list();
//        
//        Iterator iterator=list.iterator();
//        
//        while(iterator.hasNext()){
//            Object[] obj=(Object[]) iterator.next();
//            System.out.println(" - " + obj[0] + " - " + obj[1] + " - " + obj[2]);
//        }
    }

    public void ingresar() throws IOException {
//        JOptionPane.showMessageDialog(null, "antes de session");
//        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        JOptionPane.showMessageDialog(null, "despues de session y antes del query");
//        Query q = s.createQuery("from Usuario where usernameUser='" + email.getText()
//                + "' and passwordUser='" + password.getText() + "'");
//        JOptionPane.showMessageDialog(null, "despues del query");
//
//        List l = q.list();
//        if (l.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Lista vacia");
//        } else {
            JOptionPane.showMessageDialog(null, "Usted ingresa buen hombre");
            try {

                Parent root = FXMLLoader.load(getClass().getResource("/fxml/Principal.fxml"));

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setMaximized(true);
                stage.initStyle(StageStyle.UNDECORATED);

                stage.show();

                Stage stage1 = (Stage) button.getScene().getWindow();
                stage1.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error produccion produccion");
            }
//        }
//        Iterator it = l.iterator();
//        s.close();
    }

    @FXML
    private void keypress(KeyEvent event) throws IOException {
        if (event.getCode() == KeyCode.ENTER) {
            ingresar();
        }
    }

    @FXML
    private void keypress2(KeyEvent event) throws IOException {
        if (event.getCode() == KeyCode.ENTER) {
            ingresar();
        }
    }

}
