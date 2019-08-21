package POJO;
// Generated 08-21-2019 04:10:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Salon generated by hbm2java
 */
public class Salon  implements java.io.Serializable {


     private Integer idSalon;
     private String nombreSalon;
     private Float costo;
     private Integer capacidad;
     private String descripcionSalon;
     private String estadoSalon;
     private Set eventos = new HashSet(0);

    public Salon() {
    }

    public Salon(String nombreSalon, Float costo, Integer capacidad, String descripcionSalon, String estadoSalon, Set eventos) {
       this.nombreSalon = nombreSalon;
       this.costo = costo;
       this.capacidad = capacidad;
       this.descripcionSalon = descripcionSalon;
       this.estadoSalon = estadoSalon;
       this.eventos = eventos;
    }
   
    public Integer getIdSalon() {
        return this.idSalon;
    }
    
    public void setIdSalon(Integer idSalon) {
        this.idSalon = idSalon;
    }
    public String getNombreSalon() {
        return this.nombreSalon;
    }
    
    public void setNombreSalon(String nombreSalon) {
        this.nombreSalon = nombreSalon;
    }
    public Float getCosto() {
        return this.costo;
    }
    
    public void setCosto(Float costo) {
        this.costo = costo;
    }
    public Integer getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public String getDescripcionSalon() {
        return this.descripcionSalon;
    }
    
    public void setDescripcionSalon(String descripcionSalon) {
        this.descripcionSalon = descripcionSalon;
    }
    public String getEstadoSalon() {
        return this.estadoSalon;
    }
    
    public void setEstadoSalon(String estadoSalon) {
        this.estadoSalon = estadoSalon;
    }
    public Set getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set eventos) {
        this.eventos = eventos;
    }




}


