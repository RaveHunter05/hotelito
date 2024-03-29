package POJO;
// Generated 08-21-2019 04:10:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCli;
     private String cedulaCli;
     private String prinombreCli;
     private String segnombreCli;
     private String priapellidoCli;
     private String segapellidoCli;
     private int edadCli;
     private String telefonoCli;
     private String emailCli;
     private String tituloCli;
     private String tipoCli;
     private String estadoCli;
     private Set reservacions = new HashSet(0);
     private Set eventos = new HashSet(0);
     private Set reservacions_1 = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String prinombreCli, String priapellidoCli, int edadCli) {
        this.prinombreCli = prinombreCli;
        this.priapellidoCli = priapellidoCli;
        this.edadCli = edadCli;
    }
    public Cliente(String cedulaCli, String prinombreCli, String segnombreCli, String priapellidoCli, String segapellidoCli, int edadCli, String telefonoCli, String emailCli, String tituloCli, String tipoCli, String estadoCli, Set reservacions, Set eventos, Set reservacions_1) {
       this.cedulaCli = cedulaCli;
       this.prinombreCli = prinombreCli;
       this.segnombreCli = segnombreCli;
       this.priapellidoCli = priapellidoCli;
       this.segapellidoCli = segapellidoCli;
       this.edadCli = edadCli;
       this.telefonoCli = telefonoCli;
       this.emailCli = emailCli;
       this.tituloCli = tituloCli;
       this.tipoCli = tipoCli;
       this.estadoCli = estadoCli;
       this.reservacions = reservacions;
       this.eventos = eventos;
       this.reservacions_1 = reservacions_1;
    }
   
    public Integer getIdCli() {
        return this.idCli;
    }
    
    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }
    public String getCedulaCli() {
        return this.cedulaCli;
    }
    
    public void setCedulaCli(String cedulaCli) {
        this.cedulaCli = cedulaCli;
    }
    public String getPrinombreCli() {
        return this.prinombreCli;
    }
    
    public void setPrinombreCli(String prinombreCli) {
        this.prinombreCli = prinombreCli;
    }
    public String getSegnombreCli() {
        return this.segnombreCli;
    }
    
    public void setSegnombreCli(String segnombreCli) {
        this.segnombreCli = segnombreCli;
    }
    public String getPriapellidoCli() {
        return this.priapellidoCli;
    }
    
    public void setPriapellidoCli(String priapellidoCli) {
        this.priapellidoCli = priapellidoCli;
    }
    public String getSegapellidoCli() {
        return this.segapellidoCli;
    }
    
    public void setSegapellidoCli(String segapellidoCli) {
        this.segapellidoCli = segapellidoCli;
    }
    public int getEdadCli() {
        return this.edadCli;
    }
    
    public void setEdadCli(int edadCli) {
        this.edadCli = edadCli;
    }
    public String getTelefonoCli() {
        return this.telefonoCli;
    }
    
    public void setTelefonoCli(String telefonoCli) {
        this.telefonoCli = telefonoCli;
    }
    public String getEmailCli() {
        return this.emailCli;
    }
    
    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }
    public String getTituloCli() {
        return this.tituloCli;
    }
    
    public void setTituloCli(String tituloCli) {
        this.tituloCli = tituloCli;
    }
    public String getTipoCli() {
        return this.tipoCli;
    }
    
    public void setTipoCli(String tipoCli) {
        this.tipoCli = tipoCli;
    }
    public String getEstadoCli() {
        return this.estadoCli;
    }
    
    public void setEstadoCli(String estadoCli) {
        this.estadoCli = estadoCli;
    }
    public Set getReservacions() {
        return this.reservacions;
    }
    
    public void setReservacions(Set reservacions) {
        this.reservacions = reservacions;
    }
    public Set getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set eventos) {
        this.eventos = eventos;
    }
    public Set getReservacions_1() {
        return this.reservacions_1;
    }
    
    public void setReservacions_1(Set reservacions_1) {
        this.reservacions_1 = reservacions_1;
    }




}


