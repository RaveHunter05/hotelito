package POJO;
// Generated 08-21-2019 04:10:44 PM by Hibernate Tools 4.3.1



/**
 * DanosId generated by hbm2java
 */
public class DanosId  implements java.io.Serializable {


     private String numFact;
     private int idMue;

    public DanosId() {
    }

    public DanosId(String numFact, int idMue) {
       this.numFact = numFact;
       this.idMue = idMue;
    }
   
    public String getNumFact() {
        return this.numFact;
    }
    
    public void setNumFact(String numFact) {
        this.numFact = numFact;
    }
    public int getIdMue() {
        return this.idMue;
    }
    
    public void setIdMue(int idMue) {
        this.idMue = idMue;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DanosId) ) return false;
		 DanosId castOther = ( DanosId ) other; 
         
		 return ( (this.getNumFact()==castOther.getNumFact()) || ( this.getNumFact()!=null && castOther.getNumFact()!=null && this.getNumFact().equals(castOther.getNumFact()) ) )
 && (this.getIdMue()==castOther.getIdMue());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNumFact() == null ? 0 : this.getNumFact().hashCode() );
         result = 37 * result + this.getIdMue();
         return result;
   }   


}


