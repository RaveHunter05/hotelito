package POJO;
// Generated 08-07-2019 11:38:14 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Servicio generated by hbm2java
 */
public class Servicio  implements java.io.Serializable {


     private int idSer;
     private String nombreSer;
     private String tipoSer;
     private String descripcionSer;
     private Float precioSer;
     private String estadoSer;
     private Set serviciosContratadoses = new HashSet(0);
     private Set eventoServicioses = new HashSet(0);

    public Servicio() {
    }

	
    public Servicio(int idSer, String nombreSer) {
        this.idSer = idSer;
        this.nombreSer = nombreSer;
    }
    public Servicio(int idSer, String nombreSer, String tipoSer, String descripcionSer, Float precioSer, String estadoSer, Set serviciosContratadoses, Set eventoServicioses) {
       this.idSer = idSer;
       this.nombreSer = nombreSer;
       this.tipoSer = tipoSer;
       this.descripcionSer = descripcionSer;
       this.precioSer = precioSer;
       this.estadoSer = estadoSer;
       this.serviciosContratadoses = serviciosContratadoses;
       this.eventoServicioses = eventoServicioses;
    }
   
    public int getIdSer() {
        return this.idSer;
    }
    
    public void setIdSer(int idSer) {
        this.idSer = idSer;
    }
    public String getNombreSer() {
        return this.nombreSer;
    }
    
    public void setNombreSer(String nombreSer) {
        this.nombreSer = nombreSer;
    }
    public String getTipoSer() {
        return this.tipoSer;
    }
    
    public void setTipoSer(String tipoSer) {
        this.tipoSer = tipoSer;
    }
    public String getDescripcionSer() {
        return this.descripcionSer;
    }
    
    public void setDescripcionSer(String descripcionSer) {
        this.descripcionSer = descripcionSer;
    }
    public Float getPrecioSer() {
        return this.precioSer;
    }
    
    public void setPrecioSer(Float precioSer) {
        this.precioSer = precioSer;
    }
    public String getEstadoSer() {
        return this.estadoSer;
    }
    
    public void setEstadoSer(String estadoSer) {
        this.estadoSer = estadoSer;
    }
    public Set getServiciosContratadoses() {
        return this.serviciosContratadoses;
    }
    
    public void setServiciosContratadoses(Set serviciosContratadoses) {
        this.serviciosContratadoses = serviciosContratadoses;
    }
    public Set getEventoServicioses() {
        return this.eventoServicioses;
    }
    
    public void setEventoServicioses(Set eventoServicioses) {
        this.eventoServicioses = eventoServicioses;
    }




}


