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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AdministracionController implements Initializable {

    @FXML
    private Button btnEditar;
    @FXML
    private ComboBox<?> cmbBusqueda;
    @FXML
    private TextField txtBusqueda;
    @FXML
    private Button btnBusqueda;
    @FXML
    private TableView<?> txtView;
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnEditar(ActionEvent event) {
    }

    @FXML
    private void btnBusqueda(ActionEvent event) {
    }
    
}
