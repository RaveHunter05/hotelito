/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conection.NewHibernateUtil;
import POJO.Insumo;
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
import javafx.scene.control.DatePicker;
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
public class IngredientesController implements Initializable {

    @FXML
    private TableView<Insumo> tabla1;
    @FXML
    private TableColumn<Integer, Insumo> idInsumo;
    @FXML
    private TableColumn<String, Insumo> nInsumo;
    @FXML
    private TableColumn<String, Insumo> descripcion;
    @FXML
    private TableColumn<Integer, Insumo> cantidad;
    @FXML
    private TableColumn<Date, Insumo> fechaPedido;
    @FXML
    private TableColumn<Date, Insumo> fechaAPedir;
    @FXML
    private TableColumn<Date, Insumo> cantidadPedir;
    @FXML
    private ComboBox<?> cmbIngredientes;
    @FXML
    private TextField txtBusqueda;
    @FXML
    private Button Buscar;
    @FXML
    private Button proveedorAgregar;
    @FXML
    private Button proveedorEditar;
    @FXML
    private Button deshabilitar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();

        Query q = s.createQuery("from Insumo");

        ObservableList<Insumo> obs = FXCollections.observableArrayList(q.list());

        idInsumo.setCellValueFactory(new PropertyValueFactory<>("idInsumo"));
        nInsumo.setCellValueFactory(new PropertyValueFactory<>("nombreInsumo"));
        descripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        cantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        fechaPedido.setCellValueFactory(new PropertyValueFactory<>("fechaPedido"));
        fechaAPedir.setCellValueFactory(new PropertyValueFactory<>("fechaAPedir"));
        cantidadPedir.setCellValueFactory(new PropertyValueFactory<>("cantidadAPedir"));
        
        tabla1.setItems(obs);
    }

    @FXML
    private void Buscar(ActionEvent event) {
    }

    @FXML
    private void refrescar(MouseEvent event) {
    }

    @FXML
    private void agregarProveedor(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/IngredientesFormulario.fxml"));

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
