package POJO;
// Generated 08-01-2019 03:43:22 PM by Hibernate Tools 4.3.1



/**
 * ReservacionHabitacionesId generated by hbm2java
 */
public class ReservacionHabitacionesId  implements java.io.Serializable {


     private int idRes;
     private int idHab;

    public ReservacionHabitacionesId() {
    }

    public ReservacionHabitacionesId(int idRes, int idHab) {
       this.idRes = idRes;
       this.idHab = idHab;
    }
   
    public int getIdRes() {
        return this.idRes;
    }
    
    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }
    public int getIdHab() {
        return this.idHab;
    }
    
    public void setIdHab(int idHab) {
        this.idHab = idHab;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ReservacionHabitacionesId) ) return false;
		 ReservacionHabitacionesId castOther = ( ReservacionHabitacionesId ) other; 
         
		 return (this.getIdRes()==castOther.getIdRes())
 && (this.getIdHab()==castOther.getIdHab());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdRes();
         result = 37 * result + this.getIdHab();
         return result;
   }   


}


