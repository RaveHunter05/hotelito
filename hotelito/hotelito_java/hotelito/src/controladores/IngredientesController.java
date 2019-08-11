/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author user
 */
public class IngredientesController implements Initializable {

    @FXML
    private Button btnEditar;
    @FXML
    private ComboBox<?> cmbBusqueda;
    @FXML
    private TextField txtBusqueda;
    @FXML
    private Button btnBusqueda;
    @FXML
    private TableView<?> tbView;
    @FXML
    private ComboBox<?> cmbIngrediente;
    @FXML
    private ComboBox<?> cmbProveedor;
    @FXML
    private TextField txtCantidadIngredientes;
    @FXML
    private TextField txtReorden;
    @FXML
    private TextField txtPrecioUnitario;
    @FXML
    private Button btnEliminar;
    @FXML
    private TextField txtTipo;
    @FXML
    private Button btnAgregarIngrediente;
    @FXML
    private DatePicker fechaVencimiento;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
