package POJO;
// Generated 08-01-2019 03:43:22 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private String numFact;
     private int idCli;
     private Date fecha;
     private String formaPago;
     private Float costoServicios;
     private Float costoDanos;
     private Float subtototal;
     private Float totalFact;
     private Set danoses = new HashSet(0);
     private Set serviciosContratadoses = new HashSet(0);

    public Factura() {
    }

	
    public Factura(String numFact, int idCli) {
        this.numFact = numFact;
        this.idCli = idCli;
    }
    public Factura(String numFact, int idCli, Date fecha, String formaPago, Float costoServicios, Float costoDanos, Float subtototal, Float totalFact, Set danoses, Set serviciosContratadoses) {
       this.numFact = numFact;
       this.idCli = idCli;
       this.fecha = fecha;
       this.formaPago = formaPago;
       this.costoServicios = costoServicios;
       this.costoDanos = costoDanos;
       this.subtototal = subtototal;
       this.totalFact = totalFact;
       this.danoses = danoses;
       this.serviciosContratadoses = serviciosContratadoses;
    }
   
    public String getNumFact() {
        return this.numFact;
    }
    
    public void setNumFact(String numFact) {
        this.numFact = numFact;
    }
    public int getIdCli() {
        return this.idCli;
    }
    
    public void setIdCli(int idCli) {
        this.idCli = idCli;
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
    public Float getCostoServicios() {
        return this.costoServicios;
    }
    
    public void setCostoServicios(Float costoServicios) {
        this.costoServicios = costoServicios;
    }
    public Float getCostoDanos() {
        return this.costoDanos;
    }
    
    public void setCostoDanos(Float costoDanos) {
        this.costoDanos = costoDanos;
    }
    public Float getSubtototal() {
        return this.subtototal;
    }
    
    public void setSubtototal(Float subtototal) {
        this.subtototal = subtototal;
    }
    public Float getTotalFact() {
        return this.totalFact;
    }
    
    public void setTotalFact(Float totalFact) {
        this.totalFact = totalFact;
    }
    public Set getDanoses() {
        return this.danoses;
    }
    
    public void setDanoses(Set danoses) {
        this.danoses = danoses;
    }
    public Set getServiciosContratadoses() {
        return this.serviciosContratadoses;
    }
    
    public void setServiciosContratadoses(Set serviciosContratadoses) {
        this.serviciosContratadoses = serviciosContratadoses;
    }




}


