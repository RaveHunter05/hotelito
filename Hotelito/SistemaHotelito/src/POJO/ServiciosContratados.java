package POJO;
// Generated 07-30-2019 10:53:13 PM by Hibernate Tools 4.3.1



/**
 * ServiciosContratados generated by hbm2java
 */
public class ServiciosContratados  implements java.io.Serializable {


     private ServiciosContratadosId id;
     private Factura factura;
     private Habitacion habitacion;
     private Servicio servicio;
     private Integer cantidad;
     private Float subtotal;

    public ServiciosContratados() {
    }

	
    public ServiciosContratados(ServiciosContratadosId id, Factura factura, Habitacion habitacion, Servicio servicio) {
        this.id = id;
        this.factura = factura;
        this.habitacion = habitacion;
        this.servicio = servicio;
    }
    public ServiciosContratados(ServiciosContratadosId id, Factura factura, Habitacion habitacion, Servicio servicio, Integer cantidad, Float subtotal) {
       this.id = id;
       this.factura = factura;
       this.habitacion = habitacion;
       this.servicio = servicio;
       this.cantidad = cantidad;
       this.subtotal = subtotal;
    }
   
    public ServiciosContratadosId getId() {
        return this.id;
    }
    
    public void setId(ServiciosContratadosId id) {
        this.id = id;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public Habitacion getHabitacion() {
        return this.habitacion;
    }
    
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public Servicio getServicio() {
        return this.servicio;
    }
    
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Float getSubtotal() {
        return this.subtotal;
    }
    
    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }




}

