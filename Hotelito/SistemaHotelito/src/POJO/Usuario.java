package POJO;
// Generated 07-30-2019 10:53:13 PM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUser;
     private Empleado empleado;
     private String usernameUser;
     private String passwordUser;

    public Usuario() {
    }

    public Usuario(int idUser, Empleado empleado, String usernameUser, String passwordUser) {
       this.idUser = idUser;
       this.empleado = empleado;
       this.usernameUser = usernameUser;
       this.passwordUser = passwordUser;
    }
   
    public int getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public String getUsernameUser() {
        return this.usernameUser;
    }
    
    public void setUsernameUser(String usernameUser) {
        this.usernameUser = usernameUser;
    }
    public String getPasswordUser() {
        return this.passwordUser;
    }
    
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }




}

