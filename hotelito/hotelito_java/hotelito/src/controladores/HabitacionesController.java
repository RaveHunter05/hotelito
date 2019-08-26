/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conection.NewHibernateUtil;
import POJO.Habitacion;
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
public class HabitacionesController implements Initializable {

    @FXML
    private TableView<Habitacion> tabla1;
    @FXML
    private TableColumn<Integer, Habitacion> idHab;
    @FXML
    private TableColumn<String, Habitacion> numeroHab;
    @FXML
    private TableColumn<String, Habitacion> tipoHab;
    @FXML
    private TableColumn<String, Habitacion> descripcionHab;
    @FXML
    private TableColumn<Integer, Habitacion> capacidadHab;
    @FXML
    private TableColumn<Float, Habitacion> precioHab;
    @FXML
    private TableColumn<String, Habitacion> estadoHab;
    @FXML
    private TextField txtBusqueda;
    @FXML
    private Button buscar;
    @FXML
    private Label refrescar;
    @FXML
    private Button nuevaHabitacion;
    @FXML
    private Button habitacionesEditar;
    @FXML
    private Button deshabilitar;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Session s =NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Habitacion");
        
        ObservableList<Habitacion> obs=FXCollections.observableArrayList(q.list());
        
        idHab.setCellValueFactory(new PropertyValueFactory<>("idHab"));
        numeroHab.setCellValueFactory(new PropertyValueFactory<>("numeroHab"));
        tipoHab.setCellValueFactory(new PropertyValueFactory<>("tipoHab"));
        descripcionHab.setCellValueFactory(new PropertyValueFactory<>("descripcionHab"));
        capacidadHab.setCellValueFactory(new PropertyValueFactory<>("capacidadHab"));
        precioHab.setCellValueFactory(new PropertyValueFactory<>("precioHab"));
        estadoHab.setCellValueFactory(new PropertyValueFactory<>("estadoHab"));
        
        tabla1.setItems(obs);
    }    

    @FXML
    private void nuevaHabitacion(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/HabitacionesFormulario.fxml"));

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }

    @FXML
    private void buscar(ActionEvent event) {
    }

    @FXML
    private void refresh(MouseEvent event) {
    }

    @FXML
    private void editarHabitaciones(ActionEvent event) {
    }

    @FXML
    private void deshabilitar(ActionEvent event) {
    }

    
}
