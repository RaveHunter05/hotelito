package POJO;
// Generated 08-07-2019 11:38:14 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PagoReservacion generated by hbm2java
 */
public class PagoReservacion  implements java.io.Serializable {


     private int idPago;
     private Reservacion reservacion;
     private Date fecha;
     private String formaPago;

    public PagoReservacion() {
    }

	
    public PagoReservacion(int idPago, Reservacion reservacion) {
        this.idPago = idPago;
        this.reservacion = reservacion;
    }
    public PagoReservacion(int idPago, Reservacion reservacion, Date fecha, String formaPago) {
       this.idPago = idPago;
       this.reservacion = reservacion;
       this.fecha = fecha;
       this.formaPago = formaPago;
    }
   
    public int getIdPago() {
        return this.idPago;
    }
    
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }
    public Reservacion getReservacion() {
        return this.reservacion;
    }
    
    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getFormaPago() {
        return this.formaPago;
    }
    
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }




}


