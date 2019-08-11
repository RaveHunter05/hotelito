package POJO;
// Generated 08-01-2019 03:43:22 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PagoReservacion generated by hbm2java
 */
public class PagoReservacion  implements java.io.Serializable {


     private Integer idPago;
     private Reservacion reservacion;
     private Date fecha;
     private String formaPago;

    public PagoReservacion() {
    }

	
    public PagoReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }
    public PagoReservacion(Reservacion reservacion, Date fecha, String formaPago) {
       this.reservacion = reservacion;
       this.fecha = fecha;
       this.formaPago = formaPago;
    }
   
    public Integer getIdPago() {
        return this.idPago;
    }
    
    public void setIdPago(Integer idPago) {
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

