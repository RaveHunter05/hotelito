/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcons;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class PrincipalController implements Initializable {
//    dpDesde
//    dpHasta
//    cmbBusqueda
//    btnBuscar
//    lbPDF
    // tvReportes
    
    
    
    @FXML
    private ImageView fotoPerfil;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Label cono;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Label cono1;
    @FXML
    private Label cono2;
    @FXML
    private Label cono3;
    @FXML
    private Label cono4;
    @FXML
    private Label cono5;
    @FXML
    private Label cono6;
    @FXML
    private Label cono7;
    @FXML
    private Label cono8;
    @FXML
    private AnchorPane panelDerecha;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        Image image=new Image("/fotos/perrito.jpg");
//         fotoPerfil.setImage(image);      
//         GlyphsDude.createIcon(FontAwesomeIcons.PENCIL, "40px");
      cono.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.PLUS_SQUARE,"25"));
            cono1.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.CLOCK_ALT,"25"));
      cono2.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.BUILDING,"25"));
      cono3.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.BINOCULARS,"25"));
      cono4.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.LAPTOP,"25"));
      cono5.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.BED,"25"));
      cono6.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.BUS,"25"));
      cono7.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.BOOK,"25"));

      
    }    

    @FXML
    private void BUTON1(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("/fxml/Reservacion.fxml"));
        panelDerecha.getChildren().setAll(pane);
    }
    
//    btnEditar
//    cmbBusqueda
//    txtBusqueda
//    btnBusqueda
//    txtView
//    cmbReporte
//    cmbRegistro
//    txtReporteNum
//    txtReportePrecio
//    txtPrecioNum
//    txtPrecioPrecio
//    btnReportar
//    btnRegistrar
//    btnAgregar
//    btnEditar
//    btnDeshabilitar
    @FXML
    private void salir(ActionEvent event) {
//        Stage stage=(Stage) cono1.getScene().getWindow();
//        stage.close();
            Stage stage=(Stage) cono1.getScene().getWindow();
            stage.close();
            System.exit(0);
    }

    @FXML
    private void INSUMOS(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("/fxml/Proveedores.fxml"));
        panelDerecha.getChildren().setAll(pane);
    }

    @FXML
    private void INGREDIENTES(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("/fxml/Ingredientes.fxml"));
        panelDerecha.getChildren().setAll(pane);
    }

    @FXML
    private void MUEBLES(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("/fxml/Reservacion.fxml"));
        panelDerecha.getChildren().setAll(pane);
    }

    @FXML
    private void SERVICIOS(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("/fxml/Servicios.fxml"));
        panelDerecha.getChildren().setAll(pane);
    }

    @FXML
    private void HABITACIONES(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("/fxml/Habitaciones.fxml"));
        panelDerecha.getChildren().setAll(pane);
    }

    @FXML
    private void ADMINISTRACION(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("/fxml/Administracion.fxml"));
        panelDerecha.getChildren().setAll(pane);
    }

    @FXML
    private void REPORTES(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("/fxml/Reportes.fxml"));
        panelDerecha.getChildren().setAll(pane);
    }

    


    
    
    
}
