/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Operaciones.OpHabitacion;
import POJO.Habitacion;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Samuel Barberena
 */
public class HabitacionController implements Initializable {
    
    //listas
    private ObservableList<Habitacion> list_room;
    
    
    @FXML
    private TableView<Habitacion> tbl_hab;
    
    //columnas
    @FXML
    public TableColumn<Habitacion, String> col_numero;
    @FXML
    public TableColumn<Habitacion, String> col_tipo;
    @FXML
    public TableColumn<Habitacion, String> col_descripcion;
    @FXML
    public TableColumn<Habitacion, String> col_capacidad;
    @FXML
    public TableColumn<Habitacion, String> col_precio;
    @FXML
    public TableColumn<Habitacion, String> col_estado;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
        list_room = FXCollections.observableList(OpHabitacion.Find());
        tbl_hab.setItems(list_room);

        col_numero.setCellValueFactory(new PropertyValueFactory<>("numeroHab"));
        col_tipo.setCellValueFactory(new PropertyValueFactory<>("tipoHab"));
        col_descripcion.setCellValueFactory(new PropertyValueFactory<>("descripcionHab"));
        col_capacidad.setCellValueFactory(new PropertyValueFactory<>("capacidadHab"));
        col_precio.setCellValueFactory(new PropertyValueFactory<>("precioHab"));
        col_estado.setCellValueFactory(new PropertyValueFactory<>("estadoHab"));
        
        } catch (IOException ex) {
            Logger.getLogger(HabitacionController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    
}
