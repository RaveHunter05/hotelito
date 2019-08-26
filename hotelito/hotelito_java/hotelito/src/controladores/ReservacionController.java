/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Conection.NewHibernateUtil;
import POJO.Cliente;
import POJO.Reservacion;
import conectores.Reservaciones;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
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
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ReservacionController implements Initializable {

    @FXML
    private TableColumn<Reservacion, Integer> cantidadHabitaciones;
    @FXML
    private TableColumn<Reservacion, Integer> cantidadPersonas;
    @FXML
    private TableView<Reservacion> tabla1;
    @FXML
    private TableColumn<Reservacion, Cliente> idCliente;
    @FXML
    private TableColumn<Reservacion, Date> fechaEntrada;
    @FXML
    private TableColumn<Reservacion, Date> fechaSalida;
    @FXML
    private TableColumn<Reservacion, String> estado;
    @FXML
    private TableColumn<Reservacion, Float> totalReservaciones;
    @FXML
    private TableColumn<Reservacion, Integer> idRes;
    @FXML
    private TextField txtBusqueda;
    @FXML
    private ComboBox<?> cmbReservacion;
    @FXML
    private Button buscar;
    @FXML
    private Label refrescar;
    @FXML
    private Button reservaNueva;
    @FXML
    private Button reservaEditar;
    @FXML
    private Label enviar;
    @FXML
    private Label refrescar2;
    @FXML
    private TableView<?> tabla2;
    @FXML
    private TextField txtSubTotal;
    @FXML
    private TextField txtIVA;
    @FXML
    private TextField txtTotal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

//        try {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        s.beginTransaction();
        Query query = s.createQuery("select d from Reservacion d");
//        List <Cliente> ls=query.list();
//        
//        
//        for(Cliente l :ls){
//            ols.add(l);
//        }
        ObservableList<Reservacion> ols = FXCollections.observableArrayList(query.list());

        idRes.setCellValueFactory(new PropertyValueFactory<>("idRes"));
        idCliente.setCellValueFactory(new PropertyValueFactory<>("idCli"));
        fechaEntrada.setCellValueFactory(new PropertyValueFactory<>("fechaEntrada"));
        fechaSalida.setCellValueFactory(new PropertyValueFactory<>("fechaSalida"));
        estado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        totalReservaciones.setCellValueFactory(new PropertyValueFactory<>("totalRes"));
        cantidadHabitaciones.setCellValueFactory(new PropertyValueFactory<>("cantidadHab"));
        cantidadPersonas.setCellValueFactory(new PropertyValueFactory<>("cantidadPersonas"));
        tabla1.setItems(ols);

//        Iterator it=tabla1.getItems().iterator();
//        
////        s.getTransaction().commit();
////        s.close();
//        
//        cantidadHabitaciones.setCellValueFactory(new PropertyValueFactory<>("cedula_cli"));
//        cantidadPersonas.setCellValueFactory(new PropertyValueFactory<>("prinombre_cli"));
////
////        
//           tabla1.setItems(oblist);
//           List l=query.list();s
//           Iterator itr=l.iterator();
//           while(itr.hasNext()){
//               Object[] ob=(Object[]) itr.next();
//               System.out.println(ob[0] + " - " +ob[1]);
//           }
//             s.getTransaction().commit();
//             s.close();
//             return oblist;
//        } catch (Exception e) {
//        }
//        idRes.setCellValueFactory(new PropertyValueFactory<>("id_res"));
//        idCliente.setCellValueFactory(new PropertyValueFactory<>("id_cli"));
//        fechaEntrada.setCellValueFactory(new PropertyValueFactory<>("fecha_entrada"));
//        cantidadHabitaciones.setCellValueFactory(new PropertyValueFactory<>("cantidad_hab"));
//        cantidadPersonas.setCellValueFactory(new PropertyValueFactory<>("cantidad_personas"));
//        Estado.setCellValueFactory(new PropertyValueFactory<>("estado"));
//        totalReservaciones.setCellValueFactory(new PropertyValueFactory<>("total_res"));
//        fechaSalida.setCellValueFactory(new PropertyValueFactory<>("fecha_salida"));
    }

    @FXML
    private void buscar(ActionEvent event) {
    }

    @FXML
    private void refrescar(MouseEvent event) {
    }

    @FXML
    private void nuevaReserva(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ReservacionFormulario.fxml"));

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }

    @FXML
    private void editarReserva(ActionEvent event) {
    }

    @FXML
    private void enviar(MouseEvent event) {
    }

    @FXML
    private void refrescar2(MouseEvent event) {
    }

}
