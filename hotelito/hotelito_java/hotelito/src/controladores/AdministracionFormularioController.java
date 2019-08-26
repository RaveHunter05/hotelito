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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AdministracionFormularioController implements Initializable {

    @FXML
    private TextField txtPrimerNombre;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtTitulo;
    @FXML
    private TextField txtCumpleanos;
    @FXML
    private TextField txtCargo;
    @FXML
    private TextField txtCedula;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtSueldo;
    @FXML
    private Button btnReserva;
    @FXML
    private Button btnSalir;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void Salir(ActionEvent event) {
    }

    @FXML
    private void Reserva(ActionEvent event) {
    }

    
}
