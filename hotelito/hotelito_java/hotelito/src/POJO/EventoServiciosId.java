package POJO;
// Generated 08-11-2019 01:00:59 AM by Hibernate Tools 4.3.1



/**
 * EventoServiciosId generated by hbm2java
 */
public class EventoServiciosId  implements java.io.Serializable {


     private int idEven;
     private int idSer;

    public EventoServiciosId() {
    }

    public EventoServiciosId(int idEven, int idSer) {
       this.idEven = idEven;
       this.idSer = idSer;
    }
   
    public int getIdEven() {
        return this.idEven;
    }
    
    public void setIdEven(int idEven) {
        this.idEven = idEven;
    }
    public int getIdSer() {
        return this.idSer;
    }
    
    public void setIdSer(int idSer) {
        this.idSer = idSer;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EventoServiciosId) ) return false;
		 EventoServiciosId castOther = ( EventoServiciosId ) other; 
         
		 return (this.getIdEven()==castOther.getIdEven())
 && (this.getIdSer()==castOther.getIdSer());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdEven();
         result = 37 * result + this.getIdSer();
         return result;
   }   


}


