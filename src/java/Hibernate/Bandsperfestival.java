package Hibernate;
// Generated 20-apr-2013 22:03:31 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Bandsperfestival generated by hbm2java
 */
public class Bandsperfestival  implements java.io.Serializable {


     private BandsperfestivalId id;
     private Podia podia;
     private Festivals festivals;
     private Bands bands;
     private Date uur;

    public Bandsperfestival() {
    }

	
    public Bandsperfestival(BandsperfestivalId id, Podia podia, Festivals festivals, Bands bands) {
        this.id = id;
        this.podia = podia;
        this.festivals = festivals;
        this.bands = bands;
    }
    public Bandsperfestival(BandsperfestivalId id, Podia podia, Festivals festivals, Bands bands, Date uur) {
       this.id = id;
       this.podia = podia;
       this.festivals = festivals;
       this.bands = bands;
       this.uur = uur;
    }
   
    public BandsperfestivalId getId() {
        return this.id;
    }
    
    public void setId(BandsperfestivalId id) {
        this.id = id;
    }
    public Podia getPodia() {
        return this.podia;
    }
    
    public void setPodia(Podia podia) {
        this.podia = podia;
    }
    public Festivals getFestivals() {
        return this.festivals;
    }
    
    public void setFestivals(Festivals festivals) {
        this.festivals = festivals;
    }
    public Bands getBands() {
        return this.bands;
    }
    
    public void setBands(Bands bands) {
        this.bands = bands;
    }
    public Date getUur() {
        return this.uur;
    }
    
    public void setUur(Date uur) {
        this.uur = uur;
    }




}


