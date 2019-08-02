package POJO;
// Generated 08-01-2019 03:43:22 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Reservacion generated by hbm2java
 */
public class Reservacion  implements java.io.Serializable {


     private Integer idRes;
     private Cliente cliente;
     private Date fechaEntrada;
     private Date fechaSalida;
     private Integer cantidadHab;
     private Integer cantidadPersonas;
     private String estado;
     private Float totalRes;
     private Set pagoReservacions = new HashSet(0);
     private Set clientes = new HashSet(0);
     private Set reservacionHabitacioneses = new HashSet(0);

    public Reservacion() {
    }

	
    public Reservacion(Cliente cliente, Date fechaEntrada, Date fechaSalida) {
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    public Reservacion(Cliente cliente, Date fechaEntrada, Date fechaSalida, Integer cantidadHab, Integer cantidadPersonas, String estado, Float totalRes, Set pagoReservacions, Set clientes, Set reservacionHabitacioneses) {
       this.cliente = cliente;
       this.fechaEntrada = fechaEntrada;
       this.fechaSalida = fechaSalida;
       this.cantidadHab = cantidadHab;
       this.cantidadPersonas = cantidadPersonas;
       this.estado = estado;
       this.totalRes = totalRes;
       this.pagoReservacions = pagoReservacions;
       this.clientes = clientes;
       this.reservacionHabitacioneses = reservacionHabitacioneses;
    }
   
    public Integer getIdRes() {
        return this.idRes;
    }
    
    public void setIdRes(Integer idRes) {
        this.idRes = idRes;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getFechaEntrada() {
        return this.fechaEntrada;
    }
    
    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public Date getFechaSalida() {
        return this.fechaSalida;
    }
    
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public Integer getCantidadHab() {
        return this.cantidadHab;
    }
    
    public void setCantidadHab(Integer cantidadHab) {
        this.cantidadHab = cantidadHab;
    }
    public Integer getCantidadPersonas() {
        return this.cantidadPersonas;
    }
    
    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Float getTotalRes() {
        return this.totalRes;
    }
    
    public void setTotalRes(Float totalRes) {
        this.totalRes = totalRes;
    }
    public Set getPagoReservacions() {
        return this.pagoReservacions;
    }
    
    public void setPagoReservacions(Set pagoReservacions) {
        this.pagoReservacions = pagoReservacions;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }
    public Set getReservacionHabitacioneses() {
        return this.reservacionHabitacioneses;
    }
    
    public void setReservacionHabitacioneses(Set reservacionHabitacioneses) {
        this.reservacionHabitacioneses = reservacionHabitacioneses;
    }




}


