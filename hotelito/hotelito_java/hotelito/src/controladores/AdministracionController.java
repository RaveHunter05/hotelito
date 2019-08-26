/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conection.NewHibernateUtil;
import POJO.Empleado;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
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
public class AdministracionController implements Initializable {

    @FXML
    private ComboBox<?> comboTrabajadores;
    @FXML
    private Button buscar;
    @FXML
    private Label actualizar;
    @FXML
    private Button proveedorNuevo;
    @FXML
    private Button proveedorEditar;
    @FXML
    private Button proveedorDeshabilitar;
    @FXML
    private TableView<Empleado> tabla1;
    @FXML
    private TableColumn<Integer, Empleado> idEmp;
    @FXML
    private TableColumn<String, Empleado> cedulaEm;
    @FXML
    private TableColumn<String, Empleado> prinombreEmp;
    @FXML
    private TableColumn<String, Empleado> segnombreEmp;
    @FXML
    private TableColumn<String, Empleado> priapellidoEmp;
    @FXML
    private TableColumn<String, Empleado> segapellidoEmp;
    @FXML
    private TableColumn<String, Empleado> fotoEmp;
    @FXML
    private TableColumn<Date, Empleado> nacimientoEmp;
    @FXML
    private TableColumn<String, Empleado> telefonoEmp;
    @FXML
    private TableColumn<String, Empleado> emailEmp;
    @FXML
    private TableColumn<String, Empleado> cargoEmp;
    @FXML
    private TableColumn<Float, Empleado> sueldoEmp;
    @FXML
    private TableColumn<String, Empleado> estadoEmp;
    @FXML
    private TextField txtBusqueda;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Empleado");

        ObservableList<Empleado> obs = FXCollections.observableArrayList(q.list());

        idEmp.setCellValueFactory(new PropertyValueFactory<>("idEmp"));
        cedulaEm.setCellValueFactory(new PropertyValueFactory<>("cedulaEm"));
        prinombreEmp.setCellValueFactory(new PropertyValueFactory<>("prinombreEmp"));
        segnombreEmp.setCellValueFactory(new PropertyValueFactory<>("segnombreEmp"));
        priapellidoEmp.setCellValueFactory(new PropertyValueFactory<>("priapellidoEmp"));
        segapellidoEmp.setCellValueFactory(new PropertyValueFactory<>("segapellidoEmp"));
        fotoEmp.setCellValueFactory(new PropertyValueFactory<>("fotoEmp"));
        nacimientoEmp.setCellValueFactory(new PropertyValueFactory<>("nacimientoEmp"));
        telefonoEmp.setCellValueFactory(new PropertyValueFactory<>("telefonoEmp"));
        emailEmp.setCellValueFactory(new PropertyValueFactory<>("emailEmp"));
        cargoEmp.setCellValueFactory(new PropertyValueFactory<>("cargoEmp"));
        sueldoEmp.setCellValueFactory(new PropertyValueFactory<>("sueldoEmp"));
        estadoEmp.setCellValueFactory(new PropertyValueFactory<>("estadoEmp"));

        tabla1.setItems(obs);

    }

    @FXML
    private void Buscar(ActionEvent event) {
    }

    @FXML
    private void refresh(MouseEvent event) {
    }

    @FXML
    private void nuevoProveedor(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("/fxml/AdministracionFormulario.fxml"));

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }

    @FXML
    private void editarProveedor(ActionEvent event) {
    }

    @FXML
    private void deshabilitarProveedor(ActionEvent event) {
    }

}
