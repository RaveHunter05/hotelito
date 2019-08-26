/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectores;

/**
 *
 * @author user
 */
public class Reservaciones {
    Integer cantidad_habitaciones, cantidad_personas;

    public Integer getCantidad_habitaciones() {
        return cantidad_habitaciones;
    }

    public void setCantidad_habitaciones(Integer cantidad_habitaciones) {
        this.cantidad_habitaciones = cantidad_habitaciones;
    }

    public Integer getCantidad_personas() {
        return cantidad_personas;
    }

    public void setCantidad_personas(Integer cantidad_personas) {
        this.cantidad_personas = cantidad_personas;
    }

    public Reservaciones(Integer cantidad_habitaciones, Integer cantidad_personas) {
        this.cantidad_habitaciones = cantidad_habitaciones;
        this.cantidad_personas = cantidad_personas;
    }

 
}
