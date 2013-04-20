package Hibernate;
// Generated 20-apr-2013 22:03:31 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Tickets generated by hbm2java
 */
public class Tickets  implements java.io.Serializable {


     private TicketsId id;
     private Tickettypes tickettypes;
     private Festivals festivals;
     private Geregistreerdegebruikers geregistreerdegebruikers;
     private Date ticketDatum;

    public Tickets() {
    }

    public Tickets(TicketsId id, Tickettypes tickettypes, Festivals festivals, Geregistreerdegebruikers geregistreerdegebruikers, Date ticketDatum) {
       this.id = id;
       this.tickettypes = tickettypes;
       this.festivals = festivals;
       this.geregistreerdegebruikers = geregistreerdegebruikers;
       this.ticketDatum = ticketDatum;
    }
   
    public TicketsId getId() {
        return this.id;
    }
    
    public void setId(TicketsId id) {
        this.id = id;
    }
    public Tickettypes getTickettypes() {
        return this.tickettypes;
    }
    
    public void setTickettypes(Tickettypes tickettypes) {
        this.tickettypes = tickettypes;
    }
    public Festivals getFestivals() {
        return this.festivals;
    }
    
    public void setFestivals(Festivals festivals) {
        this.festivals = festivals;
    }
    public Geregistreerdegebruikers getGeregistreerdegebruikers() {
        return this.geregistreerdegebruikers;
    }
    
    public void setGeregistreerdegebruikers(Geregistreerdegebruikers geregistreerdegebruikers) {
        this.geregistreerdegebruikers = geregistreerdegebruikers;
    }
    public Date getTicketDatum() {
        return this.ticketDatum;
    }
    
    public void setTicketDatum(Date ticketDatum) {
        this.ticketDatum = ticketDatum;
    }




}


