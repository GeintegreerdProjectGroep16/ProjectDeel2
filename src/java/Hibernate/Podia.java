package Hibernate;
// Generated 20-apr-2013 22:03:31 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Podia generated by hbm2java
 */
public class Podia  implements java.io.Serializable {


     private Integer podId;
     private String podOmschr;
     private String podLocatie;
     private Set bandsperfestivals = new HashSet(0);

    public Podia() {
    }

	
    public Podia(String podOmschr, String podLocatie) {
        this.podOmschr = podOmschr;
        this.podLocatie = podLocatie;
    }
    public Podia(String podOmschr, String podLocatie, Set bandsperfestivals) {
       this.podOmschr = podOmschr;
       this.podLocatie = podLocatie;
       this.bandsperfestivals = bandsperfestivals;
    }
   
    public Integer getPodId() {
        return this.podId;
    }
    
    public void setPodId(Integer podId) {
        this.podId = podId;
    }
    public String getPodOmschr() {
        return this.podOmschr;
    }
    
    public void setPodOmschr(String podOmschr) {
        this.podOmschr = podOmschr;
    }
    public String getPodLocatie() {
        return this.podLocatie;
    }
    
    public void setPodLocatie(String podLocatie) {
        this.podLocatie = podLocatie;
    }
    public Set getBandsperfestivals() {
        return this.bandsperfestivals;
    }
    
    public void setBandsperfestivals(Set bandsperfestivals) {
        this.bandsperfestivals = bandsperfestivals;
    }




}


