/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conection.NewHibernateUtil;
import POJO.Proveedor;
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
public class ProveedoresController implements Initializable {

    @FXML
    private TableView<Proveedor> table1;
    @FXML
    private TableColumn<Integer, Proveedor> idPro;
    @FXML
    private TableColumn<String, Proveedor> rucPro;
    @FXML
    private TableColumn<String, Proveedor> nombrePro;
    @FXML
    private TableColumn<String, Proveedor> direccionPro;
    @FXML
    private TableColumn<String, Proveedor> telefonoEmp;
    @FXML
    private TableColumn<String, Proveedor> emailEmp;
    @FXML
    private ComboBox<?> cmbProveedores;
    @FXML
    private TextField txtBusqueda;
    @FXML
    private Button buscar;
    @FXML
    private Label refrescar;
    @FXML
    private Button proveedorNuevo;
    @FXML
    private Button proveedorEditar;
    @FXML
    private Button deshabilitar;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Proveedor");
        
        ObservableList<Proveedor> obs=FXCollections.observableArrayList(q.list());
        
        idPro.setCellValueFactory(new PropertyValueFactory<>("idPro"));
        rucPro.setCellValueFactory(new PropertyValueFactory<>("rucPro"));
        nombrePro.setCellValueFactory(new PropertyValueFactory<>("nombrePro"));
        direccionPro.setCellValueFactory(new PropertyValueFactory<>("direccionPro"));
        telefonoEmp.setCellValueFactory(new PropertyValueFactory<>("telefonoEmp"));
        emailEmp.setCellValueFactory(new PropertyValueFactory<>("emailEmp"));
        
        table1.setItems(obs);
        
    }    

    @FXML
    private void buscar(ActionEvent event) {
    }

    @FXML
    private void refrescar(MouseEvent event) {
    }

    @FXML
    private void nuevoProveedor(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ProveedoresFormulario.fxml"));

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }

    @FXML
    private void editarProveedor(ActionEvent event) {
    }

    @FXML
    private void deshabilitar(ActionEvent event) {
    }
    
}
