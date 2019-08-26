/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conection.NewHibernateUtil;
import POJO.Servicio;
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
public class ServiciosController implements Initializable {

    @FXML
    private TableView<Servicio> tabla1;
    @FXML
    private TableColumn<Integer, Servicio> idSer;
    @FXML
    private TableColumn<String, Servicio> nombreSer;
    @FXML
    private TableColumn<String, Servicio> tipoSer;
    @FXML
    private TableColumn<String, Servicio> descripcionSer;
    @FXML
    private TableColumn<Float, Servicio> precioSer;
    @FXML
    private TableColumn<String, Servicio> estadoSer;
    @FXML
    private TextField txtBusqueda;
    @FXML
    private ComboBox<?> cmServicio;
    @FXML
    private Button buscar;
    @FXML
    private Label refrescar;
    @FXML
    private Button servicioEditar;
    @FXML
    private Label enviar;
    @FXML
    private Label refrescar2;
    @FXML
    private TableView<?> tabla2;
    @FXML
    private Button servicioNuevo;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Servicio");
        
        ObservableList<Servicio> obs=FXCollections.observableArrayList(q.list());
        
        idSer.setCellValueFactory(new PropertyValueFactory<>("idSer"));
        nombreSer.setCellValueFactory(new PropertyValueFactory<>("nombreSer"));
        tipoSer.setCellValueFactory(new PropertyValueFactory<>("tipoSer"));
        descripcionSer.setCellValueFactory(new PropertyValueFactory<>("descripcionSer"));
        precioSer.setCellValueFactory(new PropertyValueFactory<>("precioSer"));
        estadoSer.setCellValueFactory(new  PropertyValueFactory<>("estadoSer"));
        
        tabla1.setItems(obs);
    
    }    

    @FXML
    private void buscar(ActionEvent event) {
    }

    @FXML
    private void refrescar(MouseEvent event) {
    }

    @FXML
    private void editarServicio(ActionEvent event) {
    }

    @FXML
    private void enviar(MouseEvent event) {
    }

    @FXML
    private void refrescar2(MouseEvent event) {
    }

    @FXML
    private void nuevoServicio(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ServiciosFormulario.fxml"));

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }

    
}
