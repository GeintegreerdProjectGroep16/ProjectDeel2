package Hibernate;
// Generated 20-apr-2013 22:03:31 by Hibernate Tools 3.2.1.GA



/**
 * FacpercampId generated by hbm2java
 */
public class FacpercampId  implements java.io.Serializable {


     private int campId;
     private int facId;

    public FacpercampId() {
    }

    public FacpercampId(int campId, int facId) {
       this.campId = campId;
       this.facId = facId;
    }
   
    public int getCampId() {
        return this.campId;
    }
    
    public void setCampId(int campId) {
        this.campId = campId;
    }
    public int getFacId() {
        return this.facId;
    }
    
    public void setFacId(int facId) {
        this.facId = facId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FacpercampId) ) return false;
		 FacpercampId castOther = ( FacpercampId ) other; 
         
		 return (this.getCampId()==castOther.getCampId())
 && (this.getFacId()==castOther.getFacId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCampId();
         result = 37 * result + this.getFacId();
         return result;
   }   


}

