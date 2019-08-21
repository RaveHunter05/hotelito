package POJO;
// Generated 08-21-2019 04:10:44 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PagoEvento generated by hbm2java
 */
public class PagoEvento  implements java.io.Serializable {


     private Integer idPago;
     private Evento evento;
     private Date fecha;
     private String formaPago;

    public PagoEvento() {
    }

	
    public PagoEvento(Evento evento) {
        this.evento = evento;
    }
    public PagoEvento(Evento evento, Date fecha, String formaPago) {
       this.evento = evento;
       this.fecha = fecha;
       this.formaPago = formaPago;
    }
   
    public Integer getIdPago() {
        return this.idPago;
    }
    
    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }
    public Evento getEvento() {
        return this.evento;
    }
    
    public void setEvento(Evento evento) {
        this.evento = evento;
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


