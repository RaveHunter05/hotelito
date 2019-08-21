package POJO;
// Generated 08-21-2019 04:10:44 PM by Hibernate Tools 4.3.1



/**
 * ReservacionHabitaciones generated by hbm2java
 */
public class ReservacionHabitaciones  implements java.io.Serializable {


     private ReservacionHabitacionesId id;
     private Habitacion habitacion;
     private Reservacion reservacion;
     private Float subtotal;

    public ReservacionHabitaciones() {
    }

	
    public ReservacionHabitaciones(ReservacionHabitacionesId id, Habitacion habitacion, Reservacion reservacion) {
        this.id = id;
        this.habitacion = habitacion;
        this.reservacion = reservacion;
    }
    public ReservacionHabitaciones(ReservacionHabitacionesId id, Habitacion habitacion, Reservacion reservacion, Float subtotal) {
       this.id = id;
       this.habitacion = habitacion;
       this.reservacion = reservacion;
       this.subtotal = subtotal;
    }
   
    public ReservacionHabitacionesId getId() {
        return this.id;
    }
    
    public void setId(ReservacionHabitacionesId id) {
        this.id = id;
    }
    public Habitacion getHabitacion() {
        return this.habitacion;
    }
    
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public Reservacion getReservacion() {
        return this.reservacion;
    }
    
    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }
    public Float getSubtotal() {
        return this.subtotal;
    }
    
    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }




}


