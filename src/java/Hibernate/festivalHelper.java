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
            Query q = session.createQuery ("from festivals as festival where festival.fest_Id between '"+startID+"' and '"+endID+"'");
            festivalList = (List<Festivals>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return festivalList;
        }    
}
