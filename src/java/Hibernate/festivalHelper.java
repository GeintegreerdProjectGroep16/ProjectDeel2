/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Eusebius
 */
public class festivalHelper {
    
    Session session = null;
    
    public festivalHelper(){
        this.session = hibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getFestivalNames(int startID, int endID){
        List<Festivals> festivalList = null;
        try{
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("from Festivals as festival where festival.festId between '"+startID+"' and '"+endID+"'");
            festivalList = (List<Festivals>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return festivalList;
        }
    
    public List getBandsByID(int festId){
        List<Bands> bandList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("from Bands as band where band.bandId in (select bandsperfestival.bands.bandId from Bandsperfestival as bandsperfestival where bandsperfestival.festivals.festId='" + festId + "')");
            bandList = (List<Bands>) q.list();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return bandList;
    }
    
    public List getTicketsByID(int festId){
        List<Tickettypes> ticketList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Tickettypes as tickets where tickets.typId in (select tickettypesperfestival.tickettypes.typId from Tickettypesperfestival as tickettypesperfestival where tickettypesperfestival.festivals.festId='" + festId + "')");
            ticketList = (List<Tickettypes>) q.list();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ticketList;
    }
}
