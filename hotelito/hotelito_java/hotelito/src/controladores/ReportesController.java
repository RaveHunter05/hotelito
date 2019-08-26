/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ReportesController implements Initializable {

    @FXML
    private ComboBox<?> cmbBusqueda;
    @FXML
    private DatePicker dpDesde;
    @FXML
    private DatePicker dpHasta;
    @FXML
    private Button btnBuscar;
    @FXML
    private Label lbPDF;
    @FXML
    private TableView<?> tvReportes;

//    btnReservacion
//            btnInsumos 
//            btnIngredientes 
//            btnMuebles 
//            btnServicios btnHabitaciones btnAdministracion btnReportes
    @FXML
    private TextField txtBusqueda;
    @FXML
    private ComboBox<?> cmbReportes;
    @FXML
    private Label refrescar;
                            
            
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnBuscar(ActionEvent event) {
    }

    @FXML
    private void refrescar(MouseEvent event) {
    }
    
}
