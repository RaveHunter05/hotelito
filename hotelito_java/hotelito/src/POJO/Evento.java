package POJO;
// Generated 08-01-2019 03:43:22 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Evento generated by hbm2java
 */
public class Evento  implements java.io.Serializable {


     private Integer idEven;
     private Cliente cliente;
     private Salon salon;
     private Date fechaEven;
     private Integer cantidadPersonas;
     private Date horaInicio;
     private Date horaFin;
     private String estado;
     private Float costoServicios;
     private Float subtotal;
     private Float total;
     private Set pagoEventos = new HashSet(0);
     private Set eventoServicioses = new HashSet(0);

    public Evento() {
    }

	
    public Evento(Cliente cliente, Salon salon, Date fechaEven) {
        this.cliente = cliente;
        this.salon = salon;
        this.fechaEven = fechaEven;
    }
    public Evento(Cliente cliente, Salon salon, Date fechaEven, Integer cantidadPersonas, Date horaInicio, Date horaFin, String estado, Float costoServicios, Float subtotal, Float total, Set pagoEventos, Set eventoServicioses) {
       this.cliente = cliente;
       this.salon = salon;
       this.fechaEven = fechaEven;
       this.cantidadPersonas = cantidadPersonas;
       this.horaInicio = horaInicio;
       this.horaFin = horaFin;
       this.estado = estado;
       this.costoServicios = costoServicios;
       this.subtotal = subtotal;
       this.total = total;
       this.pagoEventos = pagoEventos;
       this.eventoServicioses = eventoServicioses;
    }
   
    public Integer getIdEven() {
        return this.idEven;
    }
    
    public void setIdEven(Integer idEven) {
        this.idEven = idEven;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Salon getSalon() {
        return this.salon;
    }
    
    public void setSalon(Salon salon) {
        this.salon = salon;
    }
    public Date getFechaEven() {
        return this.fechaEven;
    }
    
    public void setFechaEven(Date fechaEven) {
        this.fechaEven = fechaEven;
    }
    public Integer getCantidadPersonas() {
        return this.cantidadPersonas;
    }
    
    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Date getHoraFin() {
        return this.horaFin;
    }
    
    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Float getCostoServicios() {
        return this.costoServicios;
    }
    
    public void setCostoServicios(Float costoServicios) {
        this.costoServicios = costoServicios;
    }
    public Float getSubtotal() {
        return this.subtotal;
    }
    
    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }
    public Float getTotal() {
        return this.total;
    }
    
    public void setTotal(Float total) {
        this.total = total;
    }
    public Set getPagoEventos() {
        return this.pagoEventos;
    }
    
    public void setPagoEventos(Set pagoEventos) {
        this.pagoEventos = pagoEventos;
    }
    public Set getEventoServicioses() {
        return this.eventoServicioses;
    }
    
    public void setEventoServicioses(Set eventoServicioses) {
        this.eventoServicioses = eventoServicioses;
    }




}


