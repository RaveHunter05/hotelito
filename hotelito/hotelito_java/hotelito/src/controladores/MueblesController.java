/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conection.NewHibernateUtil;
import POJO.Habitacion;
import POJO.Mueble;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author user
 */
public class MueblesController implements Initializable {

    @FXML
    private TableColumn<Integer, Mueble> idMue;
    @FXML
    private TableColumn<String, Mueble> nombreMue;
    @FXML
    private TableColumn<String, Mueble> descripcionMue;
    @FXML
    private TableColumn< String , Mueble> precioMue;
    @FXML
    private TableColumn<Habitacion, Mueble> idHab;
    @FXML
    private TableView<Mueble> tabla1;
    @FXML
    private ComboBox<?> cmbMuebles;
    @FXML
    private TextField txtBusqueda;
    @FXML
    private Button buscar;
    @FXML
    private Label refrescar;
    @FXML
    private Button deshabilitar;
    @FXML
    private Button muebleNuevo;
    @FXML
    private Button muebleEditar;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Mueble");
        ObservableList<Mueble> obs=FXCollections.observableArrayList(q.list());
        
        
        idMue.setCellValueFactory(new PropertyValueFactory<>("idMue"));
        nombreMue.setCellValueFactory(new PropertyValueFactory<>("nombreMue"));
        descripcionMue.setCellValueFactory(new PropertyValueFactory<>("descripcionMue"));
        precioMue.setCellValueFactory(new PropertyValueFactory<>("precioMue"));
        idHab.setCellValueFactory(new PropertyValueFactory<>("idHab"));
        
        tabla1.setItems(obs);
    }    

    @FXML
    private void buscar(ActionEvent event) {
    }

    @FXML
    private void refrescar(MouseEvent event) {
    }


    @FXML
    private void deshabilitar(ActionEvent event) {
    }

    @FXML
    private void nuevoMueble(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MueblesFormulario.fxml"));

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }

    @FXML
    private void editarMueble(ActionEvent event) {
    }

    
}
